/**
 * Represents a game in the library
 *
 * @author Eimaan & Asma
 * @version (a version number or a date)
 */
public class Game
{
    // instance variables - replace the example below with your own
    private String title;
    private Genre genre;
    private Platform platform;
    private AgeRating ageRating;
    private boolean isMultiplayer;
    private double rating;

    /**
     * Constructor for objects of class Game
     */
    public Game(String title, Genre genre, Platform platform, AgeRating ageRating, boolean isMultiplayer)
    {
        this.title = title;
        this.genre = genre;
        this.platform = platform;
        this.ageRating = ageRating;
        this.isMultiplayer = isMultiplayer;
        this.rating = 0.0;
    }

    /**
     * 
     *
     */
    public String getTitle()
    {
        // put your code here
        return title;
    }
    
    public Genre getGenre() {
        return genre;
    }
    
    public Platform getPlatform() {
        return platform;
    }
    
    public AgeRating getAgeRating() {
        return ageRating;
    }
    
    public double getRating() {
        return rating;
    }
    
    public void setRating(double rating) {
        this.rating = rating;
    }
    
    public String getDeatails(){
        return toString();
    }
    
    public String toString() {
        return title + " - " + genre + " - " + platform +" Rating " + rating;
    }
}

