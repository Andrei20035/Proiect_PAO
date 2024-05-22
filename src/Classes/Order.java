package Classes;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

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

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Order date and time: ").append(orderDateTime).append("\n");
        result.append("Products:\n");
        for (Product product : products) {
            result.append("- ").append(product.getName()).append(": ").append(product.getPrice()).append("\n");
        }
        result.append("Total price: ").append(calculateTotalPrice(null, null));
        return result.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order other = (Order) o;
        return Objects.equals(products, other.products) &&
                Objects.equals(orderDateTime, other.orderDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, orderDateTime);
    }



}
