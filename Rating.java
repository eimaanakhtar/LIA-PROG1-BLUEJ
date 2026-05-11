
/**
 * Write a description of class Rating here.
 *
 * @author Asma
 * @version (a version number or a date)
 */
public enum Rating
{
    // instance variables - replace the example below with your own
    ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5);

    private final int value;

    Rating(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
