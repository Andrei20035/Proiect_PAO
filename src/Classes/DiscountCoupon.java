package Classes;

import java.time.LocalDate;

public class DiscountCoupon {
    private String code;
    private double discountPercentage;

    public DiscountCoupon(String code, double discountPercentage) {
        this.code = code;
        this.discountPercentage = discountPercentage;
    }

    public String getCode() {
        return code;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public double applyDiscountBasedOnBirthdate(User user, double orderTotal) {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = user.getBirthDate();

        if (currentDate.getMonth() == birthDate.getMonth() && currentDate.getDayOfMonth() == birthDate.getDayOfMonth()) {
            return orderTotal * (1 - discountPercentage / 100);
        }

        return orderTotal;
    }
}

