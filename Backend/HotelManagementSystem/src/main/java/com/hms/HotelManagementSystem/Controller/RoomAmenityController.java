package com.hms.HotelManagementSystem.Controller;

import com.hms.HotelManagementSystem.Model.RoomAmenity;
import com.hms.HotelManagementSystem.Repository.RoomAmenityRepository;
import com.hms.HotelManagementSystem.Service.RoomAmenityService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/room-amenity")
public class RoomAmenityController {
    @Autowired
    RoomAmenityRepository roomAmenityRepository;

    @Autowired
    RoomAmenityService roomAmenityService;

    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<?> createRoomAmenity(@Valid @RequestBody RoomAmenity roomAmenity) {
        try{
            RoomAmenity createRoomAmenity = roomAmenityService.createRoomAmenity(roomAmenity);
            Map<String, Object> response = new HashMap<>();
            response.put("success", true);
            response.put("message", "Room Amenity created successfully");
            response.put("data", createRoomAmenity);

            return ResponseEntity.ok(response);
        }
        catch (Exception ex) {
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "Error creating Room Amenity: " + ex.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }


    @GetMapping("/all-room-amenities")
    public List<RoomAmenity> RoomAmenityList() {
        List<RoomAmenity> roomAmenities = roomAmenityService.roomAmenityList();
        return roomAmenities;
    }

    @PostMapping("/delete/{roomAmenityId}")
    public ResponseEntity<?> deleteRoomAmenity(@PathVariable int roomAmenityId) {
        try {
            if (roomAmenityRepository.existsById(roomAmenityId)) {
                boolean deleteRoomAmenity = roomAmenityService.deleteRoomAmenity(roomAmenityId);
                Map<String, Object> response = new HashMap<>();
                response.put("success", true);
                response.put("message", "Room Amenity deleted successfully");
                response.put("data", deleteRoomAmenity);

                return ResponseEntity.ok(response);
            }
            else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Room Amenity with ID: " + roomAmenityId + " not found.");
            }
        }
        catch (Exception ex) {
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "Error deleting Room Amenity: " + ex.getMessage());

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }

    }
}
