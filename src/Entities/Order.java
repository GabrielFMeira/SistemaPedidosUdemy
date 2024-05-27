package Entities;

import entities_enum.OrderStatus;

import java.util.Date;

public class Order {

    private Date moment;
    private OrderStatus status;

    private OrderItem items;
    private Client client;

    public Order() {
    }

    public Order(Date moment, OrderStatus status, OrderItem items, Client client) {
        this.moment = moment;
        this.status = status;
        this.items = items;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public OrderItem getItems() {
        return items;
    }

    public void setItems(OrderItem items) {
        this.items = items;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
