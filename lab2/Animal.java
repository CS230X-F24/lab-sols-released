/**
 * Animal.java
 * CS230 Lab on creating java user-defined classes.
 * 
 * @author CD for CS230X (adapted from Sohie and Stella)
 * @version F24
 *
 * */

public class Animal {
    
    // instance variables
    private String type; 
    private String name; 
    private double weight; 
    private String foodType;
    private int numberOfFeeds;
    private double quantityPerFeed;

    /**
     * Constructor for Animal objects
     * 
     * @param type the type of the animal
     * @param name the name of the animal
     * @param weight the weight of the animal
     * @param foodType the type of food this animal eats
     * @param numberOfFeeds how many times this animal eats in a day (within 24h)
     * @param quantityPerFeed what percentage of its body weight this animal eats at each feed
     */
    public Animal(String type, String name, double weight, String foodType, int numberOfFeeds, double quantityPerFeed) {
        this.type = type;
        this.name = name;
        this.weight = weight;
        this.foodType = foodType;
        this.numberOfFeeds = numberOfFeeds;
        this.quantityPerFeed = quantityPerFeed;
    }

    /**
     * It constructs an animal with the given type and name.
     * By default the animal is silent (no voice), has 4 legs, cannot fly, and has good health
     *
     * @param t the type of the animal
     * @param n the name of the animal
     */
    public Animal(String type, String name) {
        this(type, name, 0.0, "", 0, 0.0);
    }

    /**
     * Returns the name of this animal
     *
     * @return The name of this animal
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the type of the animal
     *
     * @return The type of this animal
     */
    public String getType() {
        return type;
    }

    /**
     * Returns the weight of the animal
     *
     * @return The weight of this animal
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Returns the type of food this animal eats
     *
     * @return the type of food this animal eats
     */
    public String getFoodType(){
        return foodType;
    }

    /**
     * Returns the number of feeds of this animal
     *
     * @return the number of feeds of this animal
     */
    public int getNumberOfFeeds() {
        return numberOfFeeds;
    }
    
    /**
     * Returns the quantity of food eaten by this animal per feed
     *
     * @return the quantity of food eaten by this animal per feed
     */
    public double getQuantityPerFeed() {
        return quantityPerFeed;
    }
    
    /**
     * Sets the weight of this animal to the input value
     *
     * @param int the weight in lbs of this animal
     */
    public void setWeight(double num) {
        this.weight = num;
    }
    
    /**
     * Sets the type of food this animal eats
     *
     * @param the type of food this animal eats
     */
    public void setFoodType(String food) {
        this.foodType = food;
    }
    
    /**
     * Sets the number of feeds for this animal
     *
     * @param the number of feeds for this animal
     */
    public void setNumberOfFeeds(int num) {
        this.numberOfFeeds = num;
    }
    
    /**
     * Sets the quantity eaten per feed
     *
     * @param the quantity eaten per feed
     */
    public void setQuantityPerFeed(double percentage) {
        this.quantityPerFeed = percentage;
    }

    /**
     * Calculates the amount of food (in lbs) that this animal eats per feed
     */
    public double amountEatenPerFeed() {
        return quantityPerFeed * weight;
    }
    
    /**
     * Calculates the amount of food eaten by this animal every day
     */
    public double amountEatenPerDay() {
        return numberOfFeeds * amountEatenPerFeed();
    }
    
    /**
     * Calculates how often (in hours) this animal needs to eat
     */
    public double frequencyOfFeeds() {
        return 24 / numberOfFeeds;
    }

    /**
     * Returns true if this animal and the input one have 
     * the same type and the same name, false othrwise
     * 
     * @param The animal to be compared for equality to this one
     * @return true if the two animals are the same, false otherwise
     */

    public boolean equals(Animal other) {
        return (this.type).equals(other.type) && (this.name).equals(other.name);
    }

    /**
     * Returns a string representation of this animal
     * 
     * @return A string containing all atributes of this animal
     */
    public String toString() {
        String s = "Animal: "+name + " is a " + type;
        s+= "\nWeight: "+weight+" lbs";
        s+= "\nEats: "+foodType; 
        s+= "\nSchedule: "+amountEatenPerFeed()+" lbs every "+frequencyOfFeeds()+" hours\n"; 
        return s;
    }
    
    /**
     * Main method to test this class
     * 
     * @param this main does not need input arguments
     */
    public static void main (String [] args ) {
        System.out.println("-------------- Starting Testing --------------");

        Animal pet1 = new Animal("armadillo","Charlotte", 15, "grain", 4, 0.05);
        Animal pet2 =  new Animal("hedgehog","Heidi", 1, "grass", 10, 0.2);
        Animal pet3 =  new Animal("koala","Chichi", 20, "eucalyptus", 1, 0.05);

        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println(pet3);
    }
}