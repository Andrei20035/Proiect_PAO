package Classes;

import java.time.LocalDate;
import java.util.Objects;

public class DiscountCoupon {
    private String code;
    private double discountPercentage;
    // expiration date

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

    @Override
    public String toString() {
        return "Discount coupon of " + (int)getDiscountPercentage() + "%" + " is " + getCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DiscountCoupon)) return false;
        DiscountCoupon other = (DiscountCoupon) o;
        return Double.compare(other.discountPercentage, discountPercentage) == 0 &&
                Objects.equals(code, other.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, discountPercentage);
    }


}

