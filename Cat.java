public class Cat extends Animal {
    public Cat(String name, double age, double weight, int lvlHungry, String location, Kind kind) {
        super(name, age, weight, lvlHungry, location, kind);
    }

    @Override
    public void eat(String food) {
        super.eat("трава");
    }

    @Override
    public void sound(String tone) {
        super.sound("Мяу");
    }

    @Override
    public void walk(String walk) {
        super.walk("Бігає на 4 лапках");
    }
}
