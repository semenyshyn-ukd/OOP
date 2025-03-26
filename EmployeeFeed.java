public class EmployeeFeed extends ZooEmployee{
    public EmployeeFeed(int id, String nameEmployee, int experience, String profession) {
        super(id, nameEmployee, experience, profession);
    }
    public void feed(Animal animal) {
        String accessMessage = canAccessAnimal(animal);
        if (accessMessage.contains("допущені")) {
            System.out.println("Працівник " + id + ": " + nameEmployee + " годує " + animal.name);
        } else {
            System.out.println(accessMessage);
        }
    }

    @Override
    public String talkAboutAnimal(Animal animal) {
        return super.talkAboutAnimal(animal);
    }
}
