package com.hms.HotelManagementSystem.Controller;

import com.hms.HotelManagementSystem.Model.Department;
import com.hms.HotelManagementSystem.Model.Inventory;
import com.hms.HotelManagementSystem.Repository.DepartmentRepository;
import com.hms.HotelManagementSystem.Service.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {
    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    DepartmentService departmentService;


    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<?> createDepartment(@Valid @RequestBody Department department) {
        try{
            Department createDepartment = departmentService.createDepartment(department);
            Map<String, Object> response = new HashMap<>();
            response.put("success", true);
            response.put("message", "Department created successfully");
            response.put("data", createDepartment);

            return ResponseEntity.ok(response);
        }
        catch (Exception ex) {
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "Error creating Department: " + ex.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }


    @GetMapping("/all-departments")
    public List<Department> departmentList() {
        List<Department> departments = departmentService.DepartmentList();
        return departments;
    }

    @PostMapping("/delete/{departmentId}")
    public ResponseEntity<?> deleteDepartment(@PathVariable int departmentId) {
        try {
            if (departmentRepository.existsById(departmentId)) {
                boolean deletedDepartment = departmentService.deleteDepartment(departmentId);
                Map<String, Object> response = new HashMap<>();
                response.put("success", true);
                response.put("message", "Department deleted successfully");
                response.put("data", deletedDepartment);

                return ResponseEntity.ok(response);
            }
            else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Department with ID: " + departmentId + " not found.");
            }
        }
        catch (Exception ex) {
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "Error deleting Department: " + ex.getMessage());

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }

    }
}
