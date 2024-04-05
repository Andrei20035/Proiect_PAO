package Classes;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private List<Product> products;
    private LocalDateTime orderDateTime;
    // private static int OrderID = 1;

    public Order(List<Product> products) {
        this.products = products;
        this.orderDateTime = LocalDateTime.now();
        // this.OrderID = OrderID++;
    }

    public List<Product> getProducts() {
        return products;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }

    public void setOrderDateTime(LocalDateTime orderDateTime) {
        this.orderDateTime = orderDateTime;
    } 

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double calculateTotalPrice(DiscountCoupon coupon, User user) {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }

        if (coupon != null && user != null) {
            totalPrice = coupon.applyDiscountBasedOnBirthdate(user, totalPrice);
        }

        return totalPrice;
    }

    public void displayOrderDetails() {
        System.out.println("Order date and time: " + orderDateTime);
        System.out.println("Products: ");
        for (Product product : products) {
            System.out.println("- " + product.getName() + ": " + product.getPrice());
        }
        System.out.println("Total price: " + calculateTotalPrice(null, null));
    }

}
