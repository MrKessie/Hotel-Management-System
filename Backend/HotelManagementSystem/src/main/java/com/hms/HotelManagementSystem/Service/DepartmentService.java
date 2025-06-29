package com.hms.HotelManagementSystem.Service;

import com.hms.HotelManagementSystem.Model.Department;
import com.hms.HotelManagementSystem.Model.Inventory;
import com.hms.HotelManagementSystem.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;


    public Department createDepartment(Department department) {
        if (departmentRepository.existsByDepartmentName(department.getDepartmentName())) {
            throw new IllegalArgumentException("Department name already exists");
        }
        return departmentRepository.save(department);
    }

    public List<Department> DepartmentList() {
        List<Department> departments = (List<Department>) departmentRepository.findAll();
        return departments;
    }

    public boolean deleteDepartment(int departmentId) {
        if(departmentRepository.existsById(departmentId)) {
            departmentRepository.deleteById(departmentId);
            return true;
        }
        return false;
    }
}
