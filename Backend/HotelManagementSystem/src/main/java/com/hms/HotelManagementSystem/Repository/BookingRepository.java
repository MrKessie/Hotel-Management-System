package com.hms.HotelManagementSystem.Repository;

import com.hms.HotelManagementSystem.Model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
}
