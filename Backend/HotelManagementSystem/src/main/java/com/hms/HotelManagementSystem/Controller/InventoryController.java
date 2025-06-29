package com.hms.HotelManagementSystem.Controller;

import com.hms.HotelManagementSystem.Model.Inventory;
import com.hms.HotelManagementSystem.Repository.InventoryRepository;
import com.hms.HotelManagementSystem.Service.InventoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {
    @Autowired
    InventoryService inventoryService;

    @Autowired
    InventoryRepository inventoryRepository;


    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<?> createInventory(@Valid @RequestBody Inventory inventory) {
        try{
            Inventory createInventory = inventoryService.createInventory(inventory);
            Map<String, Object> response = new HashMap<>();
            response.put("success", true);
            response.put("message", "Inventory created successfully");
            response.put("data", createInventory);

            return ResponseEntity.ok(response);
        }
        catch (Exception ex) {
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "Error creating Inventory: " + ex.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }


    @GetMapping("/all-inventories")
    public List<Inventory> inventoryList() {
        List<Inventory> inventories = inventoryService.inventoryList();
        return inventories;
    }

    @PostMapping("/delete/{inventoryId}")
    public ResponseEntity<?> deleteInventory(@PathVariable int inventoryId) {
        try {
            if (inventoryRepository.existsById(inventoryId)) {
                boolean deletedInventory = inventoryService.deleteInventory(inventoryId);
                Map<String, Object> response = new HashMap<>();
                response.put("success", true);
                response.put("message", "Inventory deleted successfully");
                response.put("data", deletedInventory);

                return ResponseEntity.ok(response);
            }
            else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Booking with ID: " + inventoryId + " not found.");
            }
        }
        catch (Exception ex) {
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "Error deleting inventory: " + ex.getMessage());

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }

    }
}
