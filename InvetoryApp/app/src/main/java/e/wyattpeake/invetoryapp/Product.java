package e.wyattpeake.invetoryapp;

public class Product {

    private String id, quantity;
    private String price;
    private String productName;
    private String location;
    private String expiration;


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", quantity='" + quantity + '\'' +
                ", price='" + price + '\'' +
                ", productName='" + productName + '\'' +
                ", location='" + location + '\'' +
                ", expiration='" + expiration + '\'' +
                '}';
    }
}
