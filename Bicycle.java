public class Bicycle extends Vehicle implements Switch {
    public Bicycle(String brand, String model, int maxSpeed, double volume) {
        super(brand, model, maxSpeed, volume);
    }

    @Override
    public void start() {
        System.out.println("Велосипед " + brand + " " + model + " рушив");
    }

    @Override
    public void stop() {
        System.out.println("Велосипед " + brand + " " + model + " зупинився");
    }

    @Override
    public String toString() {
        return super.toString().replace("\nLevel Petrol", "");
    }
}