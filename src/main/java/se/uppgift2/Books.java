package se.uppgift2;

public class Books extends Product {
    public Books(String title, int articleNumber, String description, double price) {
        super(title, articleNumber, description, price);


    }

    @Override
    public String category() {
        return "Books";

    }

}
