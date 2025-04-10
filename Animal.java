public class Animal {
    protected String name;
    protected enum Kind { ХИЖАК, ТРАВОЇДНА }
    protected double age;
    protected double weight;
    protected int lvlHungry;
    protected String location;
    protected Kind kind;

    public Animal(String name, double age, double weight, int lvlHungry, String location, Kind kind) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.lvlHungry = lvlHungry;
        this.location = location;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public Kind getKind() {
        return kind;
    }

    public int getLvlHungry() {
        return lvlHungry;
    }

    public void sound(String tone) {
        System.out.println("Тваринка " + name + " " + tone);
    }

    public void eat(Food food) {
        if (kind == Kind.ХИЖАК) {
            if (food.getCategory() == Food.Category.ТРАВА || food.getCategory() == Food.Category.КРУПИ) {
                System.out.println("Тваринка " + name + " відмовиться від " + food.getName());
            } else {
                System.out.println("Тваринка " + name + " поїла " + food.getName() + "!");
                reduceHunger(food.isHungry() ? 30 : 15);
            }
        } else if (kind == Kind.ТРАВОЇДНА) {
            if (food.getCategory() == Food.Category.МЯСО) {
                System.out.println("Тваринка " + name + " відмовиться від " + food.getName() + "!");
            } else {
                System.out.println("Тваринка " + name + " поїла " + food.getName() + "!");
                reduceHunger(food.isHungry() ? 30 : 15);
            }
        }
    }

    private void reduceHunger(int amount) {
        lvlHungry -= amount;
        if (lvlHungry < 0) lvlHungry = 0;
        System.out.println("Рівень голоду " + name + " знизився до " + lvlHungry + "%");
    }

    public void walk(String walk) {
        System.out.println("Тваринка " + name + " " + walk);
    }

    public String show() {
        return "\nНазва тваринки: " + name +
                "\nВид тваринки: " + kind +
                "\nВік тваринки: " + age + " років" +
                "\nВага тваринки: " + weight + " кг" +
                "\nРівень голоду: " + lvlHungry + "%" +
                "\nЛокація: " + location;
    }
}