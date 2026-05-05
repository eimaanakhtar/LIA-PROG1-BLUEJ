

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class GameTest.
 *
 * @author  Eimaan
 * @version (a version number or a date)
 */
public class GameTest
{
    /**
     * Default constructor for test class GameTest
     */
    public static void main(String[]args)
    {
        Game g = new Game("FIFA", Genre.SPORTS, Platform.PS5, AgeRating.EVERYONE,true);
        
        //Test 1 
        if(g.getTitle().equals("FIFA")){
            System.out.println("Test 1 (getTitle):PASS");
            }else{
                System.out.println("Test 1 (getTitle):FAIL");
        }
        
        //Test 2
        g.setRating(4.5);
        if(g.getRating()==4.5){
            System.out.println("Test 2 (set/get rating):PASS");
            }else{
                System.out.println("Test 2 (set/get rating):FAIL");
        }
    }
}