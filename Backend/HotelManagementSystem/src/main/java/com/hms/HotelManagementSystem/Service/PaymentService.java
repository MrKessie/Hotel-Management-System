package com.hms.HotelManagementSystem.Service;

import com.hms.HotelManagementSystem.Model.Payment;
import com.hms.HotelManagementSystem.Model.User;
import com.hms.HotelManagementSystem.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;

    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    public List<Payment> paymentList() {
        List<Payment> payments = (List<Payment>) paymentRepository.findAll();
        return payments;
    }

    public boolean deletePayment(int paymentId) {
        if (paymentRepository.existsById(paymentId)) {
            paymentRepository.deleteById(paymentId);
            return true;
        }
        return false;
    }
}
