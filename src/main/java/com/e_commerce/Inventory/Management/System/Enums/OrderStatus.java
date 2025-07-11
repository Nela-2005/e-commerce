package com.e_commerce.Inventory.Management.System.Enums;

    public enum OrderStatus {
        NEW,          // Order just created
        PROCESSING,   // Being prepared
        SHIPPED,      // Sent out
        DELIVERED,    // Received by customer
        CANCELLED     // Cancelled before shipment
    }

