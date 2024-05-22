package Classes;

import Enums.PaymentType;

import java.util.Objects;

public class PaymentMethod {
    private PaymentType name;
    private String description;

    public PaymentMethod(PaymentType name, String description) {
        this.name = name;
        this.description = description;
    }

    public PaymentType getName() {
        return name;
    }

    public void setName(PaymentType name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " using " + name);
    }

    public String toString() {
        return "Payment Method: " + name + "\nDescription: " + description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PaymentMethod)) return false;
        PaymentMethod other = (PaymentMethod) o;
        return name == other.name &&
                Objects.equals(description, other.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }


}

