/**
 * Represents an item t*at can be downloaded digitally.
 * @author Anathi Mudunuri, CS 18000 
 * @version October 9, 2026
 */ 
public interface Downloadable {

   /**
     * Returns the amount of storage required to download the game.
     *
     * @return the size in gigabytes
     */
    double getDownloadSize();

}
