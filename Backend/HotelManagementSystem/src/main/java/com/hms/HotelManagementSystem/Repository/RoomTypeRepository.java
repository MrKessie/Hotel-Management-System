package com.hms.HotelManagementSystem.Repository;

import com.hms.HotelManagementSystem.Model.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomTypeRepository extends JpaRepository<RoomType, Integer> {
    boolean existsByName(String name);
}
