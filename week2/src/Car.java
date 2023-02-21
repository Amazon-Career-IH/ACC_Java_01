public class Car {
    private int id;
    private final String color;
    private double weight;
    private int topSpeed;
    private String model;
    private static int counter = 0;

    public Car(String color, double weight, int topSpeed, String model) {
        this.id = counter++;
        this.color = color;
        setWeight(weight);
        this.topSpeed = topSpeed;
        this.model = model;
    }

    public Car(String model) {
        this.id = counter++;
        this.color = "Black";
        this.model = model;
    }

    public String getColor() {
        return color;
    }



    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0) {
            System.out.println("No se puede");
        } else {
            this.weight = weight;
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private void increaseSpeed() {
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Car.counter = counter;
    }
}
