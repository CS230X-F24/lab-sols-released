import java.util.Random;
import java.util.Scanner;
 
/**
 * UserNames.java
 * Ask the user for their first, last name.
 * Produces user name, based on first and last names, and a random integer:
 * A user name consists of the user's first name initial, followed by
 * the first 5 letters of their last name, followed by a random two digit integer in the range [10-99]
 * We assume that the user's last name has length >= 5, and we do not deal with dublicate user names.
 * It continues producing user names until the user chooses to stop the process.
 *
 * @author Catherine Delcourt (adapted from Stella K. and prior CS230 labs)
 * @version Fall 2024
 */

public class UserNames
{
    /**
     * Returns the first component of the user name, based on the
     *          user's first and last name: initial of the first name, followed by the
     *          first 5 characters of the last name. Assumes last name has length at least 5.
     *
     * @param String The first name of the user
     * @param String The last name of the user
     * 
     * @return  the first component of the user name (like cdelco)
     */
    public static String produceFirstPart(String firstName, String lastName){
        String start = "";
        String end = "";
        
        if(firstName.length() > 0){
            start = firstName.substring(0,1);
        }
        
        if(lastName.length() >= 5){
            end = lastName.substring(0,5);
        }else if(lastName.length() > 0){
            end = lastName;
        }
        
        return start.toLowerCase() + end.toLowerCase();
    }
    
    /**
     * Returns the second component of the user name, a 2-digit random integer
     * in the range [10 - 99]
     *
     * @return  the second component of the user name
     */
    public static int produceSecondPart(){
        Random rand = new Random();
        return rand.nextInt(90)+10;
    }
    
    /**
     * Creates a username from a first part using the user's name 
     * and a second part using a random number.
     *
     * @param String The first name of the user
     * @param String The last name of the user
     * 
     * @return  the user name
     */
    public static String produceOneUserName(String firstName, String lastName){ 
        return produceFirstPart(firstName, lastName) + produceSecondPart();
    }
    
    /**
     * Asks the user for a first and a last name. Produces and shows to the user a user name.
     * Repeats the process until the user chooses to stop it.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args){
        System.out.println(UserNames.produceFirstPart("catherine", "delcourt"));
        System.out.println(UserNames.produceFirstPart("", "delcourt"));
        System.out.println(UserNames.produceOneUserName("catherine", "delcourt"));
        System.out.println(UserNames.produceOneUserName("catherine", "delcourt"));
        System.out.println(UserNames.produceOneUserName("catherine", "delcourt"));
        System.out.println(UserNames.produceOneUserName("catherine", "delcourt"));
        System.out.println(UserNames.produceOneUserName("catherine", "delcourt"));
        
        Scanner scan = new Scanner(System.in);
        boolean getNext = true;
        
        do{
            System.out.print("What is your first name? ");
            String firstName = scan.nextLine();
            System.out.print("What is your last name? ");
            String lastName = scan.nextLine();
            System.out.println("Your username is: "+UserNames.produceOneUserName(firstName, lastName)+"\n");
            System.out.println("Do you want to continue? (y/n)");
            if (scan.nextLine().equalsIgnoreCase("n")) {
                getNext = false;
            }

        }while(getNext);
        
        scan.close();
        
    }
}
