package com.hms.HotelManagementSystem.Service;

import com.hms.HotelManagementSystem.Model.Department;
import com.hms.HotelManagementSystem.Model.Promotion;
import com.hms.HotelManagementSystem.Repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionService {
    @Autowired
    PromotionRepository promotionRepository;


    public Promotion createPromotion(Promotion promotion) {
        if (promotionRepository.existsByPromoCode(promotion.getPromoCode())) {
            throw new IllegalArgumentException("Promo Code already exists");
        }
        return promotionRepository.save(promotion);
    }

    public List<Promotion> promotionList() {
        List<Promotion> promotions = (List<Promotion>) promotionRepository.findAll();
        return promotions;
    }

    public boolean deletePromotion(int promotionId) {
        if(promotionRepository.existsById(promotionId)) {
            promotionRepository.deleteById(promotionId);
            return true;
        }
        return false;
    }
}
