public class Fish extends Animal {
    public Fish(String name, double age, double weight, int lvlHungry, String location, Kind kind) {
        super(name, age, weight, lvlHungry, location, kind);
    }

    @Override
    public void eat(Food food) {
        if (food.getCategory() == Food.Category.ТРАВА) {
            System.out.println("Рибка " + name + " їсть " + food.getName());
            int reduction = food.isHungry() ? 25 : 10;
            lvlHungry -= reduction;
            if (lvlHungry < 0) lvlHungry = 0;
            System.out.println("Рівень голоду знизився до " + lvlHungry + "%");
        } else {
            System.out.println("Рибка " + name + " ігнорує " + food.getName());
        }
    }

    @Override
    public void sound(String tone) {
        super.sound("Буль");
    }

    @Override
    public void walk(String walk) {
        super.walk("Плаває");
    }
}