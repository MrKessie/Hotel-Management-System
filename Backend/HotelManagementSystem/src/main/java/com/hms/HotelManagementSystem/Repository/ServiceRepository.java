package com.hms.HotelManagementSystem.Repository;

import com.hms.HotelManagementSystem.Model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Integer> {

}
