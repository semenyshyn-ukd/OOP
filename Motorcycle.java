public class Motorcycle extends Vehicle implements Switch, ForPetrols{
    private double lvlPetrol;
    private boolean engineStarted;
    private final double consumption = 4.5;

    public Motorcycle(String brand, String model, int maxSpeed, double volume, double lvlPetrol) {
        super(brand, model, maxSpeed, volume);
        this.lvlPetrol = lvlPetrol;
        this.engineStarted = false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nРівень палива: " + lvlPetrol + "%";
    }

    @Override
    public void start() {
        if (engineStarted) {
            System.out.println("Мотоцикл " + brand + " " + model + " рушив");
        } else {
            System.out.println("Спочатку запустіть двигун");
        }
    }

    @Override
    public void stop() {
        System.out.println("Мотоцикл " + brand + " " + model + " зупинився");
    }

    @Override
    public void startEngine() {
        engineStarted = true;
        System.out.println("Двигун мотоцикла " + brand + " " + model + " запущено");
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