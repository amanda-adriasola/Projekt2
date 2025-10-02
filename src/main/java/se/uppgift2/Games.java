package se.uppgift2;

public class Games extends Product {
    public Games(String title, int articleNumber, String description, double price) {
        super(title, articleNumber, description, price);


    }

    @Override
    public String category() {
        return "Games";

    }

}
