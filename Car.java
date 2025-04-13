public class Car extends Vehicle implements Switch, ForPetrols {
    private double lvlPetrol;
    private boolean engineStarted;
    private final double consumption = 8.0;

    public Car(String brand, String model, int maxSpeed, double volume, double lvlPetrol) {
        super(brand, model, maxSpeed, volume);
        this.lvlPetrol = lvlPetrol;
    }

    @Override
    public String toString() {
        super.toString();
        return "Рівень палива: " + lvlPetrol + "%";
    }

    @Override
    public void start() {
        if (engineStarted) {
            System.out.println("Машина " + brand + " " + model + " рушила");
        } else {
            System.out.println("Спочатку запустіть двигун");
        }
    }

    @Override
    public void stop() {
        System.out.println("Машина " + brand + " " + model + " зупинилась");
    }

    @Override
    public void startEngine() {
        engineStarted = true;
        System.out.println("Двигун машини " + brand + " " + model + " запущено");
    }

    @Override
    public void refuel(double amount) {
        if (lvlPetrol + amount > 100) {
            lvlPetrol = 100;
            System.out.println("Бак заповнено на 100%");
        } else {
            lvlPetrol += amount;
            System.out.println("Заправлено " + amount + "%. Поточний рівень: " + lvlPetrol + "%");
        }
    }

    @Override
    public double maxRouteLength() {
        double maxDistance = (volume * lvlPetrol / 100) / consumption * 100;
        System.out.println("Максимальна відстань, яку можна проїхати: " + maxDistance + " км");
        return maxDistance;
    }
}