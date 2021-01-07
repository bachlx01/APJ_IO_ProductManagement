import java.io.Serializable;

public class Product implements Serializable {
    private String productID;
    private String productName;
    private String brand;
    private int price;
    private String describe;

    public Product() {
    }

    public Product(String productID, String productName, String brand, int price) {
        this.productID = productID;
        this.productName = productName;
        this.brand = brand;
        this.price = price;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "ID: " + productID + "; Name: " + productName + "; Brand: " + brand + "; Price: " + price;
    }
}
