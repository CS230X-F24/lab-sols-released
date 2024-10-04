
/**
 * A class containing several methods that manipulate arrays of integers.
 *
 * @author CD for CS230X (adapated from TM)
 * @version F24
 */

 public class FunWithArrays {

    private int[] myArray;

    /**
     * Constructor with an array of ints as input
     */
    public FunWithArrays(int[] array) {
        myArray = array;
    }

    /**
     * Prints the elements of the integer array.
     */
    public static void printArray(int[] array) {
        if (array!=null)
        {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    }

    /**
     * This method calculates and returns the sum of all elements in the array.
     * 
     * @author Samantha
     * @return int value of all elements added
     */
    public int calculateSum() {
        int total = 0;
        for (int i = 0; i < myArray.length; i++) {
            total += myArray[i];
        }
        return total;
    }

    /**
     * This method calculates and returns the average of all elements in the array.
     * 
     * @author Samantha
     * @return double average of all elements in Array
     */
    public double calculateAverage() {
        double average = this.calculateSum();
        average = average / (myArray.length);
        return average;
    }

    /**
     * This method calculates and returns the average of all elements in the array.
     * 
     * @author Samantha
     * @return int max value in aray
     */
    public int findMax() {
        int max = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (max < myArray[i])
                max = myArray[i];
        }

        return max;
    }

    /**
     * This method calculates both the minimum and the maximum value in the input
     * integer array.
     * It returns a small 2-element integer array which has the minimum value stored
     * at index 0 and the maximum value at index 1.
     * 
     * @author Samantha
     * @return int[] [0] is min value [1] is max value
     */
    public int[] findMinMax() {
        int[] minMax = new int[2];
        minMax[1] = this.findMax();
        int min = this.findMax();
        for (int i = 0; i < myArray.length; i++) {
            if (min > myArray[i])
                min = myArray[i];
        }
        minMax[0] = min;
        return minMax;
    }

    /**
     * This method returns a new array with values in reversed order from the array.
     * 
     * @author Samantha
     * @return int[] reverse order of Array
     */
    public int[] reverseArray() {
        int[] reverse = new int[(myArray.length)];
        int count = myArray.length - 1;
        for (int i = 0; i < myArray.length; i++) {
            reverse[i] = myArray[count];
            count--;
        }
        return reverse;
    }

    /**
     * This method removes the element that appears on a certain position of the
     * array.
     * The method returns a new array, shorter in length by 1, with the element
     * removed.
     * If the input position is invalid, the array is returned without a change.
     * 
     * @author Samantha
     * @param int index want removed
     * @return int[] new array with index removed and 1 shorter
     */
    public int[] removeAtPosition(int index) {
        if(myArray!=null&&myArray.length!=0){
        int[] temp = new int[myArray.length - 1];

        int step=0;
            for (int i = 0; i < temp.length; i++) {
                if (i != index){
                    temp[step] = myArray[i];
                    step++;
                }
            }
            if(myArray.length-1!=index){
                temp[temp.length-1]=myArray[myArray.length-1];
            }
        
        return temp;
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = { 7, 2, 15, 4, 9, 12 };
        FunWithArrays arrayWithValues = new FunWithArrays(nums);

        System.out.println("Original int[] with values:");
        FunWithArrays.printArray(nums);
        System.out.println("Sum= " + arrayWithValues.calculateSum() + " should be 49");
        System.out.println("Average= " + arrayWithValues.calculateAverage() + "should be 8.167");
        System.out.println("Max= " + arrayWithValues.findMax() + " should be 15");
        System.out.println("min and max= " + arrayWithValues.findMinMax()[0] + ", " + arrayWithValues.findMinMax()[1]
                + (" should be [2, 15]"));
        // FIX why not print array with toString
        System.out.println("reverse= " +  " should be [12, 9, 4, 15, 2, 7]");
        FunWithArrays.printArray(arrayWithValues.reverseArray());
        System.out.println("one removed= " + arrayWithValues.removeAtPosition(4) + (" should be [ 7, 15, 4, 9, 12]"));
        System.out.println("one removed= " + arrayWithValues.removeAtPosition(0) + (" should be [ 2, 15, 4, 9, 12]"));
        System.out.println("one removed= " + arrayWithValues.removeAtPosition(5) + (" should be [ 7, 2, 15, 4, 9]"));
        // String reverse = "";
        // int[] r = arrayWithValues.removeAtPosition(5);
        // for (int i = 0; i < r.length; i++) {
        //     reverse += "\n" + r[i];
        // }
        // System.out.println(reverse);
        int[] noElementIntArray = new int[0];
        FunWithArrays arrayEmpty = new FunWithArrays(noElementIntArray);
        System.out.println("\n");
        System.out.println("Original empty int[]:");
        FunWithArrays.printArray(noElementIntArray);
        System.out.println("Sum= " + arrayEmpty.calculateSum() + " should be 0");
        System.out.println("Average= " + arrayEmpty.calculateAverage() + "should be 0");
        System.out.println("Max= " + arrayEmpty.findMax() + " should be 0");
        System.out.println("min and max= " + arrayEmpty.findMinMax()[0] + ", " + arrayWithValues.findMinMax()[1]
                + (" should be null"));
        // FIX why not print array with toString
        System.out.println("reverse= ");
        printArray(arrayEmpty.reverseArray());
        System.out.print("should be ");
        System.out.println("\n one removed= ");
        printArray(arrayEmpty.removeAtPosition(4));
        System.out.print("should be ");
        System.out.println("\n one removed= ");
        printArray(arrayEmpty.removeAtPosition(0));
        System.out.print("should be ");
        System.out.println("\n one removed= ");
        printArray(arrayEmpty.removeAtPosition(5));
        System.out.print("should be ");
        


    }

   
}
