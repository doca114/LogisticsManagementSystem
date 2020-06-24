package main;

import java.util.UUID;

public class Vendor {

    private String vendorName;
    private UUID vendorID;
    private UUID supplierID;
    private String vendorContact;

    public String getVendorName() { return vendorName; }
    public UUID getVendorID() { return vendorID; }
    public UUID getSupplierID() { return supplierID; }
    public String getVendorContact() { return vendorContact; }

}
