package com.hms.HotelManagementSystem.Model;

import com.hms.HotelManagementSystem.Enum.Shift;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int staffId;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    @NotNull(message = "Position cannot be null")
    @Size(min = 2, max = 15,  message = "Position must have at least 2 characters")
    private String position;
    @OneToOne
    @JoinColumn(name = "department_id")
    private Department department;
    @NotNull(message = "Hire date cannot be null!")
    private LocalDate hireDate;
    private double salary;
    @NotNull(message = "Shift cannot be null")
    @Enumerated(EnumType.STRING)
    private Shift shift;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdDate;
    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime updatedDate;

    public Staff() {
    }

    public Staff(User user, @NotNull(message = "Position cannot be null") String position, Department department, @NotNull(message = "Hire date cannot be null!") LocalDate hireDate, double salary, @NotNull(message = "Shift cannot be null") Shift shift, LocalDateTime createdDate, LocalDateTime updatedDate) {
        this.user = user;
        this.position = position;
        this.department = department;
        this.hireDate = hireDate;
        this.salary = salary;
        this.shift = shift;
        this.createdDate = LocalDateTime.now();
        this.updatedDate = LocalDateTime.now();
    }


    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }
}
