package com.hms.HotelManagementSystem.Repository;

import com.hms.HotelManagementSystem.Model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
