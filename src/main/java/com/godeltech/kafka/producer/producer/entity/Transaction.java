package com.godeltech.kafka.producer.producer.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Transaction {
    private String bank;
    private Long clientId;
    private OrderType orderType;
    private Integer quantity;
    private Double price;
    private LocalDateTime createdAt;
}
