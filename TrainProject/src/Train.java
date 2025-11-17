/**
 * The {@code Train} class represents a train with various attributes such as condition, speed, 
 * number of cars, number of passengers, paint color, and fuel left. It provides methods to 
 * modify these attributes and simulate train operations.
 * 
 * <p>This class is designed to model a train's behavior and state in a simplified manner.
 * It includes methods for repairing, accelerating, expanding, loading passengers, repainting, 
 * and refueling the train.</p>
 * 
 * @Collaborator: GitHub Copilot
 * 
 * @author: Jack Saegert
 */
/**
 * Represents a Train with various attributes such as condition, speed, number of cars,
 * number of passengers, paint color, and fuel left. Provides methods to modify and retrieve
 * these attributes.
 */
public class Train {

    private double condition;
    private double speed;
    private int numberOfCars;
    private int numberOfPassengers;
    private String paintColor;
    private double fuelLeft;
    private Conductor conductor;

    /**
     * Constructs a Train object with specified attributes and a Conductor.
     *
     * @param condition        The condition of the train (percentage).
     * @param speed            The speed of the train (in km/h).
     * @param numberOfCars     The number of cars in the train.
     * @param numberOfPassengers The number of passengers in the train.
     * @param paintColor       The paint color of the train.
     * @param fuelLeft         The amount of fuel left in the train (percentage).
     * @param conductor        The Conductor object associated with the train.
     */
    public Train(double condition, double speed, int numberOfCars, int numberOfPassengers, String paintColor, double fuelLeft, Conductor conductor) {
        this.condition = condition;
        this.speed = speed;
        this.numberOfCars = numberOfCars;
        this.numberOfPassengers = numberOfPassengers;
        this.paintColor = paintColor;
        this.fuelLeft = fuelLeft;
        this.conductor = conductor;
    }

    /**
     * Constructs a Train object with a simple configuration.
     * Sets default values for condition, speed, number of passengers, and fuel left.
     *
     * @param numberOfCars The number of cars in the train.
     * @param paintColor   The paint color of the train.
     */
    public Train() {
        this.condition = 100;
        this.speed = 60;
        this.numberOfCars = 5;
        this.numberOfPassengers = 500;
        this.paintColor = "Blue";
        this.fuelLeft = 100;
        this.conductor = new Conductor("John");
    }

    /**
     * Repairs the train by increasing its condition.
     */
    public void repair() {
        condition += 10;
    }

    /**
     * Accelerates the train by increasing its speed.
     *
     * @param amount The amount to increase the speed by (in km/h).
     */
    public void accelerate(double amount) {
        speed += amount;
    }

    /**
     * Expands the train by adding more cars.
     *
     * @param cars The number of cars to add to the train.
     */
    public void expand(int cars) {
        numberOfCars += cars;
    }

    /**
     * Loads more passengers onto the train.
     *
     * @param passengers The number of passengers to add to the train.
     */
    public void load(int passengers) {
        numberOfPassengers += passengers;
    }

    /**
     * Repaints the train with a new color.
     *
     * @param newColor The new paint color for the train.
     */
    public void repaint(String newColor) {
        paintColor = newColor;
    }

    /**
     * Refuels the train by adding more fuel.
     */
    public void refuel() {
        fuelLeft += 10;
    }

    /**
     * Retrieves the condition of the train.
     *
     * @return The condition of the train (percentage).
     */
    public double getCondition() {
        return condition;
    }

    /**
     * Retrieves the speed of the train.
     *
     * @return The speed of the train (in km/h).
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Retrieves the number of cars in the train.
     *
     * @return The number of cars in the train.
     */
    public int getNumberOfCars() {
        return numberOfCars;
    }

    /**
     * Retrieves the number of passengers in the train.
     *
     * @return The number of passengers in the train.
     */
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    /**
     * Retrieves the paint color of the train.
     *
     * @return The paint color of the train.
     */
    public String getPaintColor() {
        return paintColor;
    }

    /**
     * Retrieves the amount of fuel left in the train.
     *
     * @return The amount of fuel left in the train (percentage).
     */
    public double getFuelLeft() {
        return fuelLeft;
    }

    /**
     * Returns a string representation of the Train object.
     *
     * @return A string containing the train's attributes.
     */
    @Override
    public String toString() {
        return "Train {" +
                "Condition=" + condition +
                ", Speed=" + speed +
                ", Number Of Cars=" + numberOfCars +
                ", Number Of Passengers=" + numberOfPassengers +
                ", Paint Color='" + paintColor + '\'' +
                ", Fuel Left=" + fuelLeft +
                "} \n" +
                conductor.toString();
    }
}