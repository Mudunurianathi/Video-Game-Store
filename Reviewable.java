/**
 * Represents an item that can be reviewed by customers.
 * @author Anathi Mudunuri, CS 18000 
 * @version October 9, 2026
 */ 
public interface Reviewable {

   /**
     * Returns the review score for the item.
     *
     * Ratangs will always be between 0.0 and 5.0.
     *
     * @return the rat*ng
     */
    double getRating();
}
