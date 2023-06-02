package application.entities;

public class Product {
    public String name;
    public double price;
    public int quanlity;

    public double totalValueInStock() {
        return price * quanlity;
    }
    public void addProducts(int quanlity) {
        this.quanlity += quanlity;
    }

    public void removeProducts(int quanlity) {
        this.quanlity -= quanlity;
    }

    public String toString() {
        return name
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + quanlity
                + " units, Total: $"
                + String.format("%.2f", totalValueInStock());
    }
}
