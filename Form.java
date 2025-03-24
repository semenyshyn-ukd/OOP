public class Form {
    String name;
    Integer birthday;
    String hobby;
    Integer duration;
    String level;
    Boolean marriage;
    Double salary;

    public Form(String name, int birthday, String hobby, int duration, String level, boolean marriage, double salary) {
        this.name = name;
        this.birthday = birthday;
        this.hobby = hobby;
        this.duration = duration;
        this.level = level;
        this.marriage = marriage;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name;
    }

    public String aboutMyself(){
        return "\n Name: " + name +
                "\n YearOfBirthday: " + birthday + "year" +
                "\n Hobby: " + hobby +
                "\n Duration: " + duration + "years old" +
                "\n Level: " + level +
                "\n Marriage: " + (marriage ? "YES" : "NO") +
                "\n Salary: " + salary;
    }
}