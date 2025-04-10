public class Cat extends Animal {
    public Cat(String name, double age, double weight, int lvlHungry, String location, Kind kind) {
        super(name, age, weight, lvlHungry, location, kind);
    }

    @Override
    public void eat(Food food) {
        if (food.getCategory() == Food.Category.МЯСО) {
            System.out.println("Кіт " + name + " із задоволенням їсть " + food.getName() + "!");
            int reduction = food.isHungry() ? 40 : 20;
            lvlHungry -= reduction;
            if (lvlHungry < 0) lvlHungry = 0;
            System.out.println("Рівень голоду знизився до " + lvlHungry + "%");
        } else {
            System.out.println("Кіт " + name + " неохоче дивиться на " + food.getName());
        }
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