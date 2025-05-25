package com.hms.HotelManagementSystem.Model;

import com.hms.HotelManagementSystem.Enum.Role;
import com.hms.HotelManagementSystem.Enum.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull(message = "First Name cannot be null")
    @Size(min = 2, max = 15,  message = "First Name must have at least 2 characters")
    private String firstName;

    @Column(nullable = false)
    @NotNull(message = "Last Name cannot be null")
    @Size(min = 2, max = 15,  message = "Last Name must have at least 2 characters")
    private String lastName;

    @Column(nullable = false)
    @NotNull(message = "Username cannot be null")
    @Size(min = 2, max = 15,  message = "Username must have at least 2 characters")
    private String username;

    @Column(nullable = false)
    @Email(message = "Email must be valid")
    private String email;

    @Column(nullable = false)
    @Size(min = 8, max = 15, message = "Password must be at least 8 characters")
    private String password;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdDate;

    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime updatedDate;


    public User() {
    }

    public User(@NotNull(message = "First Name cannot be null") String firstName, @NotNull(message = "Last Name cannot be null") String lastName, @NotNull(message = "Username cannot be null") String username, String email, String password, String phoneNumber, Role role, Status status, LocalDateTime createdDate, LocalDateTime updatedDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.role = role;
        this.status = status;
        this.createdDate = LocalDateTime.now();
        this.updatedDate = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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
