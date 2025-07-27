package com.hms.HotelManagementSystem.Service;

import com.hms.HotelManagementSystem.Model.Maintenance;
import com.hms.HotelManagementSystem.Model.RoomAmenity;
import com.hms.HotelManagementSystem.Repository.RoomAmenityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomAmenityService {
    @Autowired
    RoomAmenityRepository roomAmenityRepository;

    public RoomAmenity createRoomAmenity(RoomAmenity roomAmenity) {
        return roomAmenity;
    }

    public List<RoomAmenity> roomAmenityList() {
        List<RoomAmenity> roomAmenities = roomAmenityRepository.findAll();

        return roomAmenities;
    }

    public boolean deleteRoomAmenity(int roomAmenityId) {
        if (roomAmenityRepository.existsById(roomAmenityId)) {
            roomAmenityRepository.deleteById(roomAmenityId);

            return  true;
        }
        return false;
    }
}
