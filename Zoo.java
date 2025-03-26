import java.util.*;

public class Zoo {
    private ArrayList<Animal> animals;
    private ArrayList<ZooEmployee> employees;

    public Zoo() {
        animals = new ArrayList<>();
        employees = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println("Додано тварину: " + animal.name);
    }

    public void addEmployee(ZooEmployee employee) {
        employees.add(employee);
        System.out.println("Додано працівника: " + employee.nameEmployee);
    }

    public void changeExperience(int employeeId, int newExperience) {
        for (ZooEmployee employee : employees) {
            if (employee.id == employeeId) {
                employee.experience = newExperience;
                System.out.println("Змінено рівень досвіду працівника " + employee.nameEmployee + " на " + newExperience);
                return;
            }
        }
        System.out.println("Працівника з ID " + employeeId + " не знайдено.");
    }

    public void showAnimals() {
        System.out.print("\nСписок тварин у зоопарку:");
        for (Animal animal : animals) {
            System.out.println(animal.show());
        }
    }

    public void showEmployees() {
        System.out.println("\nСписок працівників у зоопарку:");
        for (ZooEmployee employee : employees) {
            System.out.println(employee.nameEmployee + " (ID: " + employee.id + ", Досвід: " + employee.experience + ")");
        }
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        // Додаємо тварин
        Cat cat1 = new Cat("Аліса", 8, 5, 80, "будинок/квартира", Animal.Kind.ХИЖАК);
        zoo.addAnimal(cat1);

        Zebra zebra1 = new Zebra("Зібров", 67, 120, 100, "Африка", Animal.Kind.ТРАВОЇДНА);
        zoo.addAnimal (zebra1);

        Fish fish1 = new Fish("Немо", 0, 0.1, 1, "Водичка", Animal.Kind.ТРАВОЇДНА);
        zoo.addAnimal(fish1);

        // Додаємо працівників
        EmployeeFeed feeder = new EmployeeFeed(1, "Алекс", 1, "Годувальник");
        zoo.addEmployee(feeder);

        EmployeeTrain trainer = new EmployeeTrain(2, "Степан", 4, "Тренер");
        zoo.addEmployee(trainer);

        // Тестуємо годування та тренування
        System.out.println(" ");
        feeder.feed(cat1); // Не має доступу
        feeder.feed(zebra1); // Має доступ

        trainer.train(cat1); // Має доступ
        trainer.train(zebra1); // Має доступ

        // Показуємо всіх тварин
        zoo.showAnimals();

        // Показуємо всіх працівників
        zoo.showEmployees();
    }
}