public class Bird extends Animal {
    public Bird(String name, double age, double weight, int lvlHungry, String location, Kind kind) {
        super(name, age, weight, lvlHungry, location, kind);
    }

    @Override
    public void eat(Food food) {
        if (food.getCategory() == Food.Category.КРУПИ) {
            System.out.println("Пташка " + name + " радісно клює " + food.getName());
            int reduction = food.isHungry() ? 35 : 15;
            lvlHungry -= reduction;
            if (lvlHungry < 0) lvlHungry = 0;
            System.out.println("Рівень голоду знизився до " + lvlHungry + "%");
        } else if (food.getCategory() == Food.Category.ТРАВА) {
            System.out.println("Пташка " + name + " клює " + food.getName());
            int reduction = food.isHungry() ? 20 : 10;
            lvlHungry -= reduction;
            if (lvlHungry < 0) lvlHungry = 0;
            System.out.println("Рівень голоду знизився до " + lvlHungry + "%");
        } else {
            System.out.println("Пташка " + name + " відвертається від " + food.getName());
        }
    }

    @Override
    public void sound(String tone) {
        super.sound("Цвірінь");
    }

    @Override
    public void walk(String walk) {
        super.walk("Літає та стрибає");
    }
}