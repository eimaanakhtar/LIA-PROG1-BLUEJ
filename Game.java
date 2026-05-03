
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
    private AgeRating AgeRating;
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
        this.AgeRating = ageRating;
        this.isMultiplayer = isMultiplayer;
        this.rating = 0.0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
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
        return AgeRating;
    }
    
    public double getRating() {
        return rating;
    }
    
    public void setRating(double rating) {
        this.rating = rating;
    }
    
    public String toString() {
        return title + " - " + genre + " - " + platform +" Rating " + rating;
    }
}

