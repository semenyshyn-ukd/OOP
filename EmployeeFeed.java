public class EmployeeFeed extends ZooEmployee {
    public EmployeeFeed(int id, String nameEmployee, int experience, String profession) {
        super(id, nameEmployee, experience, profession);
    }

    public void feed(Animal animal, Food food) {
        String accessMessage = canAccessAnimal(animal);
        if (accessMessage.contains("допущені")) {
            System.out.println("Працівник " + id + ": " + nameEmployee + " годує " + animal.getName() + " їжею " + food.getName());
            animal.eat(food);
        } else {
            System.out.println(accessMessage);
        }
    }

    @Override
    public String talkAboutAnimal(Animal animal) {
        return super.talkAboutAnimal(animal);
    }
}