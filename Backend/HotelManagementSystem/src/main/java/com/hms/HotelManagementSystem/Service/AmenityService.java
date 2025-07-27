package com.hms.HotelManagementSystem.Service;

import com.hms.HotelManagementSystem.Model.Amenity;
import com.hms.HotelManagementSystem.Model.Maintenance;
import com.hms.HotelManagementSystem.Repository.AmenityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmenityService {
    @Autowired
    AmenityRepository amenityRepository;

    public Amenity createAmenity(Amenity amenity) {
        if (amenityRepository.existsById(amenity.getAmenityName())) {
            throw new IllegalArgumentException("Amenity already exists");
        }
        return amenity;
    }

    public List<Amenity> amenityList() {
        List<Amenity> amenities = amenityRepository.findAll();

        return amenities;
    }

    public boolean deleteAmenity(int amenityId) {
        if (amenityRepository.existsById(amenityId)) {
            amenityRepository.deleteById(amenityId);

            return  true;
        }
        return false;
    }
}
