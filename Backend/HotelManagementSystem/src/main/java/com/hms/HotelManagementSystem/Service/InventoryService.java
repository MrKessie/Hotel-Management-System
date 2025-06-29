package com.hms.HotelManagementSystem.Service;

import com.hms.HotelManagementSystem.Model.Inventory;
import com.hms.HotelManagementSystem.Repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InventoryService {
    @Autowired
    InventoryRepository inventoryRepository;


    public Inventory createInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    public List<Inventory> inventoryList() {
        List<Inventory> inventories = (List<Inventory>) inventoryRepository.findAll();
        return inventories;
    }

    public boolean deleteInventory(int inventoryId) {
        if(inventoryRepository.existsById(inventoryId)) {
            inventoryRepository.deleteById(inventoryId);
            return true;
        }
        return false;
    }
}
