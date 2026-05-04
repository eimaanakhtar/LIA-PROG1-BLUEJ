
/**
 * Represents a game session
 *
 * @author Eimaan 
 * @version (a version number or a date)
 */
public class GameSession
{
    private Game game;
    private int durationMinutes;
    private String timeStamp;

    /**
     * Constructor for objects of class GameSession
     */
    public GameSession(Game game, int durationMinutes, String timeStamp)
    {
        this.game = game;
        this.durationMinutes = durationMinutes;
        this.timeStamp = timeStamp;
    }

    /**
     */
    public Game getGame()
    {
        return game;
    }
    
    /**
     */
    public int getDuration()
    {
        return durationMinutes;
    }
    
    /**
     */
    public String getTimeStamp()
    {
        return timeStamp;
    }
    
    /**
    */
    public String toString() {
        return game.getTitle() + " played for " +  durationMinutes +"  minutes";
    }
}
