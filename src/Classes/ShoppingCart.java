package Classes;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<Product, Integer> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void addProduct(Product product, int quantity) {
        if (items.containsKey(product)) {
            int currentQuantity = items.get(product);
            items.put(product, currentQuantity + quantity);
        } else {
            items.put(product, quantity);
        }
    }

    public void removeProduct(Product product, int quantity) {
        if (items.containsKey(product)) {
            int currentQuantity = items.get(product);
            int newQuantity = currentQuantity - quantity;
            if (newQuantity <= 0) {
                items.remove(product);
            } else {
                items.put(product, newQuantity);
            }
        }
    }

    public void displayCart() {
        System.out.println("Shopping cart: ");
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            System.out.println("Product: " + product.getName() + ", Quantity: " + quantity);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Shopping cart:\n");
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            result.append("Product: ").append(product.getName()).append("\nQuantity: ").append(quantity).append("\n");
        }
        return result.toString();
    }
}
