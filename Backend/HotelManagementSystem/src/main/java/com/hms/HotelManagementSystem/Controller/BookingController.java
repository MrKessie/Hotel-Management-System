package com.hms.HotelManagementSystem.Controller;

import com.hms.HotelManagementSystem.Model.Booking;
import com.hms.HotelManagementSystem.Repository.BookingRepository;
import com.hms.HotelManagementSystem.Service.BookingService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/booking")
public class BookingController {
    @Autowired
    BookingService bookingService;

    @Autowired
    BookingRepository bookingRepository;


    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<?> createBooking(@Valid @RequestBody Booking booking) {
        try {
            Booking createBooking = bookingService.createBooking(booking);
            Map<String, Object> response = new HashMap<>();
            response.put("success", true);
            response.put("message", "Booking created successfully");
            response.put("data", createBooking);

            return ResponseEntity.ok(response);
        }
        catch (Exception ex) {
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "Error creating booking: " + ex.getMessage());

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    @GetMapping("/all-users")
    @ResponseBody
    public List<Booking> bookingList() {
        List<Booking> bookings = bookingService.bookingList();
        return bookings;
    }

    @PostMapping("/delete/{bookingId}")
    @ResponseBody
    public ResponseEntity<?> deleteBooking(@PathVariable int bookingId) {
        try {
            if (bookingRepository.existsById(bookingId)) {
                boolean deletedBooking = bookingService.deleteBooking(bookingId);
                Map<String, Object> response = new HashMap<>();
                response.put("success", true);
                response.put("message", "Booking deleted successfully");
                response.put("data", deletedBooking);

                return ResponseEntity.ok(response);
            }
            else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Booking with ID: " + bookingId + " not found.");
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
