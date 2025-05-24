package com.hms.HotelManagementSystem.Model;

import com.hms.HotelManagementSystem.Enum.IdType;
import com.hms.HotelManagementSystem.Enum.Role;
import com.hms.HotelManagementSystem.Enum.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int guestId;
    @NotNull(message = "First Name cannot be null")
    @Size(min = 2, max = 15,  message = "First Name must have at least 2 characters")
    private String firstName;

    @Column(nullable = false)
    @NotNull(message = "Last Name cannot be null")
    @Size(min = 2, max = 15,  message = "Last Name must have at least 2 characters")
    private String lastName;

    @Column(nullable = false)
    @Email(message = "Email must be valid")
    private String email;

    @Column(nullable = false)
    private String phoneNumber;

    @NotNull(message = "Address cannot be null")
    @Size(min = 11, max = 12,  message = "Address must have at least 11 characters")
    private String address;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private IdType idType;

    @Column(nullable = false)
    private String idNumber;

    @Column(nullable = false)

    @NotNull(message = "Nationality cannot be null")
    @Size(min = 2,  message = "Address must have at least 2 characters")
    private String nationality;

    @NotNull(message = "VIP status cannot be null")
    @Size(min = 11, max = 12,  message = "Address must have at least 2 characters")
    private String VIPStatus;

    @CreationTimestamp
    @Past
    @Column(nullable = false)
    private LocalDate dob;

    @Column(nullable = true)
    private String notes;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdDate;

    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime updatedDate;


    public Guest(@NotNull(message = "First Name cannot be null") String firstName, @NotNull(message = "Last Name cannot be null") String lastName, String email, String phoneNumber, @NotNull(message = "Address cannot be null") String address, IdType idType, String idNumber, @NotNull(message = "Nationality cannot be null") String nationality, @NotNull(message = "VIP status cannot be null") String VIPStatus, LocalDate dob, String notes, LocalDateTime createdDate, LocalDateTime updatedDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.idType = idType;
        this.idNumber = idNumber;
        this.nationality = nationality;
        this.VIPStatus = VIPStatus;
        this.dob = dob;
        this.notes = notes;
        this.createdDate = LocalDateTime.now();
        this.updatedDate = LocalDateTime.now();
    }


    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public IdType getIdType() {
        return idType;
    }

    public void setIdType(IdType idType) {
        this.idType = idType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getVIPStatus() {
        return VIPStatus;
    }

    public void setVIPStatus(String VIPStatus) {
        this.VIPStatus = VIPStatus;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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
