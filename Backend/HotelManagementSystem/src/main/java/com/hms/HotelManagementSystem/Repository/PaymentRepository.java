package com.hms.HotelManagementSystem.Repository;

import com.hms.HotelManagementSystem.Model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
