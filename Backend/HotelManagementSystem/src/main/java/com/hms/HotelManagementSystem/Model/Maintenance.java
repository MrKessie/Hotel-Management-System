package com.hms.HotelManagementSystem.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int maintenanceId;
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;
    @OneToOne
    @JoinColumn(name = "staff_id")
    private Staff staff;
    @NotNull(message = "Description cannot be null")
    @Size(min = 10, message = "Description must have at least 10 characters")
    private String issueDesc;
    @Column(nullable = false, updatable = false)
    private LocalDate reportDate;
    @NotNull(message = "Status cannot be null")
    private String status;
    @Column(nullable = false, updatable = false)
    private LocalDate completionDate;
    @NotNull(message = "Cost cannot be null")
    private double cost;


    public Maintenance() {
    }

    public Maintenance(Room room, Staff staff, @NotNull(message = "Description cannot be null") String issueDesc, LocalDate reportDate, @NotNull(message = "Status cannot be null") String status, LocalDate completionDate, @NotNull(message = "Cost cannot be null") double cost) {
        this.room = room;
        this.staff = staff;
        this.issueDesc = issueDesc;
        this.reportDate = reportDate;
        this.status = status;
        this.completionDate = completionDate;
        this.cost = cost;
    }

    public int getMaintenanceId() {
        return maintenanceId;
    }

    public void setMaintenanceId(int maintenanceId) {
        this.maintenanceId = maintenanceId;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public String getIssueDesc() {
        return issueDesc;
    }

    public void setIssueDesc(String issueDesc) {
        this.issueDesc = issueDesc;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(LocalDate completionDate) {
        this.completionDate = completionDate;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
