public class Vehicle {
    protected String brand;
    protected String model;
    protected int maxSpeed;
    protected double volume;

    public Vehicle(String brand, String model, int maxSpeed, double volume) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.volume = volume;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getVolume() {
        return this.volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void speedNow(int speedNow) {
        if (speedNow > this.maxSpeed) {
            System.out.println("Не може перевищувати максимальну швидкість!");
        } else {
            System.out.println("SpeedNow: " + speedNow + " км/год");
        }
    }

    public double showVolume() {
        return this.volume;
    }

    public String toString() {
        return "Vehicle: \nBrand: " + this.brand +
                "\nModel: " + this.model +
                "\nMaxSpeed: " + this.maxSpeed + " км/год" +
                "\nVolume: " + this.volume + "л" +
                "\nLevel Petrol";
    }
}