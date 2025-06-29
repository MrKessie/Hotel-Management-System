package com.hms.HotelManagementSystem.Repository;

import com.hms.HotelManagementSystem.Model.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Integer> {
    boolean existsByPromoCode (String promoCode);
}
