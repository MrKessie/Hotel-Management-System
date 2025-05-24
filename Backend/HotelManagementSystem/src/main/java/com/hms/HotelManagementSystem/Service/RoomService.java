package com.hms.HotelManagementSystem.Service;

import com.hms.HotelManagementSystem.Model.Room;
import com.hms.HotelManagementSystem.Repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    RoomRepository roomRepository;

    public Room createRoom(Room room) {
        if (roomRepository.existsByRoomNumber(room.getRoomNumber())) {
            throw new IllegalArgumentException("Username already exists");
        }

        return room;
    }

    public List<Room> roomList() {
        List<Room> rooms = roomRepository.findAll();

        return rooms;
    }

    public boolean deleteRoom(int roomId) {
        if (roomRepository.existsById(roomId)) {
            roomRepository.deleteById(roomId);

            return  true;
        }
        return false;
    }


}
