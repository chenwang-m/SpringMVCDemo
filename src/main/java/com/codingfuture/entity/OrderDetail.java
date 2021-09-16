package com.codingfuture.entity;

public class OrderDetail {
    private int id;
    private int orderId;
    private int itemId;
    private int itemNmu;
    private Item items;

    public Item getItems() {
        return items;
    }

    public void setItems(Item items) {
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getItemNmu() {
        return itemNmu;
    }

    public void setItemNmu(int itemNmu) {
        this.itemNmu = itemNmu;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", itemId=" + itemId +
                ", itemNmu=" + itemNmu +
                ", items=" + items +
                '}';
    }
}
