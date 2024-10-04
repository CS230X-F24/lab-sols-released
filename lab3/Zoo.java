
/**
 * Write a description of class Zoo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zoo
{
    private Animal[] members;
    private int size;

    /**
     * Constructor for objects of class Zoo
     */
    public Zoo()
    {
        // initialise instance variables
        members = new Animal[3];
    }
    
    public void addAnimal(Animal addAnimal){
        if(size == members.length){
            expandCapacity();
        }
        
        members[size] = addAnimal;
        size++;
    }
    
    private void expandCapacity(){
        Animal[] larger = new Animal[members.length*2];
        for(int i=0; i < members.length; i++){
            larger[i] = members[i];
        }
        members = larger;
    }
    
    public int getNumOfAnimals(){
        return size;
    }
    
    public String getGroceryShoppingList(){
        String shopping = "";        
        for(int i=0; i < size; i++){
            shopping += members[i].getFoodType();
            if(i < size-1){
                shopping += ", ";
            }
        }
        return shopping;
    }
    
    public double getAmountOfFoodPerDay(){
        double amount = 0;        
        for(int i=0; i < size; i++){
            amount += members[i].amountEatenPerDay();
        }
        return amount;
    }
    
    public int findAnimal(String type, String name){    
        for(int i=0; i < size; i++){
            if((members[i].getName()).equals(name) && (members[i].getType()).equals(type)){
                return i;
            }
        }
        return -1;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String toString()
    {
        String s = "This Zoo contains "+size+" members. They are: \n\n";
        for(int i=0; i < size; i++){
            s += members[i].toString() + "\n";
        }
        
        return s;
    }
    
    public static void main(String[] args){
        Zoo myZoo = new Zoo();
        
        Animal a1 = new Animal("armadillo","Charlotte", 15, "grain", 4, 0.05);
        Animal a2 =  new Animal("hedgehog","Heidi", 1, "grass", 10, 0.2);
        Animal a3 =  new Animal("koala","Chichi", 20, "eucalyptus", 1, 0.05);
        Animal a4 =  new Animal("elephant","Clara", 15000, "Portulacaria afra", 5, 0.10);
        
        myZoo.addAnimal(a1);
        myZoo.addAnimal(a2);
        myZoo.addAnimal(a3);
        myZoo.addAnimal(a4);
        
        System.out.println(myZoo);
        System.out.println(myZoo.getGroceryShoppingList());
        System.out.println("The animals in this zoo eat: "+myZoo.getAmountOfFoodPerDay()+"lbs of food per day");
    }
}
