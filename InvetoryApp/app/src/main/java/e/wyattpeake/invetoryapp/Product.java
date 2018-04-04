package e.wyattpeake.invetoryapp;

public class Product {

    private int id, quantity;
    private float price;
    private String productName;

    public Product(int id, int quantity, float price, String productName) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
