import java.util.HashSet;
import java.util.ArrayList;
/**
 * Manages the game library
 *
 * @author Eimaan 
 * 
 */
public class GameLibrary
{
    // instance variables - replace the example below with your own
    private HashSet<Game> games;
    private ArrayList<GameSession> sessions;

    /**
     * Constructor for objects of class GameLibrary
     */
    public GameLibrary()
    {
        games = new HashSet<>();
        sessions = new ArrayList<>();
    }

    /**
     * Main method
     */
    public static void main(String[] args){
        GameLibrary myLibrary = new GameLibrary();
        System.out.println("Game is starting...");
        
        Game g1 = new Game("Super Mario", Genre.PLATFORMER, Platform.SWITCH, AgeRating.EVERYONE, true);
        Game g2 = new Game("Minecraft", Genre.PLATFORMER, Platform.PC, AgeRating.EVERYONE, true);
        Game g3 = new Game("Elden Ring", Genre.RPG, Platform.PS5, AgeRating.MATURE, true);

    
        myLibrary.addGame(g1);
        myLibrary.addGame(g2);
        myLibrary.addGame(g3);

        myLibrary.printLibraryDetails();

        System.out.println("\nSearching for 'Minecraft'...");
        Game found = myLibrary.findGame("Minecraft");
        if(found != null) {
        System.out.println("Found: " + found);
        }
    }
        
    
    /**
     * Pseudocode:
     * add game to collection
     *
     */
    public void addGame(Game game)
    {
        games.add(game);
    }
    
    /**
     * Pseudocode:
     * loop through games
     * if title matches
     *  return game
     * return null
     */
    public Game findGame(String title)
    {
        for(Game g : games){
            if(g.getTitle().equals(title)){
                return g;
            }
        }
        return null;
    }
    
    /**
     * Pseudocode:
     * create empty set
     * loop through games
     * if genre matches
     *  add to set
     * return set
     */
    public HashSet<Game> filterByGenre(Genre genre)
    {
        HashSet<Game> result = new HashSet<>();
        
        for(Game g : games) {
            if(g.getGenre() == genre){
                result.add(g);
            }
        }
        return result;
    }
    
    
    /**
     * Pseudocode:
     * print total games
     * loop through games
     * print each game
     */
    public void printLibraryDetails()
    {
        System.out.println("Total games: + " + games.size());
        
        for(Game g : games) {
            System.out.println(g);
        }
    }
    
    public void addSession(GameSession session) {
        sessions.add(session);
    }
    
    public ArrayList<GameSession> getSession(){
        return sessions;
    }
}
