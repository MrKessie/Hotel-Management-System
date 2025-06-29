package com.hms.HotelManagementSystem.Service;

import com.hms.HotelManagementSystem.Model.Maintenance;
import com.hms.HotelManagementSystem.Model.Review;
import com.hms.HotelManagementSystem.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    @Autowired
    ReviewRepository reviewRepository;

    public Review createReview(Review review) {
        return review;
    }

    public List<Review> reviewList() {
        List<Review> reviews = reviewRepository.findAll();

        return reviews;
    }

    public boolean deleteReview(int reviewId) {
        if (reviewRepository.existsById(reviewId)) {
            reviewRepository.deleteById(reviewId);

            return  true;
        }
        return false;
    }
}
