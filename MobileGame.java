/**
 * A video game played on a mobile device that must be downloaded.
 * @author Anathi Mudunuri, CS 18000 
 * @version October 9, 2026
 */ 
public class MobileGame extends VideoGame implements Downloadable {
    private double downloadSize;

    public MobileGame(String title, double price, 
            double rating, double downloadSize) {
        super(title, price, rating);
        this.downloadSize = downloadSize;
    }

    @Override
    public double getDownloadSize() {
        return downloadSize;
    }

    @Override
    public String getPlatform() {
        return "Mobile";
    }

    @Override
    public String toString() {
        return "Title: " + getTitle()
                + "\nPlatform: " + getPlatform()
                + "\nPrice: " + String.format("%.2f", getPrice())
                + "\nRating: " + String.format("%.1f", getRating())
                + "\nDownload Size: " 
                + String.format("%.1f", downloadSize) + " GB";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MobileGame other = (MobileGame) o;
        return getTitle().equals(other.getTitle())
                && Math.abs(getPrice() - other.getPrice()) < 0.0001
                && Math.abs(getRating() - other.getRating()) < 0.0001
                && Math.abs(downloadSize - other.downloadSize) < 0.0001;
    }
}
