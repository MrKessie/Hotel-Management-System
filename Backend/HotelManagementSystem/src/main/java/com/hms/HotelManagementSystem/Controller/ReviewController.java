package com.hms.HotelManagementSystem.Controller;

import com.hms.HotelManagementSystem.Model.Maintenance;
import com.hms.HotelManagementSystem.Model.Review;
import com.hms.HotelManagementSystem.Repository.ReviewRepository;
import com.hms.HotelManagementSystem.Service.ReviewService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/review")
public class ReviewController {
    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    ReviewService reviewService;

    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<?> createReview(@Valid @RequestBody Review review) {
        try{
            Review createReview = reviewService.createReview(review);
            Map<String, Object> response = new HashMap<>();
            response.put("success", true);
            response.put("message", "Review created successfully");
            response.put("data", createReview);

            return ResponseEntity.ok(response);
        }
        catch (Exception ex) {
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "Error creating Review: " + ex.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }


    @GetMapping("/all-reviews")
    public List<Review> reviewList() {
        List<Review> reviews = reviewService.reviewList();
        return reviews;
    }

    @PostMapping("/delete/{reviewId}")
    public ResponseEntity<?> deleteReview(@PathVariable int reviewId) {
        try {
            if (reviewRepository.existsById(reviewId)) {
                boolean deleteMaintenance = reviewService.deleteReview(reviewId);
                Map<String, Object> response = new HashMap<>();
                response.put("success", true);
                response.put("message", "Review deleted successfully");
                response.put("data", deleteMaintenance);

                return ResponseEntity.ok(response);
            }
            else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Review with ID: " + reviewId + " not found.");
            }
        }
        catch (Exception ex) {
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "Error deleting Review: " + ex.getMessage());

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }

    }
}
