package com.hms.HotelManagementSystem.Controller;

import com.hms.HotelManagementSystem.Model.User;
import com.hms.HotelManagementSystem.Repository.UserRepository;
import com.hms.HotelManagementSystem.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<?> createUser(@Valid @RequestBody User user) {
        try {
            User createUser = userService.createUser(user);
            Map<String, Object> response = new HashMap<>();
            response.put("success", true);
            response.put("message", "User created successfully");
            response.put("data", createUser);

            return ResponseEntity.ok(response);
        }
        catch (Exception ex) {
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "Error creating user: " + ex.getMessage());

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    @GetMapping("/all-users")
    @ResponseBody
    public List<User> userList() {
        List<User> users = userService.userList();
        return users;
    }

    @PostMapping("/delete/{userId}")
    @ResponseBody
    public ResponseEntity<?> deleteUser(@PathVariable int userId) {
        try {
            if (userRepository.existsById(userId)) {
                boolean deletedUser = userService.deleteUser(userId);
                Map<String, Object> response = new HashMap<>();
                response.put("success", true);
                response.put("message", "User deleted successfully");
                response.put("data", deletedUser);

                return ResponseEntity.ok(response);
            }
            else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User with ID: " + userId + " not found.");
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
