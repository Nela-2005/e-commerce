package com.e_commerce.Inventory.Management.System.Entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Name is required!")
    @Size(min = 3,max = 100)
    private String name;

    @Size(min = 10,max = 500)
    private String description;

    @Min(1)
    @NotNull
    private Double price;

    @Column(name = "stock_quantity")
    @Min(0)
    @NotNull
    private Integer stockQuantity;

    @JoinColumn(name = "category_id",nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public @Size(min = 10, max = 500) String getDescription() {
        return description;
    }

    public void setDescription(@Size(min = 10, max = 500) String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Name is required!") @Size(min = 3, max = 100) String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Name is required!") @Size(min = 3, max = 100) String name) {
        this.name = name;
    }

    public @Min(1) @NotNull Double getPrice() {
        return price;
    }

    public void setPrice(@Min(1) @NotNull Double price) {
        this.price = price;
    }

    public @Min(0) @NotNull Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(@Min(0) @NotNull Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}