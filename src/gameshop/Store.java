
package gameshop;
import java.util.List;
import java.util.ArrayList;

/**
 * Manages a game store's inventory, rentals, and revenue.
 * @author Totu-vostro-5640
 */
public class Store {
    private List<Game> games;
    private double totalRevenue;
/**
     * Initializes an empty store.
 */
    public Store() {
        this.games = new ArrayList<>();
        this.totalRevenue = 0;
    }
    /**
     * Adds a game to the store.
     * @param game 
     */
    public void addGame(Game game) {
        games.add(game);
    }

    /**
     * Returns the most popular game.
     * @return 
     */
    public Game mostPop() {
        double max = 0;
        Game g = null;
        for (Game game : games) {
            if (game.getPop() > max) {
                max = game.getPop();
                g = game;
            }
        }
        return g;
    }
    /**
     * Finds games by genre.
     * @param genre
     * @return 
     */
    public List<Game> partGenre(String genre) {
        List<Game> gamesofGenres = new ArrayList<>();
        for (Game game : games) {
            if (game.getGenre().equals(genre)) {
                gamesofGenres.add(game);
            }
        }
        return gamesofGenres;
    }
    
    /**
     * Finds games suitable for a given age.
     * @param age
     * @return 
     */
    public List<Game> browseforAge(int age) {
        List<Game> gamesforAge = new ArrayList<>();
        for (Game game : games) {
            if (game.getAge() == age) {
                gamesforAge.add(game);
            }
        }
        return gamesforAge;
    }
    /**
     * Rents a game if available.
     * @param game 
     */
    public boolean gameRent(Game game) {
        if (game.getAvab().equals("in stock")) {
            game.setCount(game.getCount() + 1);
            game.setDamage(game.getDamage() + 1);
            game.setAvab("rented");
            return true;
        } 
        return false; 
}

    
    /**
     * Calculates rental cost, including late fees.
     * @param game
     * @param hoursRented
     * @param lateHours
     * @return 
     */
    public int rentCost(Game game, int hoursRented, int lateHours) {
        int rentalCost = game.getPrice() * hoursRented;
        int lateFee = 2 * game.getPrice() * lateHours;
        int totalCost = rentalCost + lateFee;
        totalRevenue += totalCost;
        return totalCost;
    }

    /**
     * Returns a rented game.
     * @param game 
     */
    public void returnGame(Game game) {
        if (game.getAvab().equals("rented")) {
            game.setAvab("in stock");
        } else {
            throw new Error("Game is not rented");
        }
    }

    /**
     * Removes damaged games.
     */
    public void removeDamaged(){
        for (Game game: games){
            if (game.getDamage() >20){
                games.remove(game);
            }
        }
    }
    
    /**
     * Counts rented games.
     * @return 
     */
    public int totalNum() {
        int count = 0;
        for (Game game : games) {
            if (game.getAvab().equals("rented")) {
                count++;
            }
        }
        return count;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public List<Game> getAvailableGames() {
        List<Game> availableGames = new ArrayList<>();
        for (Game game : games) {
            if (game.getAvab().equals("in stock")) {
                availableGames.add(game);
            }
        }
        return availableGames;
    }
}
