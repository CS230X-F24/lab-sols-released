/**
 * Implements a class to represent a ClubStudent as a member to a Student Organization
 * @author CD for CS230x (adapted from SK for CS230)
 * @version F24
 */

public class ClubStudent extends Student {
    // instance variables

    private int yearJoined;     // the year the student joined the club
    private boolean feePaid; //whether or not the student has paid their participation fees

    /** constructor
     * Given the student's name, username, graduation year, and year the student joined the club,
     * it creates a Student object
     * @param name  The first and last name of the student
     * @param userName The distinct Wellesley user name for the student
     * @param year The year the student is graduating (like 2009)
     * @param yearJoined The year the student joined the club
     */ 
    public ClubStudent (String name, String userName, int gradYear, int yearJoined) {
        super(name, userName, gradYear);
        this.yearJoined = yearJoined;
        feePaid = false;
    }

    /** constructor
     * Given the student's name, username and graduation year
     * it creates a Student object
     * The year the student joined the club is set to -1, to indicate it is not available
     * @param name  The first and last name of the student
     * @param userName The distinct Wellesley user name for the student
     * @param year The year the student is graduating (like 2009)
     */
    public ClubStudent (String name, String userName, int gradYear) {
        this(name, userName, gradYear, -1);
    }

    /**
     * Sets the feePaid to true;
     * */
    public void payFee(){
        feePaid = true;
    }

    // instance methods for accessing the instance variables

    /**
     * getFeesPaid()
     * @return Returns true iff this student has paid their membership fees
     */
    public boolean getFeePaid() {
        return feePaid;
    }

    /** returns a String with all the information in a single Student instance
     * @return A string representation of a Student object
     */
    public String toString () {
        String j = (yearJoined == -1) ? "" : (" member since " + yearJoined + "\n");
        return super.toString() + j;
    }
    
    public static void main(String[] args) {
        ClubStudent diane = new ClubStudent("Diane Sawyer", "dsawyer", 1967);
        System.out.println(diane);
    }

}

