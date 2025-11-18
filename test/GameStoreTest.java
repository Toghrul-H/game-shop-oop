import gameshop.*;
import org.junit.jupiter.api.*;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class GameStoreTest {
    private Store store;
    private Game game1, game2, game3, game4;

    @BeforeEach
    public void setUp() {
        store = new Store();

        game1 = new Game("Cyber Quest", "RPG", 18, 95.5, 0, 10, 0, "in stock");
        game2 = new Game("Battle Royale", "Shooter", 16, 89.0, 5, 15, 0, "in stock");
        game3 = new Game("Fantasy World", "Adventure", 12, 76.3, 2, 12, 0, "rented");
        game4 = new Game("Speed Racer", "Racing", 10, 80.0, 21, 8, 0, "in stock");

        store.addGame(game1);
        store.addGame(game2);
        store.addGame(game3);
        store.addGame(game4);
    }

    @Test
    public void testMostPopularGame() {
        assertEquals(game1, store.mostPop(), "Most popular game should be Cyber Quest");
    }

    @Test
    public void testFindGamesByGenre() {
        List<Game> rpgGames = store.partGenre("RPG");
        assertEquals(1, rpgGames.size(), "There should be 1 RPG game");
        assertEquals(game1, rpgGames.get(0), "RPG game should be Cyber Quest");
    }

    @Test
    public void testBrowseForAge() {
        List<Game> ageAppropriateGames = store.browseforAge(12);
        assertEquals(1, ageAppropriateGames.size(), "There should be 1 game for age 12");
        assertEquals(game3, ageAppropriateGames.get(0), "Game should be Fantasy World");
    }

    @Test
    public void testRentGame() {
        store.gameRent(game1);
        assertEquals("rented", game1.getAvab(), "Game should now be rented");
        assertEquals(1, game1.getDamage(), "Damage should increase");
    }

    @Test
    public void testRentAlreadyRentedGame() {
        store.gameRent(game3); // Rent the game once
        boolean result = store.gameRent(game3); // Try renting again

        assertFalse(result, "Game should not be rented again.");
}

    @Test
    public void testReturnGame() {
        store.returnGame(game3);
        assertEquals("in stock", game3.getAvab(), "Game should now be in stock");
    }

    @Test
    public void testRentCostCalculation() {
        int cost = store.rentCost(game1, 3, 2);
        assertEquals((3 * 10) + (2 * 2 * 10), cost, "Total cost should be calculated correctly");
    }

    @Test
    public void testRemoveDamagedGames() {
        store.removeDamaged();
        List<Game> availableGames = store.getAvailableGames();
        assertFalse(availableGames.contains(game4), "Game with damage > 20 should be removed");
    }

    @Test
    public void testTotalRentedGames() {
        assertEquals(1, store.totalNum(), "There should be 1 rented game");
    }
}