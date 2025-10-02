package se.uppgift2;

public abstract class Product {

    private final String title;
    private final int articleNumber;
    private final double price;
    private final String description;


    public Product(String title, int articleNumber, String description, double price) {
        this.title = title;
        this.articleNumber = articleNumber;
        this.description = description;
        this.price = price;


    }

    public abstract String category();


    public int getArticleNumber() {
        return articleNumber;

    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }


}
