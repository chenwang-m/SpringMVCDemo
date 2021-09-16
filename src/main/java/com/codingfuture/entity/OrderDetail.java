package com.codingfuture.entity;

import lombok.Data;

@Data
public class OrderDetail {
    private int id;
    private int orderId;
    private int itemId;
    private int itemNmu;
    private Item items;
}
