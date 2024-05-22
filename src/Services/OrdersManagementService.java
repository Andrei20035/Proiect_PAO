package Services;

import Classes.Order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrdersManagementService {
    private List<Order> orderList;

    public OrdersManagementService() {
        this.orderList = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orderList.add(order);
        System.out.println("Comanda a fost adaugata cu succes.");
    }

    public void removeOrder(Order order) {
        orderList.remove(order);
        System.out.println("Comanda a fost eliminata.");
    }

    // Metoda pentru a obtine o comanda in functie de ID-ul ei (neimplementata inca)
    // ...

    public void displayAllOrdersWithinRange(LocalDateTime start, LocalDateTime end) {
        System.out.println("Orders: ");
        for (Order order : orderList) {
            LocalDateTime orderDateTime = order.getOrderDateTime();
            if ((orderDateTime.isAfter(start) && orderDateTime.isBefore(end)) || orderDateTime.isEqual(end)
                    || orderDateTime.isEqual(start)) {
                System.out.println(order.toString());
                System.out.println("---------------------------------");
            }
        }
    }

    public void displayAllOrders() {
        System.out.println("Orders: ");
        for (Order order : orderList) {
            System.out.println(order.toString());
            System.out.println("---------------------------------");
        }
    }
}
