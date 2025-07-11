package com.e_commerce.Inventory.Management.System.Dto;

import com.e_commerce.Inventory.Management.System.Enums.OrderStatus;
import com.e_commerce.Inventory.Management.System.Enums.PaymentStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;


public class OrderDto {

    @JsonProperty("customer_id")
    private Long customerId;
    @JsonProperty("payment_status")
    private PaymentStatus paymentStatus;
    @JsonProperty("order_items")
    private List<OrderItemDto> orderItemDtoList;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public List<OrderItemDto> getOrderItemDtoList() {
        return orderItemDtoList;
    }

    public void setOrderItemDtoList(List<OrderItemDto> orderItemDtoList) {
        this.orderItemDtoList = orderItemDtoList;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}