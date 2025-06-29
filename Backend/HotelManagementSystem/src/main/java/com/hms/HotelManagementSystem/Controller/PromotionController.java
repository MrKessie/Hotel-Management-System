package com.hms.HotelManagementSystem.Controller;

import com.hms.HotelManagementSystem.Model.Promotion;
import com.hms.HotelManagementSystem.Repository.PromotionRepository;
import com.hms.HotelManagementSystem.Service.PromotionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/promotion")
public class PromotionController {
    @Autowired
    PromotionRepository promotionRepository;

    @Autowired
    PromotionService promotionService;

    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<?> createPromotion(@Valid @RequestBody Promotion promotion) {
        try{
            Promotion createPromotion = promotionService.createPromotion(promotion);
            Map<String, Object> response = new HashMap<>();
            response.put("success", true);
            response.put("message", "Promotion created successfully");
            response.put("data", createPromotion);

            return ResponseEntity.ok(response);
        }
        catch (Exception ex) {
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "Error creating Promotion: " + ex.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }


    @GetMapping("/all-promotions")
    public List<Promotion> promotionList() {
        List<Promotion> promotions = promotionService.promotionList();
        return promotions;
    }

    @PostMapping("/delete/{promotionId}")
    public ResponseEntity<?> deletePromotion(@PathVariable int promotionId) {
        try {
            if (promotionRepository.existsById(promotionId)) {
                boolean deletePromotion = promotionService.deletePromotion(promotionId);
                Map<String, Object> response = new HashMap<>();
                response.put("success", true);
                response.put("message", "Promotion deleted successfully");
                response.put("data", deletePromotion);

                return ResponseEntity.ok(response);
            }
            else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Promotion with ID: " + promotionId + " not found.");
            }
        }
        catch (Exception ex) {
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "Error deleting Promotion: " + ex.getMessage());

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }

    }
}
