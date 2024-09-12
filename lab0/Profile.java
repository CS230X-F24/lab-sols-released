
/**
 * This class is prints a personal profile with information about the user.
 *
 * @author CS230X (CD)
 * @version F24
 */

public class Profile {
     public static void main(String [] args) {
        //replace the values of the following variables as you wish
        String name = "Catherine";
        int gradYear = 2009;
        String town = "Wellesley";
        boolean csMajor = true;
        System.out.println("Hello there! My name is " + name + ".");
        System.out.println("I am Wellesley class of " + gradYear + ".");
        System.out.println("I am a computer science major: " + csMajor);
        System.out.println("And, I live in "+town);
    }
}