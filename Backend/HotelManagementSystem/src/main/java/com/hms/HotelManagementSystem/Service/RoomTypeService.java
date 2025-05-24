package com.hms.HotelManagementSystem.Service;

import com.hms.HotelManagementSystem.Model.RoomType;
import com.hms.HotelManagementSystem.Repository.RoomTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomTypeService {
    @Autowired
    RoomTypeRepository roomTypeRepository;

    public RoomType createRoomType(RoomType roomType) {
        if (roomTypeRepository.existsByName(roomType.getName())) {
            throw new IllegalArgumentException("Room Type already exists");
        }

        return roomTypeRepository.save(roomType);
    }

    public List<RoomType> roomTypeList() {
        List<RoomType> roomTypes = (List<RoomType>) roomTypeRepository.findAll();
        return roomTypes;
    }

    public boolean deleteRoomType(int typeId) {
        if (roomTypeRepository.existsById(typeId)) {
            roomTypeRepository.deleteById(typeId);
            return true;
        }

        return false;
    }
}
