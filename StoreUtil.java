/**
 * A video game played on a mobile device that must be downloaded.
 * @author Anathi Mudunuri, CS 18000 
 * @version October 9, 2026
 */ 
public class StoreUtil {

    public static double totalPrice(VideoGame[] games) {
        double total = 0.0;
        for (VideoGame game : games) {
            total += game.getPrice();
        }
        return total;
    }

    public static int countDownloadableGames(VideoGame[] games) {
        int count = 0;
        for (VideoGame game : games) {
            if (game instanceof Downloadable) {
                count++;
            }
        }
        return count;
    }

    public static int countUniqueGames(VideoGame[] games) {
        int count = 0;
        for (int i = 0; i < games.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if (games[i].equals(games[j])) {
                    duplicate = true;
                }
            }
            if (!duplicate) {
                count++;
            }
        }
        return count;
    }

    public static double averageRating(VideoGame[] games) {
        if (games.length == 0) {
            return 0.0;
        }
        double total = 0.0;
        for (VideoGame game : games) {
            total += game.getRating();
        }
        return total / games.length;
    }
}
