
/**
 * class Triangle provides functionality for a triangle.
 *
 * @author Joyce Li
 * @version 09/26/24
 */
public class Triangle extends Shape
{
    private double a;
    private double b;
    private double c;
    private double perimeter;
    private double s;
    
    /**
     * Creates Triangle object with name "triangle" and input side lengths.
     * 
     * @param   a   double of first side length
     * @param   b   double of second side length
     * @param   c   double of third sie length
     */
    public Triangle (double a, double b, double c) {
        super("triangle");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    /**
     * Calculates the perimeter of the Triangle.
     * 
     * @return  double of the Triangle's perimeter
     */
    public double calculatePerimeter() {
        perimeter = a + b + c;
        return perimeter;
    }
    
    /**
     * Calculates the area of the Triangle.
     * 
     * @return  double of Triangle's area
     */
    public double calculateArea() {
        s = perimeter / 2;
        if (s > a && s > b && s > c) {
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        } else {
            fixProblem();
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
    }
    
    /**
     * Changes the side length if the side length is greater than the perimeter divided by 2.
     */
    private void fixProblem() {
        while (s <= a || s <= b || s <= c) {
            if (s <= a) {
                a = s - 1;
            }
            if (s <= b) {
                b = s - 1;
            }
            if (s <= c) {
                c = s - 1;
            }
            perimeter = calculatePerimeter();
            s = perimeter / 2;
        }
    }
    
    /**
     * Returns String representation of Triangle with side lengths, perimeter, and area.
     * 
     * @return  String representation of Triangle
     */
    public String toString() {
        double checkPerim = calculatePerimeter() / 2;
        if (checkPerim > a && checkPerim > b && checkPerim > c) {
            return this.name + " with side lengths " + a + ", " + b + ", " + c + " has perimeter: " + calculatePerimeter() + " and area: " + calculateArea();
        } else {
            calculateArea();
            return this.name + " with side lengths " + a + ", " + b + ", " + c + " has perimeter: " + calculatePerimeter() + " and area: " + calculateArea();
        }
    }
    
    /**
     * Main method to test code.
     */
    public static void main(String[] args) {
        Triangle t1 = new Triangle(1, 2, 2);
        Triangle t2 = new Triangle(4, 5, 6);
        System.out.println("Testing constructor and toString: ");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println("Perimeter of t1? Computed: "+ t1.calculatePerimeter() + " | Expected: 6");
        System.out.println("Area of t2? Computed: " + t2.calculateArea() + " | Expected: 9.92156");
        Triangle t3 = new Triangle(2, 5.8, 1);
        System.out.println(t3);
    }
}
