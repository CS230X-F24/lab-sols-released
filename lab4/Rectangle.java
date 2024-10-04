package student;

/**
 * Rectangle.java

 * 
 * Class to represent Shapes of type Rectangle.  <br>
 * A child of the Shape abstract class <br>
 *      Implements the calculateArea() and calculatePerimeter() methods <br>
 *      Overrides the toString() method <br>
 * @author cs230 staff (SK) based on an earlier version by Barry DeRoos <br>
 */

public class Rectangle extends Shape {

    protected double length; //length of the rectangle
    protected double width;  //width of the rectangle

    /**
     * Constructor
     * @param len length of rectangle
     * @param wid width of rectangle
     */
    public Rectangle(double len, double wid) {
        super ("rectangle"); //call the constructor in the super class (Shape)
        this.length = len;
        this.width = wid;
    }

    /**
     * calculateArea() Implemented for rectangle
     *  @return area
     */
    public double calculateArea() {
        return this.length * this. width;
    }

    /**
     * calculatePerimeter() Implemented for rectangle
     *  @return perimeter
     */
    public double calculatePerimeter() {
        return 2 * (this.length + this. width);
    }

    /**
     * toString()  Implemented for rectangle shapes. Overrides the one in Shape <br>
     *  @return a String representation of the Rectangle shape
     */
    public String toString() {
        String s = super.toString();
        s = s + " (length: " + length + " width: " + width + ")" ;
        return s;
    }

    //for testing
    public static void main(String[] args) {
        System.out.println("**********  Testing Rectangle class  **********");
        Rectangle r1 = new Rectangle(3, 4);
        Rectangle r2 = new Rectangle(2, 5.8);

        System.out.println("\nTesting toString():");
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        System.out.println("\nTesting calculateArea():");
        System.out.println("r1 area (expected 12) Got: " + r1.calculateArea());
        System.out.println("r2 area (expected 11.6) Got: " + r2.calculateArea());

        System.out.println("\nTesting calculatePerimeter():");
        System.out.println("r1 perimeter (expected 14) Got: " + r1.calculatePerimeter());
        System.out.println("r2 perimeter (expected 15.6) Got: " + r2.calculatePerimeter());
    
        System.out.println("\nTesting compareTo():");
    System.out.println("r1 compared to r2 (expected: 1) Got:  " 
                        + r1.compareTo(r2));
    System.out.println("r2 compared to r1 (expected: -1) Got:  " 
                        + r2.compareTo(r1));
    System.out.println("r2 compared to r2 (expected: 0) Got:  " 
                        + r2.compareTo(r2));
        
    }
} //End Rectangle Class
