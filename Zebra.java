public class Zebra extends Animal {
    public Zebra(String name, double age, double weight, int lvlHungry, String location, Kind kind) {
        super(name, age, weight, lvlHungry, location, kind);
    }

    @Override
    public void eat(String food) {
        super.eat("Трава");
    }

    @Override
    public void sound(String tone) {
        super.sound("Жування листя");
    }

    @Override
    public void walk(String walk) {
        super.walk("Ходить на 4 лапах");
    }
}