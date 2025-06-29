package com.hms.HotelManagementSystem.Repository;

import com.hms.HotelManagementSystem.Model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {

}
