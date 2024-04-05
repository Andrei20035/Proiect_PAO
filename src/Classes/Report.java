package Classes;

import java.time.LocalDateTime;
import java.util.Map;

public class Report {

    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Map<Product, Integer> salesData; // <Product, quantity sold>

    public Report(LocalDateTime startDate, LocalDateTime endDate, Map<Product, Integer> salesData) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.salesData = salesData;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public Map<Product, Integer> getSalesData() {
        return salesData;
    }

    public void generateReport() {
        System.out.println("Sales Report from " + startDate + " to " + endDate + ":");
        int totalRevenue = 0;
        for (Map.Entry<Product, Integer> entry : salesData.entrySet()) {
            Product product = entry.getKey();
            int quantitySold = entry.getValue();
            double revenue = product.getPrice() * quantitySold;
            totalRevenue += revenue;
            System.out.println("Product: " + product.getName() + ", Quantity Sold: " + quantitySold
                    + ", Revenue: " + revenue);
        }
        System.out.println("Total revenue: " + totalRevenue);
    }
}
