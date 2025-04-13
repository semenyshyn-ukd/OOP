public class Main {
    public static void main(String[] args) {Motorcycle motorcycle = new Motorcycle("Forte", "FINDER 250", 250, 2.7, 45.5);
        Car car = new Car("Porsche", "Panamera", 300, 2.7, 89);
        Bicycle bicycle = new Bicycle("Україна", "Турбо", 30, 0);

        Vehicle[] vehicles = {car, motorcycle, bicycle};

        System.out.println("Інформація про всі транспортні засоби");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
            System.out.println();
        }

        demonstrateAllMethods(vehicles);
    }

    public static void demonstrateAllMethods(Vehicle[] vehicles) {
        System.out.println("\nДемонстрація методів всіх об'єктів");

        for (Vehicle vehicle : vehicles) {
            System.out.println("\n--- " + vehicle.getBrand() + " " + vehicle.getModel() + " ---");

            System.out.println("Місткість: " + vehicle.showVolume() + "л");

            vehicle.speedNow(20);
            vehicle.speedNow(vehicle.getMaxSpeed() + 10);

            Switch switchable = (Switch) vehicle;

            if (vehicle instanceof ForPetrols) {
                ForPetrols petrolVehicle = (ForPetrols) vehicle;
                petrolVehicle.startEngine();
                switchable.start();
                petrolVehicle.maxRouteLength();
                petrolVehicle.refuel(20);
                petrolVehicle.maxRouteLength();
            } else {
                switchable.start();
            }

            switchable.stop();
        }
    }
}