package main;

import java.util.UUID;

public class WholesalerStrategy implements ICustomerStrategy {

    String wholesalerName;
    UUID wholesalerID;
    String wholesalerContact;

    public WholesalerStrategy(String wholesalerName, UUID wholesalerID, String wholesalerContact) {
        this.wholesalerName = wholesalerName;
        this.wholesalerID = wholesalerID;
        this.wholesalerContact = wholesalerContact;
    }

    @Override
    public String Sale(String productName, int productAmount, double productPrice) {
        return "Product name:"+productName+" Amount:"+productAmount+" Price:"+productPrice+" sold to a Wholesaler.";
    }
}
