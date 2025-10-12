package se.uppgift2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    private final List<Product> products = new ArrayList<>();

    private final Scanner scanner = new Scanner(System.in);

    public void addProduct(Product product) {
        products.add(product);
    }

    public void listAllProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available");
            return;
        }
        System.out.println("---ALL PRODUCTS---");
        for (Product product : products) {
            System.out.println("Title " + product.getTitle());
            System.out.println("Article Number " + product.getArticleNumber());
            System.out.println("Description " + product.getDescription());
            System.out.println("Price " + product.getPrice());
            System.out.println("Category " + product.category());
            System.out.println("-------------------");
        }


    }

    public void showProductInfo(int articleNumber) {
        System.out.println(" ");
        for (Product product : products) {
            if (product.getArticleNumber() == articleNumber) {
                System.out.println("Title " + product.getTitle());
                System.out.println("Article Number " + product.getArticleNumber());
                System.out.println("Description " + product.getDescription());
                System.out.println("Price " + product.getPrice());
                System.out.println("Category " + product.category());
                System.out.println("-------------------");
                return;
            }
        }
    }

    public void run() {
        boolean running = true;
        while (running) {
            displayMenu();
            int choice = getIntInput();

            switch (choice) {

                case 1:
                    listAllProducts();
                    break;

                case 2:
                    searchProduct();
                    break;

                case 3:
                    addProductInteractively();
                    break;

                case 4:
                    running = false;
                    System.out.println("Thank you for your service");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
        scanner.close();
    }

    private void displayMenu() {
        System.out.println("---Product management system---");
        System.out.println("1) List of products");
        System.out.println("2) Search product by article number");
        System.out.println("3) Add product");
        System.out.println("4) Exit");
        System.out.println("Enter your choice:");
    }

    private void searchProduct() {
        System.out.println("Enter article number:");
        int articleNumber = getIntInput();
        showProductInfo(articleNumber);
    }

    private void addProductInteractively() {
        System.out.println("Select product type:");
        System.out.println("1) Movies");
        System.out.println("2) Books");
        System.out.println("3) Games");
        System.out.println("Enter your choice:");
        int type = getIntInput();

        scanner.nextLine();

        System.out.println("Enter title:");
        String title = scanner.nextLine();
        System.out.println("Enter article number:");
        int articleNumber = getIntInput();

        scanner.nextLine();

        System.out.println("Enter discreption:");
        String description = scanner.nextLine();
        System.out.println("Enter price:");
        double price = getDoubleInput();

        Product product = null;
        switch (type) {

            case 1:
                product = new Movies(title, articleNumber, description, price);
                break;

            case 2:
                product = new Books(title, articleNumber, description, price);
                break;

            case 3:
                product = new Games(title, articleNumber, description, price);
                break;

            default:
                System.out.println("Invalid choice");
                return;
        }
        addProduct(product);
    }

    private int getIntInput() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input");
            scanner.next();
        }
        return scanner.nextInt();


    }

    private double getDoubleInput() {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
