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
    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}

    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}

    public int getMaxSpeed() {return maxSpeed;}
    public void setMaxSpeed(int maxSpeed) {this.maxSpeed = maxSpeed;}

    public double getVolume() {return volume;}
    public void setVolume(double volume) {this.volume = volume;}

    public void speedNow(int speedNow){
        if(speedNow < maxSpeed || speedNow == maxSpeed){
            System.out.println("SpeedNow: " + speedNow + "км/год");
        } else {
            System.out.println("Не може перевищувати максимальну швидкість!");
        }
    }
    public double showVolume(){ return volume; }

    @Override
    public String toString() {
        return "\nVehicle: " +
                "\nBrand: " + brand +
                "\nModel: " + model +
                "\nMaxSpeed: " + maxSpeed + "км/год" +
                "\nVolume: " + volume + "л";
    }
}
