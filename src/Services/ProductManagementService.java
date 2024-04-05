package Services;

import Classes.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductManagementService {
    private List<Product> productList;

    public ProductManagementService() {
        this.productList = new ArrayList<>();
    }

    // Adaugare produs 
    public void addProduct(Product product) {
        productList.add(product);
        System.out.println("Produsul " + product.getName() + " a fost adaugat cu succes.");

    }

    public void deleteProduct(Product product) {
        productList.remove(product);
        System.out.println("Produsul " + product.getName() + " a fost sters cu succes.");
    }

    public void updateStock(Product product, int newStock) {
        product.setStock(newStock);
        System.out.println("Stocul pentru produsul: " + product.getName() + " a fost adaugat cu succes.");
    }

    public void displayAllProducts() {
        System.out.println("Produse disponibile in magazin: ");
        for (Product product : productList) {
            product.displayDetails();;
            System.out.println("-----------------------------------");
        }

    }
}
