package Classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;
    private String address;
    private List<Order> orderHistory;
    private LocalDate birthDate;

    User(String name, String email, String address, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.birthDate = birthDate;
        this.orderHistory = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate newBirthDate) {
        this.birthDate = newBirthDate;
    }

    public void displayOrderHistory() {
        System.out.println("Order History for User: " + this.name);
        for (Order order : orderHistory) {
            // System.out.println("Order ID: " + order.getOrderId());
            System.out.println("Date: " + order.getOrderDateTime());
            System.out.println("Products:");
            for (Product product : order.getProducts()) {
                System.out.println("- " + product.getName() + " | Price: " + product.getPrice());
            }
            System.out.println("--------------------");
        }
    }


}
