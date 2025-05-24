package com.hms.HotelManagementSystem.Repository;

import com.hms.HotelManagementSystem.Model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
    boolean existsByRoomNumber (int roomNumber);
}
