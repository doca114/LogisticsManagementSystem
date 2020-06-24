package main;

import java.util.Date;
import java.util.UUID;

public class Order {

    private UUID orderID;
    private UUID customerID;
    private UUID productID;
    private Date orderDate;
    private int orderAmount;
    private String orderState;

    public UUID getOrderID() { return orderID; }
    private UUID getCustomerID() { return customerID; }
    private UUID getProductID() { return productID; }
    public Date getOrderDate() { return orderDate; }
    public int getOrderAmount() { return orderAmount; }
    public String getOrderState() { return orderState; }

}
