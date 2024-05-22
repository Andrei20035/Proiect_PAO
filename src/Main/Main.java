package Main;

import Classes.DiscountCoupon;


public class Main {
    public static void main(String[] args) {
//        List<Permissions> permissionsList = Arrays.asList(Permissions.MANAGE_PRODUCTS, Permissions.GENERATE_REPORTS);
//        AdminUser adminUser = new AdminUser("Admin", "andrei_rusu03@yahoo.com", "Str. Mihai Eminescu, nr. 1",
//                LocalDate.of(1999, 3, 3), true, permissionsList, 1);
//        System.out.println(adminUser.toString());

        DiscountCoupon coupon = new DiscountCoupon("WX25H8", 30);
        System.out.println(coupon.toString());


    }

}
