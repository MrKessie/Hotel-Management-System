package com.hms.HotelManagementSystem.Service;

import com.hms.HotelManagementSystem.Model.Guest;
import com.hms.HotelManagementSystem.Repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {
    @Autowired
    GuestRepository guestRepository;

    public Guest createGuest(Guest guest) {
        if (guestRepository.existsByIdNumber(guest.getIdNumber())) {
            throw new IllegalArgumentException("Guest already exists!");
        }

        return guestRepository.save(guest);
    }

    public List<Guest> guestList() {
        List<Guest> guests = (List<Guest>) guestRepository.findAll();
        return guests;
    }

    public boolean deleteGuest(int guestId) {
        if (guestRepository.existsById(guestId)) {
            guestRepository.deleteById(guestId);
            return true;
        }
        return false;
    }
}
