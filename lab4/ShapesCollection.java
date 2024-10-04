
/**
 * class ShapesCollection contains a collection of Shapes.
 *
 * @author Joyce Li
 * @version 09/26/24
 */
public class ShapesCollection
{
    Shape[] arr;
    private int counter = 0;
    
    /**
     * Creates ShapesCollection collection of size 3.
     */
    public ShapesCollection() {
        arr = new Shape[3];
    }
    
    /**
     * Accesses the number of Shapes in the collection.
     * 
     * @return  int of number of Shapes in collection
     */
    public int getCounter() {
        return counter;
    }
    
    /**
     * Sets Shape at input index in collection to input Shape.
     * 
     * @param   s       Shape intended to be at input index
     * @param   index   int of intended index for new Shape
     */
    public void setArray(Shape s, int index) {
        arr[index] = s;
    }
    
    /**
     * Adds Shape to collection.
     * 
     * @param   s   Shape intended to be added
     */
    public void add(Shape s) {
        if (arr.length == counter) {
            doubleArray();
            arr[counter] = s;
            counter++;
        } else {
           arr[counter] = s; 
           counter++;
        }
    }
    
    /**
     * Doubles size of collection.
     */
    private void doubleArray() {
        Shape[] temp = new Shape[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }
    
    /**
     * Finds index of Shape with largest area in collection.
     * 
     * @return  int of index of Shape with largest area
     */
    public int findLargest() {
        int max = 0;
        for (int i = 0; i < counter; i++) {
            if (arr[i].compareTo(arr[max]) > 0) {
                max = i;
            }
        }
        return max;
    }
    
    /**
     * Returns String representation of ShapesCollection object.
     * 
     * @return  String representation of ShapesCollection object
     */
    public String toString() {
        String rep = "This collection has " + counter + " shapes";
        for (int i = 0; i < counter; i++) {
            rep = rep + "\n" + arr[i];
        }
        return rep;
    }
    
    /**
     * Main method to test code.
     */
    public static void main(String[] args) {
        ShapesCollection shapes = new ShapesCollection();
        System.out.println(shapes);
        Rectangle r1 = new Rectangle(3, 4);
        Rectangle r2 = new Rectangle(2, 5.8); 
        Square sq2 = new Square(3);
        Square sq3 = new Square(2.3);
        Circle dot1 = new Circle(3);
        Circle dot2 = new Circle(5.8);
        Circle dot3 = new Circle(0);
        Triangle t1 = new Triangle(1, 2, 2);
        Triangle t2 = new Triangle(4, 5, 6);
        Triangle t3 = new Triangle(2, 5.8, 1);
        System.out.println("Testing add method:");
        shapes.add(r1);
        shapes.add(r2);
        shapes.add(sq2);
        shapes.add(sq3);
        shapes.add(dot1);
        shapes.add(dot2);
        shapes.add(dot3);
        shapes.add(t1);
        shapes.add(t2);
        shapes.add(t3);
        System.out.println(shapes);
        System.out.println("r1 compared to r2? Computed: "+ r1.compareTo(r2) + " | Expected: 1");
        System.out.println("dot3 compared to t3? Computed: "+ dot3.compareTo(t3) + " | Expected: -1");
        System.out.println("index of shape with largest area in collection? Computed: " + shapes.findLargest() + " | Expected: 5");
        Triangle t4 = new Triangle(7, 8, 9);
        System.out.println("Testing setArray method:");
        shapes.setArray(t4, 5);
        System.out.println(shapes);
        System.out.println("index of shape with largest area in collection? Computed: " + shapes.findLargest() + " | Expected: 4");
    }
}
