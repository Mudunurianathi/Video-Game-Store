/**
 * A video game played on a game console.
 * @author Anathi Mudunuri, CS 18000 
 * @version October 9, 2026
 */ 
public class ConsoleGame extends VideoGame {
    private String console;

    public ConsoleGame(String title, double price, 
            double rating, String console) {
        super(title, price, rating);
        this.console = console;
    }

    @Override
    public String getPlatform() {
        return console;
    }

    @Override
    public String toString() {
        return "Title: " + getTitle()
                + "\nPlatform: " + getPlatform()
                + "\nPrice: " + String.format("%.2f", getPrice())
                + "\nRating: " + String.format("%.1f", getRating());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConsoleGame other = (ConsoleGame) o;
        return getTitle().equals(other.getTitle())
                && Math.abs(getPrice() - other.getPrice()) < 0.0001
                && Math.abs(getRating() - other.getRating()) < 0.0001
                && console.equals(other.console);
    }
}
