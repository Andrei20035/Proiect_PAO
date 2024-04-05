package Classes;

enum PaymentType {
    CREDIT_CARD,
    DEBIT_CARD,
    PAYPAL,
    BANK_TRANSFER,
    CRYPTO,
}

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

    public void displayPaymentMethodDetails() {
        System.out.println("Payment Method: " + name);
        System.out.println("Description: " + description);
    }
}

