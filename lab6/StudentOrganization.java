import java.util.LinkedList;
import java.util.List;

/**
 * Implements a class to represent and maintain a Student Organization
 * @author CD for CS230x (adapted from SK for CS230)
 * @version F24
 */

public class StudentOrganization {
    //instance vars
    private String name; //the name of the organization
    private ClubStudent president; // the president of the org
    private ClubStudent vicePresident; //its vice president
    private List<ClubStudent> members; //contains all the members of the org

    /** constructor
     * Creates an empty Student Organization
     * @param name The name of the organization
     */
    public StudentOrganization(String name) {
        this.name = name;
        this.members = new LinkedList<ClubStudent>();
        this.president = null;
        this.vicePresident = null;
    }
    
    /**
     * Adds a student to the organization, if that student does not belong to the group yet.
     * @param s The student to be added as a member to the org.
     **/
    public void addMember(ClubStudent s) {
        if (!members.contains(s)){
            members.add(s);
        } else  {
            System.out.println(s.getName() + " is already a member of the " + name+  " Club");
        }
    }
    
    /**
     * Checks membership in an Organization.
     * Uses equals() in (parent) Student class, which bases
     * equality on the user names
     *
     * @param ClubStudent -- The  student to check membership for.
     * @return boolean -- true if there is a member with the specified username,
     *                    false otherwise.
     */
    public boolean isMember(ClubStudent st){
        //one can use the contains() on the LinkedList class:
        return members.contains(st);
    }

}
