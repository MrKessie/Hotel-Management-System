package com.hms.HotelManagementSystem.Controller;

import com.hms.HotelManagementSystem.Model.Amenity;
import com.hms.HotelManagementSystem.Model.Maintenance;
import com.hms.HotelManagementSystem.Repository.AmenityRepository;
import com.hms.HotelManagementSystem.Service.AmenityService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/amenity")
public class AmenityController {
    @Autowired
    AmenityRepository amenityRepository;

    @Autowired
    AmenityService amenityService;

    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<?> createAmenity(@Valid @RequestBody Amenity amenity) {
        try{
            Amenity createAmenity = amenityService.createAmenity(amenity);
            Map<String, Object> response = new HashMap<>();
            response.put("success", true);
            response.put("message", "Amenity created successfully");
            response.put("data", createAmenity);

            return ResponseEntity.ok(response);
        }
        catch (Exception ex) {
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "Error creating Amenity: " + ex.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }


    @GetMapping("/all-amenities")
    public List<Amenity> AmenityList() {
        List<Amenity> amenities = amenityService.amenityList();
        return amenities;
    }

    @PostMapping("/delete/{amenityId}")
    public ResponseEntity<?> deleteAmenity(@PathVariable int amenityId) {
        try {
            if (amenityRepository.existsById(amenityId)) {
                boolean deleteAmenity = amenityService.deleteAmenity(amenityId);
                Map<String, Object> response = new HashMap<>();
                response.put("success", true);
                response.put("message", "Amenity deleted successfully");
                response.put("data", deleteAmenity);

                return ResponseEntity.ok(response);
            }
            else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Promotion with ID: " + amenityId + " not found.");
            }
        }
        catch (Exception ex) {
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "Error deleting Amenity: " + ex.getMessage());

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }

    }
}
