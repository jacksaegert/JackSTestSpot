public class Train {
    // Private variables
    private double condition;
    private double speed;
    private int numberOfCars;
    private int numberOfPassengers;
    private String paintColor;
    private double fuelLeft;

    // Constructor
    public Train(double condition, double speed, int numberOfCars, int numberOfPassengers, String paintColor, double fuelLeft) {
        this.condition = condition;
        this.speed = speed;
        this.numberOfCars = numberOfCars;
        this.numberOfPassengers = numberOfPassengers;
        this.paintColor = paintColor;
        this.fuelLeft = fuelLeft;
    }

    // Public methods
    public void repair() {
        condition += 10;
    }

    public void accelerate(double amount) {
        speed += amount;
    }

    public void expand(int cars) {
        numberOfCars += cars;
    }

    public void load(int passengers) {
        numberOfPassengers += passengers;
    }

    public void repaint(String newColor) {
        paintColor = newColor;
    }

    public void refuel() {
        fuelLeft += 10;
    }

    // Getters for accessing private variables (optional)
    public double getCondition() {
        return condition;
    }

    public double getSpeed() {
        return speed;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public String getPaintColor() {
        return paintColor;
    }

    public double getFuelLeft() {
        return fuelLeft;
    }
    @Override
    public String toString() {
        return "Train{" +
                "Condition=" + condition +
                ", Speed=" + speed +
                ", Number Of Cars=" + numberOfCars +
                ", Number Of Passengers=" + numberOfPassengers +
                ", Paint Color='" + paintColor + '\'' +
                ", Fuel Left=" + fuelLeft +
                '}';
    }
}