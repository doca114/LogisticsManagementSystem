package main;

import java.util.UUID;

public class Product {

    private UUID productID;
    private String productName;
    private String productType;
    private int productAmount ;
    private int productPrice;

    public UUID getProductID() {
        return productID;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) { this.productName = productName; }
    public String getProductType() { return productType; }
    public void setProductType() { this.productType = productType; }
    public int getProductAmount() { return productAmount; }
    public void setProductAmount() { this.productAmount = productAmount; }
    public int getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(int productPrice) { this.productPrice = productPrice; }

    public Product(UUID productID, String productName, String productType, int productAmount, int productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productType = productType;
        this.productAmount = productAmount;
        this.productPrice = productPrice;
    }

    public static class ProductBuilder {

        private UUID productID;
        private String productName;
        private String productType;
        private int productAmount ;
        private int productPrice;

        public ProductBuilder(UUID productID, String productName, String productType, int productAmount, int productPrice) {
            this.productID = productID;
            this.productName = productName;
            this.productType = productType;
            this.productAmount = productAmount;
            this.productPrice = productPrice;
        }

        public ProductBuilder setProductName(String productName)
        {
            this.productName = productName;
            return this;
        }

        public ProductBuilder setProductType(String productType)
        {
            this.productType = productType;
            return this;
        }

        public ProductBuilder setProductAmount(int productAmount)
        {
            this.productAmount = productAmount;
            return this;
        }

        public ProductBuilder setProductPrice(int productPrice)
        {
            this.productPrice = productPrice;
            return this;
        }

        public Product build()
        {
            return new Product(productID,productName,productType,productAmount,productPrice);
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", productName='" + productName + '\'' +
                ", productType=" + productType +
                ", productAmount=" + productAmount +
                ", productPrice=" + productPrice +
                '}';
    }
}
