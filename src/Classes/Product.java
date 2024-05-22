package Classes;

import Enums.Categories;

import java.util.Objects;

public class Product {
    private final String name;
    private double price;
    private int stock;
    private final Categories category;

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

    public String toString() {
        return "Name: " + name + "\nPrice: " + price + "\nStock: " + stock + "\nCategory: " + category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product other = (Product) o;
        return Double.compare(other.price, price) == 0 &&
                stock == other.stock &&
                Objects.equals(name, other.name) &&
                category == other.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, stock, category);
    }


}
