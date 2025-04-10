public class Bear extends Animal {
    public Bear(String name, double age, double weight, int lvlHungry, String location, Kind kind) {
        super(name, age, weight, lvlHungry, location, kind);
    }

    @Override
    public void eat(Food food) {
        if (food.getCategory() == Food.Category.КРУПИ) {
            System.out.println("Ведмедик " + name + " їсть " + food.getName());
            int reduction = food.isHungry() ? 35 : 15;
            lvlHungry -= reduction;
            if (lvlHungry < 0) lvlHungry = 0;
            System.out.println("Рівень голоду знизився до " + lvlHungry + "%");
        } else if (food.getCategory() == Food.Category.ТРАВА) {
            System.out.println("Ведмедик " + name + " їсть " + food.getName());
            int reduction = food.isHungry() ? 20 : 10;
            lvlHungry -= reduction;
            if (lvlHungry < 0) lvlHungry = 0;
            System.out.println("Рівень голоду знизився до " + lvlHungry + "%");
        } else {
            System.out.println("Ведмедик " + name + " не їсть " + food.getName());
        }
    }

    @Override
    public void sound(String tone) {
        super.sound("АААААРРРР");
    }

    @Override
    public void walk(String walk) {
        super.walk("Бігає косолапо");
    }
}