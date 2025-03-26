public class EmployeeTrain extends ZooEmployee{
    public EmployeeTrain(int id, String nameEmployee, int experience, String profession) {
        super(id, nameEmployee, experience, profession);
    }
    public void train(Animal animal) {
        String accessMessage = canAccessAnimal(animal);
        if (accessMessage.contains("допущені")) {
            System.out.println("Працівник " + id + ": " + nameEmployee + " тренує " + animal.name);
        } else {
            System.out.println(accessMessage);
        }
    }
    @Override
    public String talkAboutAnimal(Animal animal) {
        return super.talkAboutAnimal(animal);
    }
}
