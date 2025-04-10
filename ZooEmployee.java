public class ZooEmployee {
    protected int id;
    protected String nameEmployee;
    protected int experience;
    protected String profession;

    public ZooEmployee(int id, String nameEmployee, int experience, String profession) {
        this.id = id;
        this.nameEmployee = nameEmployee;
        this.experience = experience;
        this.profession = profession;
    }

    public String canAccessAnimal(Animal animal) {
        if (animal.kind == Animal.Kind.ХИЖАК && experience < 3) {
            return "Працівники з досвідом менше 3 не допущені до хижаків!";
        }
        return "Працівники з досвідом " + experience + " допущені до цієї тварини.";
    }

    public String talkAboutAnimal(Animal animal) {
        return "Працівник " + id + ": " + nameEmployee + " розповідає про тварину: " + animal.show();
    }

    public int getId() {
        return id;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public int getExperience() {
        return experience;
    }

    public String getProfession() {
        return profession;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}