package com.hms.HotelManagementSystem.Controller;

import com.hms.HotelManagementSystem.Model.RoomType;
import com.hms.HotelManagementSystem.Repository.RoomTypeRepository;
import com.hms.HotelManagementSystem.Service.RoomTypeService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/room-type")
public class RoomTypeController {
    @Autowired
    RoomTypeService roomTypeService;

    @Autowired
    RoomTypeRepository roomTypeRepository;

    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<?> createRoomType(@Valid @RequestBody RoomType roomType) {
        try {
            RoomType createType = roomTypeService.createRoomType(roomType);
            Map<String, Object> response = new HashMap<>();
            response.put("success", true);
            response.put("message", "Room Type created successfully");
            response.put("data", createType);

            return ResponseEntity.ok(response);
        }
        catch (Exception ex) {
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "Error creating Room Typer: " + ex.getMessage());

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    @GetMapping("/all-room-types")
    @ResponseBody
    public List<RoomType> roomTypeList() {
        List<RoomType> roomTypes = roomTypeService.roomTypeList();
        return roomTypes;
    }

    @PostMapping("/delete/{typeId}")
    public ResponseEntity<?> deleteRoomType(@PathVariable int typeId) {
        try {
            if (roomTypeRepository.existsById(typeId)) {
                boolean deleteType = roomTypeService.deleteRoomType(typeId);
                Map<String, Object> response = new HashMap<>();
                response.put("success", true);
                response.put("message", "Room Type deleted successfully");
                response.put("data", deleteType);

                return ResponseEntity.ok(response);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Room Type with ID " + typeId + " not found");
            }
        }
        catch (Exception ex) {
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "Error deleting Room Type: " + ex.getMessage());

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
}
