public class Warrior extends Character{
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void speccialAttac() {
        System.out.println(name + " Вбиває зброєю");
    }
}
