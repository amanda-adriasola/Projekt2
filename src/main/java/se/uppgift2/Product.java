package se.uppgift2;

public abstract class Product {

    private String title;
    private int articleNumber;
    private double price;
    private String description;


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

    public void setArticleNumber(int articleNumber) {
        this.articleNumber = articleNumber;

    }

    public void setTitle(String tile) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;

    }
}
