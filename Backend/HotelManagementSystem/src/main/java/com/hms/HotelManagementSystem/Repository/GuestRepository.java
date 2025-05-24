package com.hms.HotelManagementSystem.Repository;

import com.hms.HotelManagementSystem.Model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Integer> {
    boolean existsByIdNumber(String IdNumber);
}
