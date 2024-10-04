package student;

/**
 * Circle.java
 * 
 * Class to represent Shapes of type Circle. A child of the Shape abstract class <br>
 *      Implements the calculateArea() and calculatePerimeter() methods <br>
 * @author cs230 staff (SK) based on an earlier version by Barry DeRoos  <br>    
 */

public class Circle extends Shape { 
  private static final double PI = 3.14159265358979323;
  private double radius;
  
  /**
   *   Constructor
   *   @param r radius of the circle
   */
  public Circle(double r) {
    super("circle"); //calls constructor in Shape class
    this.radius = r;
  }
  
  /**
   *  calculateArea method implemented for circle <br>
   *  @return area of the circle
   */
  public double calculateArea(){  
    return PI * this.radius * this.radius;
  }
  
  /**
   * calculatePerimeter() (known as circumference) Implemented for circle <br>
   *  @return perimeter of the circle
   */
  public double calculatePerimeter() {
    return 2 * PI * this.radius;
  }
  
  /**
   * toString()  Implemented for circle <br>
   *  @return a String representation of the Circle shape
   */
  public String toString() {
    String s = super.toString();
    s = s + " (radius: " + radius + ")" ;
    return s;
  }
  
  /**
   * main() for testing
   * 
   */
  public static void main(String[] args) {
    System.out.println("**********  Testing Circle class  **********");
    Circle dot1 = new Circle(3);
    Circle dot2 = new Circle(5.8);
    Circle dot3 = new Circle(0);
    
    System.out.println("\nTesting toString():");
    System.out.println("dot1:: " + dot1);
    System.out.println("dot2:: " + dot2);
    System.out.println("dot3:: " + dot3);
    //System.out.println();
    
    System.out.println("\nTesting calculateArea():");
    System.out.println("dot1 area (expected: 28.27) Got: " + 
                        dot1.calculateArea());
    System.out.println("dot2 area (expected: 105.68) Got: " + 
                        dot2.calculateArea());
    System.out.println("dot3 area (expected: 0.0) Got: " + 
                        dot3.calculateArea());
    //System.out.println();
    
    System.out.println("\nTesting calculatePerimeter():");
    System.out.println("dot1 perimeter (expected:18.85 ) Got:  " 
                        + dot1.calculatePerimeter());
    System.out.println("dot2 perimeter (expected: 36.44) Got:  " 
                        + dot2.calculatePerimeter());
    System.out.println("dot3 perimeter (expected: 0.0) Got:  " 
                        + dot3.calculatePerimeter());
    //System.out.println();
    
    System.out.println("\nTesting compareTo():");
    System.out.println("dot1 compared to dot2 (expected: -1 ) Got:  " 
                        + dot1.compareTo(dot2));
    System.out.println("dot2 compared to dot1 (expected: 1 ) Got:  " 
                        + dot2.compareTo(dot1));
    System.out.println("dot2 compared to dot2 (expected: 0 ) Got:  " 
                        + dot2.compareTo(dot2));
  }
} //End Circle class
