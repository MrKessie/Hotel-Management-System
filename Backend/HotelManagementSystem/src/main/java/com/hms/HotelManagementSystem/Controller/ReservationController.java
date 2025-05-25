package com.hms.HotelManagementSystem.Controller;

import com.hms.HotelManagementSystem.Model.Reservation;
import com.hms.HotelManagementSystem.Model.User;
import com.hms.HotelManagementSystem.Repository.ReservationRepository;
import com.hms.HotelManagementSystem.Service.ReservationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/reservation")
public class ReservationController {
    @Autowired
    ReservationService reservationService;

    @Autowired
    ReservationRepository reservationRepository;

    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<?> createReservation(@Valid @RequestBody Reservation reservation) {
        try {
            Reservation createReservation = reservationService.createReservation(reservation);
            Map<String, Object> response = new HashMap<>();
            response.put("success", true);
            response.put("message", "Reservation created successfully");
            response.put("data", createReservation);

            return ResponseEntity.ok(response);
        }
        catch (Exception ex) {
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "Error creating reservation: " + ex.getMessage());

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    @GetMapping("/all-reservations")
    @ResponseBody
    public List<Reservation> reservationList() {
        List<Reservation> reservations = reservationService.reservationList();
        return reservations;
    }

    @PostMapping("/delete/{reservationId}")
    @ResponseBody
    public ResponseEntity<?> deleteReservation(@PathVariable int reservationId) {
        try {
            if (reservationRepository.existsById(reservationId)) {
                boolean deletedReservation = reservationService.deleteReservation(reservationId);
                Map<String, Object> response = new HashMap<>();
                response.put("success", true);
                response.put("message", "Reservation deleted successfully");
                response.put("data", deletedReservation);

                return ResponseEntity.ok(response);
            }
            else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Reservation with ID: " + reservationId + " not found.");
            }
        }
        catch (Exception ex) {
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "Error deleting reservation: " + ex.getMessage());

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
}
