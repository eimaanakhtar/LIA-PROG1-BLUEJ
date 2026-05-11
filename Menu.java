import java.util.HashSet;
import java.util.Scanner;

/**
 * Write a description of class Menu here.
 *
 * @author Eimaan 
 * @version (a version number or a date)
 */
public class Menu
{
    private Scanner reader;
    
    /**
     * Constructor for objects of class Menu
     */
    public Menu()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Pseudocode:
     * Print a prompt symbol ("> ") to show the user where to type (waiting for input)
     * Reads the entire line of text typed by the user
     * Convert all letters to lowercase and trim extra spaces
     * Split the sentence into individual words
     * Store each word in a HashSet to remove duplicates.
     * Return the set of words for the library to process.
     *
     */
    public HashSet<String> getInput()
    {
        System.out.print("> ");
        String inputLine = reader.nextLine().trim().toLowerCase();
        
        Scanner splitter = new Scanner(inputLine);
        HashSet<String> words = new HashSet<>();
        while(splitter.hasNext()){
            words.add(splitter.next());
        }
        return words;
    }
}