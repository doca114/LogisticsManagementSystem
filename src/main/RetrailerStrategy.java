package main;

import java.util.UUID;

public class RetrailerStrategy implements ICustomerStrategy {

    String retrailerName;
    UUID retrailerID;
    String retrailerContact;

    public RetrailerStrategy(String retrailerName, UUID retrailerID, String retrailerContact) {
        this.retrailerName = retrailerName;
        this.retrailerID = retrailerID;
        this.retrailerContact = retrailerContact;
    }

    @Override
    public String Sale(String productName, int productAmount, double productPrice) {
        return "Product name:"+productName+" Amount:"+productAmount+" Price:"+productPrice+" sold to a Retrailer.";
    }
}
