package Classes;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;

public class Report {

    private final LocalDateTime startDate;
    private final LocalDateTime endDate;
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

    public String toString() {
        return "Report from " + startDate + " to " + endDate + ":\n" + salesData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Report)) return false;
        Report other = (Report) o;
        return Objects.equals(startDate, other.startDate) &&
                Objects.equals(endDate, other.endDate) &&
                Objects.equals(salesData, other.salesData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startDate, endDate, salesData);
    }


}

