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
        System.out.println(" ");
        for (Product product : products) {
            System.out.println(product.getTitle() + " | " + product.getTitle() +
                    " | " + product.getDescription() + " | " + product.getPrice() +
                    " | " + product.getArticleNumber() + " | " + product.category());

        }

    }

    public void showProductInfo(int articleNumber) {
        System.out.println(" ");
        for (Product product : products) {
            if (product.getArticleNumber() == articleNumber) {
                System.out.println(product.getTitle() + " | " + product.getTitle() +
                        " | " + product.getDescription() + " | " + product.getPrice() +
                        " | " + product.getArticleNumber() + " | " + product.category());

            }
        }
    }
}
