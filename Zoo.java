import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals;
    private ArrayList<ZooEmployee> employees;
    private ArrayList<Food> foods;

    public Zoo() {
        animals = new ArrayList<>();
        employees = new ArrayList<>();
        foods = new ArrayList<>();
    }
    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public ArrayList<ZooEmployee> getEmployees() {
        return employees;
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println("Додано нову тварину: " + animal.getName());
    }

    public void addEmployee(ZooEmployee employee) {
        employees.add(employee);
        System.out.println("Додано нового працівника: " + employee.getNameEmployee());
    }

    public void addFood(Food food) {
        foods.add(food);
        System.out.println("Додано нову їжу: " + food.getName());
    }

    public void changeEmployeeExperience(int employeeId, int newExperience) {
        for (ZooEmployee employee : employees) {
            if (employee.getId() == employeeId) {
                int oldExperience = employee.getExperience();
                employee.setExperience(newExperience);
                System.out.println("Змінено досвід працівника " + employee.getNameEmployee() +
                        " з " + oldExperience + " на " + employee.getExperience());
                return;
            }
        }
        System.out.println("Працівника з ID " + employeeId + " не знайдено!");
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Food meat = new Food("М'ясо", true, Food.Category.МЯСО);
        Food grass = new Food("Трава", false, Food.Category.ТРАВА);
        Food grains = new Food("Крупи", true, Food.Category.КРУПИ);

        zoo.addFood(meat);
        zoo.addFood(grass);
        zoo.addFood(grains);

        Cat cat = new Cat("Аліса", 3.5, 4.2, 70, "Приміщення котів", Animal.Kind.ХИЖАК);
        Fish fish = new Fish("Немо", 1.2, 0.3, 40, "Вода", Animal.Kind.ТРАВОЇДНА);
        Bear bear = new Bear("Кеша", 2.0, 0.5, 30, "Берлога", Animal.Kind.ХИЖАК);

        zoo.addAnimal(cat);
        zoo.addAnimal(fish);
        zoo.addAnimal(bear);

        EmployeeFeed feedEmployee = new EmployeeFeed(1, "Іван", 2, "Годувальник");
        EmployeeTrain trainEmployee = new EmployeeTrain(2, "Марія", 4, "Тренер");

        zoo.addEmployee(feedEmployee);
        zoo.addEmployee(trainEmployee);

        System.out.println("\nМожливості тварин");
        for (Animal animal : zoo.getAnimals()) {
            System.out.println(animal.show());
            animal.sound("");
            animal.walk("");
            System.out.println();
        }

        System.out.println("\nГодування тварин");
        for (Animal animal : zoo.getAnimals()) {
            System.out.println("Годує тварину " + animal.getName() + ":");

            for (Food food : zoo.getFoods()) {
                animal.eat(food);
            }
            System.out.println();
        }

        System.out.println("\nРоботи працівників");
        for (ZooEmployee employee : zoo.getEmployees()) {
            for (Animal animal : zoo.getAnimals()) {
                System.out.println(employee.talkAboutAnimal(animal));

                if (employee instanceof EmployeeFeed) {
                    Food appropriateFood = null;
                    if (animal.getKind() == Animal.Kind.ХИЖАК) {
                        for (Food food : zoo.getFoods()) {
                            if (food.getCategory() == Food.Category.МЯСО) {
                                appropriateFood = food;
                                break;
                            }
                        }
                    } else {
                        for (Food food : zoo.getFoods()) {
                            if (food.getCategory() == Food.Category.ТРАВА ||
                                    food.getCategory() == Food.Category.КРУПИ) {
                                appropriateFood = food;
                                break;
                            }
                        }
                    }

                    if (appropriateFood != null) {
                        ((EmployeeFeed) employee).feed(animal, appropriateFood);
                    }
                }

                if (employee instanceof EmployeeTrain) {
                    ((EmployeeTrain) employee).train(animal);
                }
            }
        }

        System.out.println("\nЗміна досвіду працівника");
        zoo.changeEmployeeExperience(1, 3);

        System.out.println("\nПеревірка доступу після зміни досвіду");
        for (Animal animal : zoo.getAnimals()) {
            if (animal.getKind() == Animal.Kind.ХИЖАК) {
                System.out.println(feedEmployee.canAccessAnimal(animal));
            }
        }
    }
}