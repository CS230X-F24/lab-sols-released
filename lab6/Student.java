/**
 * Create a student for managing organizations
 * @author CD for CS230x (adapted from SK for CS230)
 * @version F24
 */

public class Student implements Comparable<Student>{
  
  protected String name;  //To hold the name  (first and last name) of the student
  protected String address; // the student's home address
  protected String userName; // the student's email address
  protected int year; //graduation year
  
  
  public Student(String name, String usrName, int y) {
    this.name = name;
    this.userName = usrName;
    this.year = y;
    this.address = "unavailable";
  }
  
  public Student(String name, String addr, String usrName, int y) {
    this(name, usrName, y); //notice the use of the construtor above!
    this.address = addr;
  }
  
  public void setAddress (String addr) {
    this.address = addr;
  }
  
  /**
   * getName()
   * @return Returns the name of the Student
   */ 
  public String getName() {
    return name;
  }
  
  /**
   * getUsername()
   * @return Returns the user name of the Student
   */
  public String getUserName() {
    return userName;
  }
  
  public String getAddress() {
    return address;
  }
  
  /**
   * getGradYear()
   * @return Returns the year of the Student
   */
  public int getGradYear() {
    return year;
  }
  
  @Override
  public String toString() {
    String j = (address.equals("unavailable")) ? "" : (" address: " + address);
    return  "   " + name +" (" + userName + ")"  + j +  " "+ year;
  }
  
  @Override
  public boolean equals(Object other) {
    return this.userName.equals(((Student)other).userName);
  }
  
  @Override
  public int compareTo(Student other) {
    return this.name.compareTo(other.name);
  }
  
  public static void main(String[] args) {
    Student s1 = new Student("test name", "101 Wellesley st", "tn198", 2018); 
    System.out.println(s1);
  }

  
}