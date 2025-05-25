package com.hms.HotelManagementSystem.Service;

import com.hms.HotelManagementSystem.Model.Reservation;
import com.hms.HotelManagementSystem.Model.User;
import com.hms.HotelManagementSystem.Repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    @Autowired
    ReservationRepository reservationRepository;

    public Reservation createReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public List<Reservation> reservationList() {
        List<Reservation> reservations = (List<Reservation>) reservationRepository.findAll();
        return reservations;
    }

    public boolean deleteReservation(int reservationId) {
        if (reservationRepository.existsById(reservationId)) {
            reservationRepository.deleteById(reservationId);
            return true;
        }
        return false;
    }
}
