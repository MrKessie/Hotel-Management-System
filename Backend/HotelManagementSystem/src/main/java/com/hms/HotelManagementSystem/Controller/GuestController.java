package com.hms.HotelManagementSystem.Controller;

import com.hms.HotelManagementSystem.Model.Guest;
import com.hms.HotelManagementSystem.Repository.GuestRepository;
import com.hms.HotelManagementSystem.Service.GuestService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.PostExchange;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/guest")
public class GuestController {
    @Autowired
    GuestRepository guestRepository;

    @Autowired
    GuestService guestService;

    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<?> createGuest(@Valid @RequestBody Guest guest) {
        try {
            Guest createGuest = guestService.createGuest(guest);
            Map<String, Object> response = new HashMap<>();
            response.put("success", true);
            response.put("message", "Guest created successfully");
            response.put("data", createGuest);

            return ResponseEntity.ok(response);
        }
        catch (Exception ex) {
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "Error creating guest: " + ex.getMessage());

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    @GetMapping("/guest-list")
    public List<Guest> guestList() {
        List<Guest> guests = guestService.guestList();
        return guests;
    }

    @PostMapping("/delete")
    public ResponseEntity<?> deleteGuest(@PathVariable int guestId) {
        try {
            if (guestRepository.existsById(guestId)) {
                boolean deletedGuest = guestService.deleteGuest(guestId);
                Map<String, Object> response = new HashMap<>();
                response.put("success", true);
                response.put("message", "Guest deleted successfully");
                response.put("data", deletedGuest);

                return ResponseEntity.ok(response);
            }
            else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Guest with ID: " + guestId + " not found.");
            }
        }
        catch (Exception ex) {
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "Error deleting guest: " + ex.getMessage());

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
}
