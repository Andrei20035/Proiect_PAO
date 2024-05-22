package Classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Order History for User: ").append(this.name).append("\n");
        for (Order order : orderHistory) {
            result.append("Date: ").append(order.getOrderDateTime()).append("\n");
            result.append("Products:\n");
            for (Product product : order.getProducts()) {
                result.append("- ").append(product.getName()).append(" | Price: ").append(product.getPrice()).append("\n");
            }
            result.append("--------------------\n");
        }
        return result.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User other = (User) o;
        return Objects.equals(name, other.name) &&
                Objects.equals(email, other.email) &&
                Objects.equals(address, other.address) &&
                Objects.equals(birthDate, other.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, address, birthDate);
    }
}
