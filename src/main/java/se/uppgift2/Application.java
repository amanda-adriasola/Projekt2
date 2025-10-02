package se.uppgift2;

import java.util.ArrayList;
import java.util.List;


public class Application {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added");
    }

    public void listAllProducts() {
        for (Product product : products) {
            System.out.println(product.getTitle());
            System.out.println(product.getDescription());
            System.out.println(product.getPrice());
            System.out.println(product.getArticleNumber());
            System.out.println(product.category());
        }

    }

    public void showProductInfo(int articleNumber) {
        for (Product product : products) {
            if (product.getArticleNumber() == articleNumber) {
                System.out.println(product.getTitle());
                System.out.println(product.getDescription());
                System.out.println(product.getPrice());
                System.out.println(product.getArticleNumber());
                System.out.println(product.category());
            }
        }
    }
}
