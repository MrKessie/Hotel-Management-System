package com.hms.HotelManagementSystem.Repository;

import com.hms.HotelManagementSystem.Model.RoomAmenity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomAmenityRepository extends JpaRepository<RoomAmenity, Integer> {
}
