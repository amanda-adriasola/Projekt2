package se.uppgift2;

public class Movies extends Product {
    public Movies(String title, int articleNumber, String description, double price) {
        super(title, articleNumber, description, price);


    }

    @Override
    public String category() {
        return "Movies";

    }

}
