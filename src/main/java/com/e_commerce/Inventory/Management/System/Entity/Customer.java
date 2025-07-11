package com.e_commerce.Inventory.Management.System.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Name is required!")
    private String name;

    @NotBlank(message = "Surname is required!")
    private String surname;

    @NotBlank(message = "Email is required!")
    private String email;

    @NotBlank(message = "Address is required!")
    private String address;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public @NotBlank(message = "Address is required!") String getAddress() {
        return address;
    }

    public void setAddress(@NotBlank(message = "Address is required!") String address) {
        this.address = address;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public @NotBlank(message = "Email is required!") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email is required!") String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Name is required!") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Name is required!") String name) {
        this.name = name;
    }

    public @NotBlank(message = "Surname is required!") String getSurname() {
        return surname;
    }

    public void setSurname(@NotBlank(message = "Surname is required!") String surname) {
        this.surname = surname;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
