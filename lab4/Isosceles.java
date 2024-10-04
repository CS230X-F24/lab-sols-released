package student;

/**
 * FILE NAME:Isosceles.java
 * WHO: Copyright Stella K. 2016
 * WHAT: Class with Isosceles Triangle properties.
 * Inherits from Triangle (which inherits from Shape) class
 */
public class Isosceles extends Triangle {
  
 /**
  * Constructor
  * @param base The length of the base of the triangle
  * @param scelos The length of the each of the two equal legs of the triangle
  */
  public Isosceles(double base, double scelos) {
    super (base, scelos, scelos); //call the constructor in the super class (Triangle)
    //which in turn calls the Shape constructor
    this.name = "Isosceles Triangle"; // now fix the name, since it is still "Triangle" 
    // We can do this because the instance variable name is protected in the Shape class
  }
  
  public static void main(String[] args) {
    Isosceles t1 = new Isosceles(3, 4);
    Isosceles t2 = new Isosceles(3, 5);
    Isosceles t3 = new Isosceles(1, 2);
    
    System.out.println("t1: " + t1);
    System.out.println("t2: " + t2);
    System.out.println("t3: " + t3);
    
    System.out.println("\n");
    
    System.out.println("t1 area = " + t1.calculateArea());
    System.out.println("t2 area = " + t2.calculateArea());
    System.out.println("t3 area = " + t3.calculateArea());
    
    System.out.println("\n");
    
    System.out.println("t1 perimeter = " + t1.calculatePerimeter());
    System.out.println("t2 perimeter = " + t2.calculatePerimeter());
    System.out.println("t3 perimeter = " + t3.calculatePerimeter());
   }
} //End Triangle Class
