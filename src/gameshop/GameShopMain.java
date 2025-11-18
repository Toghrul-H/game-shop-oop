package gameshop;
import java.util.List;
/**
 * Main class to run the GameShop application.
 * @author Totu-vostro-5640
 */
class GameShopMain {
    public static void main(String[] args) {
        Store store = new Store();

        Game game1 = new Game("Super Mario", "Adventure", 10, 90.5, 0, 5, 0, "in stock");
        Game game2 = new Game("Call of Duty", "Action", 18, 95.0, 0, 7, 5, "in stock");
        Game game3 = new Game("Minecraft", "Simulation", 7, 80.0, 0, 4, 10, "in stock");

        store.addGame(game1);
        store.addGame(game2);
        store.addGame(game3);

        store.gameRent(game1);
        System.out.println("Rented: " + game1.getTitle());

        int cost = store.rentCost(game1, 3, 1);
        System.out.println("Total Rental Cost (with late fee): $" + cost);

        store.returnGame(game1);

        List<Game> availableGames = store.browseforAge(10);
        System.out.println("Available Games:");
        for (Game g : availableGames) {
            System.out.println("- " + g.getTitle());
        }

        Game popularGame = store.mostPop();
        if (popularGame != null) {
            System.out.println("Most Popular Game: " + popularGame.getTitle());
        }

        System.out.println("Total Revenue: $" + store.getTotalRevenue());
    }
}
