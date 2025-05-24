package com.hms.HotelManagementSystem.Controller;

import com.hms.HotelManagementSystem.Model.Room;
import com.hms.HotelManagementSystem.Repository.RoomRepository;
import com.hms.HotelManagementSystem.Service.RoomService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api/room")
public class RoomController {
    @Autowired
    RoomService roomService;

    @Autowired
    RoomRepository roomRepository;

    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<?> createRoom(@Valid @RequestBody Room room) {
        try {
            Room createRoom = roomService.createRoom(room);
            Map<String, Object> response = new HashMap<>();
            response.put("success", true);
            response.put("message", "Room created successfully");
            response.put("data", createRoom);

            return ResponseEntity.ok(response);
        }
        catch (Exception ex) {
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "Error creating room: " + ex.getMessage());

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    @GetMapping("/room-list")
    @ResponseBody
    public List<Room> roomList() {
        List<Room> rooms = (List<Room>) roomService.roomList();

        return rooms;
    }

    @PostMapping("/delete/{roomId}")
    @ResponseBody
    public ResponseEntity<?> deleteRoom(@PathVariable int roomId) {
        try {
            if (roomRepository.existsById(roomId)) {
                boolean deletedRoom = roomService.deleteRoom(roomId);
                Map<String, Object> response = new HashMap<>();
                response.put("success", true);
                response.put("message", "UsRoomer deleted successfully");
                response.put("data", deletedRoom);

                return ResponseEntity.ok(response);
            }
            else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Room with ID: " + roomId + " not found.");
            }
        }
        catch (Exception ex) {
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "Error deleting Room: " + ex.getMessage());

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
}
