package Classes;

enum Categories {
    ELECTRONICS,
    CLOTHING,
    BOOKS,
    BEAUTY,
    SPORTS,
}

public class Product {
    private String name;
    private double price;
    private int stock;
    private Categories category;

    public Product(String name, double price, int stock, Categories category) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public Categories getCategory() {
        return category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void displayDetails() {
        System.out.println("Nume: " + name);
        System.out.println("Pret: " + price);
        System.out.println("Stoc disponibil: " + stock);
        System.out.println("Categorie: " + category);
    }
}
