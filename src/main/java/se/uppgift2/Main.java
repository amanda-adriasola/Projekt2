package se.uppgift2;

public class Main {
    public static void main(String[] args) {

        Application application = new Application();

        Product book1 = new Books("Harry Potter", 101, "Fantasy novel about wizards", 199.99);
        Product book2 = new Books("The Hobbit", 102, "Adventure in Middle Earth", 149.99);

        Product game1 = new Games("Minecraft", 201, "Sandbox building game", 299.99);
        Product game2 = new Games("The Witcher 3", 202, "RPG adventure game", 399.99);

        Product movie1 = new Movies("The Matrix", 301, "Sci-fi action thriller", 129.99);
        Product movie2 = new Movies("Inception", 302, "Mind-bending thriller", 139.99);

        application.addProduct(book1);
        application.addProduct(book2);
        application.addProduct(game1);
        application.addProduct(game2);
        application.addProduct(movie1);
        application.addProduct(movie2);

        application.listAllProducts();

        application.showProductInfo(201);

    }
}
