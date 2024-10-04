package student;

/**
 * Square.java
 * 
 * Class to represent Shapes of type Square.  <br>
 * A child of the Rectangle class <br>
 *      Overrides the toString() method <br>
 * @author cs230 staff (SK) based on an earlier version by Barry DeRoos
 */


public class Square extends Rectangle {

    /**
     *   Square Constructor
     *   @param s the length of the sides of a square
     */
    public Square(double s) {
        super(s,s); // invoke the parent Rectangle constructor
        this.name = "square"; //override the "name" property
    }

    /**
     *   toString()
     *   overrides the inherited one (from the Rectangle class)
     *   
     *   @return a String describing this Square
     */
    public String toString() {
        String s = this.name + " of side: " + length + 
            " and area: " + calculateArea() + " and perimeter: " 
            + calculatePerimeter();
        return s;
    }

    /*
     * main() for testing purposes
     * 
     */
    public static void main(String[] args) {
        System.out.println("**********  Testing Square class  **********");
        //Produce a suggestion if the user hasn't given an argument
        // Using command line arguments, checking the case when the user
        // has not supplied a size at run time
        if (args.length == 0) {
            System.out.println("Please provide the length of the square's side.");
            //System.out.println("For example:\n");
            //System.out.println("> java Square 3.7");
            return;
        }
        //run normally
        double  num = Double.parseDouble(args[0]); //read side for command line
        Square sq1 = new Square(num);
        System.out.println(sq1);

        //more testing
        Square sq2 = new Square(3);
        Square sq3 = new Square(2.3);

        System.out.println("\nTesting toString():");
        System.out.println("sq1 = " + sq1);
        System.out.println("sq2 = " + sq2);
        System.out.println("sq3 = " + sq3);

        System.out.println("\nTesting calculateArea():");
        System.out.println("sq1 area (expected ???) Got: " + sq1.calculateArea());
        System.out.println("sq2 area (expected 9) Got: " + sq2.calculateArea());
        System.out.println("sq3 area (expected 5.29) Got: " + sq3.calculateArea());

        System.out.println("\nTesting calculatePerimeter():");
        System.out.println("sq1 perimeter (expected ???) Got: " + sq1.calculatePerimeter());
        System.out.println("sq2 perimeter (expected 12) Got: " + sq2.calculatePerimeter());
        System.out.println("sq3 perimeter (expected 9.2) Got: " + sq3.calculatePerimeter());

        System.out.println("\nTesting compareTo():");
        System.out.println("sq1 compared to sq2  Got:  " 
            + sq1.compareTo(sq2));
        System.out.println("sq2 compared to sq1 (expected: the opposite of above) Got:  " 
            + sq2.compareTo(sq1));
        System.out.println("sq2 compared to sq2 (expected: 0) Got:  " 
            + sq2.compareTo(sq2));
    }
}
