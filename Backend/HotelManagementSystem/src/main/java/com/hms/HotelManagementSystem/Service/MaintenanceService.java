package com.hms.HotelManagementSystem.Service;

import com.hms.HotelManagementSystem.Model.Maintenance;
import com.hms.HotelManagementSystem.Model.Room;
import com.hms.HotelManagementSystem.Repository.MaintenanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaintenanceService {
    @Autowired
    MaintenanceRepository maintenanceRepository;


    public Maintenance createMaintenance(Maintenance maintenance) {
        return maintenance;
    }

    public List<Maintenance> maintenanceList() {
        List<Maintenance> maintenances = maintenanceRepository.findAll();

        return maintenances;
    }

    public boolean deleteMaintenance(int maintenanceId) {
        if (maintenanceRepository.existsById(maintenanceId)) {
            maintenanceRepository.deleteById(maintenanceId);

            return  true;
        }
        return false;
    }
}
