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

    public void sound(String tone) {
        System.out.println("Тваринка " + name + " " + tone);
    }

    public void eat(String food) {
        if (kind == Kind.ХИЖАК) {
            if (food.equalsIgnoreCase("Трава") || food.equalsIgnoreCase("Крупи")) {
                System.out.println("Тваринка " + name + " відмовиться від трави");
            } else {
                System.out.println("Тваринка " + name + " поїла " + food + "!");
            }
        } else if (kind == Kind.ТРАВОЇДНА) {
            if (food.equalsIgnoreCase("М'ясо")) {
                System.out.println("Тваринка " + name + " відмовиться від м'яса!");
            } else {
                System.out.println("Тваринка " + name + " поїла " + food + "!");
            }
        }
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