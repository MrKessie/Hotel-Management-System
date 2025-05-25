package com.hms.HotelManagementSystem.Service;

import com.hms.HotelManagementSystem.Model.Booking;
import com.hms.HotelManagementSystem.Model.User;
import com.hms.HotelManagementSystem.Repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    @Autowired
    BookingRepository bookingRepository;

    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public List<Booking> bookingList() {
        List<Booking> bookings = (List<Booking>) bookingRepository.findAll();
        return bookings;
    }

    public boolean deleteBooking(int bookingId) {
        if (bookingRepository.existsById(bookingId)) {
            bookingRepository.deleteById(bookingId);
            return true;
        }
        return false;
    }
}
