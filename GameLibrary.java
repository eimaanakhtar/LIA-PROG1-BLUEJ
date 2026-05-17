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
    public static void main(String[] args) {
        GameLibrary myLibrary = new GameLibrary();
        Menu menu = new Menu(); 
        boolean finished = false;

        System.out.println("###############################");
        System.out.println("#  LOADING GAME LIBRARY...    #");
        System.out.println("###############################");
        
        
        myLibrary.addGame(new Game("Super Mario", Genre.PLATFORMER, Platform.SWITCH, AgeRating.EVERYONE, true));
        myLibrary.addGame(new Game("Minecraft", Genre.PLATFORMER, Platform.PC, AgeRating.EVERYONE, true));

        printWelcome();

        while(!finished) {
            HashSet<String> inputWords = menu.getInput();

            if(inputWords.contains("quit") || inputWords.contains("0")) {
                finished = true;
            } 
            else if(inputWords.contains("1") || inputWords.contains("list")) {
                myLibrary.printLibraryDetails();
            } 
            // NEW SECTION START
            else if(inputWords.contains("2") || inputWords.contains("add")) {
                System.out.println("Enter the title of the game:");
                
                HashSet<String> nameInput = menu.getInput();
                
                String title = String.join(" ", nameInput); 
                
                Game userGame = new Game(title, Genre.ACTION, Platform.PC, AgeRating.EVERYONE, true);
                myLibrary.addGame(userGame);
                
                System.out.println("Added: " + title + " to your library!");
            }
            // NEW SECTION END
            else if(inputWords.contains("help")) {
                printWelcome();
            }
            else {
                System.out.println("Command not recognized. Type 'help' for options.");
            }
        }
        System.out.println("Goodbye! Have a great day.");
    }

    private static void printWelcome() {
        System.out.println("\n--- OPTIONS ---");
        System.out.println("1: List all games");
        System.out.println("2: Add a new game"); 
        System.out.println("quit: Exit the program");
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
        System.out.println("Total games: " + games.size());
        
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
