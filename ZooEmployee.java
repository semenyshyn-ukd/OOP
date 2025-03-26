public class ZooEmployee {
    protected int id;
    protected String nameEmployee;
    protected int experience;
    protected String profession;

    protected ZooEmployee(int id, String nameEmployee, int experience, String profession) {
        this.id = id;
        this.nameEmployee = nameEmployee;
        this.experience = experience;
        this.profession = profession;
    }

    public String talkAboutAnimal(Animal animal) {
        return nameEmployee + " розповідає про тварину: " + animal.name;
    }

    public String canAccessAnimal(Animal animal) {
        if (animal.kind == Animal.Kind.ХИЖАК && experience < 3) {
            return "Досвід працівника " + nameEmployee + " замалий для роботи з хижаками";
        }
        return "Ви допущені до роботи з " + animal.kind + "!";
    }
}
