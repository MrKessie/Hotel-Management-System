package com.hms.HotelManagementSystem.Controller;

import com.hms.HotelManagementSystem.Model.Department;
import com.hms.HotelManagementSystem.Model.Maintenance;
import com.hms.HotelManagementSystem.Repository.MaintenanceRepository;
import com.hms.HotelManagementSystem.Service.MaintenanceService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/maintenance")
public class MaintenanceController {
    @Autowired
    MaintenanceRepository maintenanceRepository;

    @Autowired
    MaintenanceService maintenanceService;

    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<?> createMaintenance(@Valid @RequestBody Maintenance maintenance) {
        try{
            Maintenance createMaintenance = maintenanceService.createMaintenance(maintenance);
            Map<String, Object> response = new HashMap<>();
            response.put("success", true);
            response.put("message", "Maintenance created successfully");
            response.put("data", createMaintenance);

            return ResponseEntity.ok(response);
        }
        catch (Exception ex) {
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "Error creating Maintenance: " + ex.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }


    @GetMapping("/all-maintenances")
    public List<Maintenance> MaintenanceList() {
        List<Maintenance> maintenances = maintenanceService.maintenanceList();
        return maintenances;
    }

    @PostMapping("/delete/{maintenanceId}")
    public ResponseEntity<?> deleteMaintenance(@PathVariable int maintenanceId) {
        try {
            if (maintenanceRepository.existsById(maintenanceId)) {
                boolean deleteMaintenance = maintenanceService.deleteMaintenance(maintenanceId);
                Map<String, Object> response = new HashMap<>();
                response.put("success", true);
                response.put("message", "Maintenance deleted successfully");
                response.put("data", deleteMaintenance);

                return ResponseEntity.ok(response);
            }
            else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Promotion with ID: " + maintenanceId + " not found.");
            }
        }
        catch (Exception ex) {
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "Error deleting Maintenance: " + ex.getMessage());

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }

    }
}
