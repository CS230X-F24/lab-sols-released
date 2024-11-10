import java.util.*;
import java.io.*;

/**
 * Uses an array to maintain a collection of Shapes.
 * Uses File I/O
 *
 * @author ()
 * @version ()
 */
public class ShapesCollectionIO
{
    private final int CAPACITY = 10;

    private Shape[] shapes;
    private int counter;

    public ShapesCollectionIO() {
        shapes = new Shape[CAPACITY];
        counter = 0;
    }

    /**
     * getCounter()
     * @return int counter the number of Shape objects in the collection
     **/
    public int getCounter(){
        return counter;
    }

    /**
     * toString
     * returns a string represenation of this collection of shapes
     * @return String a string representation of this collection
     **/
    public  String toString(){
        String s = ".......................\nThis collection contains " +
            counter + " shape";

        s += (counter != 1) ? "s": ""; // add an "s" to "shape", if more than one shapes
        s += (counter == 0) ? "." + "\n": ":" + "\n"; // add . if 0 shapes, else :

        for (int i=0; i<counter; i++) {
            s = s + ("   " + shapes[i] + "\n");
        }
        return s;
    }

    /**
     * adds the input Shape to the collection
     * Doubles the array size when needed
     *
     * @param Shape The shape to be added to the collection
     *
     * */
    public void addShape(Shape s) {
        if (counter == shapes.length) { //there is no more space in the array
            doubleArray();
        }
        //now you can safely add the new object
        shapes[counter] = s;
        counter++;
    }

    //helper if any of the arrays run out of space
    private void doubleArray() {
        Shape[] tempArray = new Shape[2*shapes.length];

        for (int i= 0; i<shapes.length; i++) {
            tempArray[i]=shapes[i];
        }
        shapes = tempArray;
    }
    
    public void writeDataToFile(String fileName){
        try{
            PrintWriter writer = new PrintWriter (new File(fileName));
            for(int i=0; i<counter; i++){ 
                System.out.println(shapes[i]);
		writer.println(shapes[i].serialize());
            }
            writer.close();
        }catch (IOException ex) {
            System.out.println(ex); // Handle file-not-found
        }
    }
    
    public void readDataFromFile(String fileName){
        try {
    	    Scanner fileScan = new Scanner (new File(fileName));
    	    while (fileScan.hasNext()) {
                String line = fileScan.next();
                Shape s = null;
                if(line.equals("rectangle")){
                   double length = fileScan.nextDouble();
                   double width = fileScan.nextDouble();
                   s = new Rectangle(length, width);
                }else if(line.equals("triangle")){
                   double a = fileScan.nextDouble();
                   double b = fileScan.nextDouble();
                   double c = fileScan.nextDouble();
                   s = new Triangle(a, b, c);
                }else if(line.equals("circle")){
                   double r = fileScan.nextDouble();
                   s = new Circle(r);
                }
                this.addShape(s);
                //System.out.println(line);
            }
	} catch (IOException ex) {
    	    System.out.println(ex);
	}

    }

    /**
     * Basic testing
     */
    public static void main (String[] args) { 
        ShapesCollectionIO tester = new ShapesCollectionIO();
        /*Circle c1 = new Circle(2);
        Rectangle r1 = new Rectangle(2,4);
        Triangle t1 = new Triangle(2,4,6);
        tester.addShape(c1);
        tester.addShape(r1);
        tester.addShape(t1);
        System.out.println(c1.serialize());
        System.out.println(r1.serialize());
        System.out.println(t1.serialize());
        tester.writeDataToFile("shapes-output.txt");*/
        tester.readDataFromFile("input.txt");
        System.out.println(tester);
    }
}

