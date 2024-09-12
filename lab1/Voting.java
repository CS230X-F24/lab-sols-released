/**
 * Utility class for determining voting eligibility based on birth year and month.
 * 
 * Goals:
 * practice with boolean expressions, conditionals
 * setting up test cases
 *
 * @author Catherine Delcourt (adapted from TM and prior CS230 lab)
 * @version Fall 2024
 */

public class Voting
{
    /**
     * Determines if a person is eligible to vote based on their birth year, 
     * current year, and birth month.
     *
     * @param currentYear the current year
     * @param birthYear the year the person was born
     * @param birthMonth the month the person was born (1 for January, 12 for December)
     * @return true if the person is eligible to vote (i.e., 18 years old or older and born before or in October of their 18th year), false otherwise
     */
    public static boolean isEligibleToVote(int currentYear, int birthYear, int birthMonth){
        
        int age = currentYear - birthYear;
        
        if((age > 18) || ((age == 18) && (birthMonth < 11))){
            return true;
        }
        
        return false;
    }

    /**
     * Main method to test isEligibleToVote()
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args){
        System.out.println("When the current year is 2024:");
        System.out.println("Someone born on 3/1992. Expected => true: Result => "+isEligibleToVote(2024, 1992, 3)); 
        System.out.println("Someone born on 5/2005. Expected => true: Result => "+isEligibleToVote(2024, 2005, 5)); 
        System.out.println("Someone born on 11/2005. Expected => true: Result => "+isEligibleToVote(2024, 2005, 11)); 
        System.out.println("Someone born on 10/2006. Expected => true: Result => "+isEligibleToVote(2024, 2006, 10)); 
        System.out.println("Someone born on 11/2006. Expected => false: Result => "+isEligibleToVote(2024, 2006, 11));
        System.out.println("Someone born on 1/2007. Expected => false: Result => "+isEligibleToVote(2024, 2007, 1)); 
    }
}
