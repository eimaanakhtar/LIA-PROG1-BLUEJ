import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class GameLibraryTest.
 *
 * @author  Asma
 * @version (a version number or a date)
 */
public class GameLibraryTest
{
    /**
     * Default constructor for test class GameLibraryTest
     */
    public static void main(String[]args)
    {
        GameLibrary lib=new GameLibrary();
        Game g1=new Game("COD", Genre.ACTION, Platform.XBOX, AgeRating.MATURE, true);
        
        lib.addGame(g1);
        //Test 1 
        if (lib.findGame("COD")!=null){
            System.out.println("PASS 1");
        }
        //Test 2
        if (lib.findGame("Minecraft")==null){
            System.out.println("PASS 2");
        }
    }
}