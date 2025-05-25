package com.hms.HotelManagementSystem.Controller;

import com.hms.HotelManagementSystem.Model.Payment;
import com.hms.HotelManagementSystem.Repository.PaymentRepository;
import com.hms.HotelManagementSystem.Service.PaymentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @Autowired
    PaymentRepository paymentRepository;


    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<?> createUser(@Valid @RequestBody Payment payment) {
        try {
            Payment createPayment = paymentService.createPayment(payment);
            Map<String, Object> response = new HashMap<>();
            response.put("success", true);
            response.put("message", "Payment created successfully");
            response.put("data", createPayment);

            return ResponseEntity.ok(response);
        }
        catch (Exception ex) {
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "Error creating payment: " + ex.getMessage());

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    @GetMapping("/all-payments")
    @ResponseBody
    public List<Payment> paymentList() {
        List<Payment> payments = paymentService.paymentList();
        return payments;
    }

    @PostMapping("/delete/{paymentId}")
    @ResponseBody
    public ResponseEntity<?> deletePayment(@PathVariable int paymentId) {
        try {
            if (paymentRepository.existsById(paymentId)) {
                boolean deletedPayment = paymentService.deletePayment(paymentId);
                Map<String, Object> response = new HashMap<>();
                response.put("success", true);
                response.put("message", "Payment deleted successfully");
                response.put("data", deletedPayment);

                return ResponseEntity.ok(response);
            }
            else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Payment with ID: " + paymentId + " not found.");
            }
        }
        catch (Exception ex) {
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "Error deleting user: " + ex.getMessage());

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
}
