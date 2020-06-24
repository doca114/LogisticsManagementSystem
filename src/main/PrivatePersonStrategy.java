package main;

import java.util.UUID;

public class PrivatePersonStrategy implements ICustomerStrategy {

    String privatepersonName;
    UUID privatepersonID;
    String privatepersonContact;

    public PrivatePersonStrategy(String privatepersonName, UUID privatepersonID, String privatepersonContact) {
        this.privatepersonName = privatepersonName;
        this.privatepersonID = privatepersonID;
        this.privatepersonContact = privatepersonContact;
    }

    @Override
    public String Sale(String productName, int productAmount, double productPrice) {
        return "Product name:"+productName+" Amount:"+productAmount+" Price:"+productPrice+" sold to a private person.";
    }
}
