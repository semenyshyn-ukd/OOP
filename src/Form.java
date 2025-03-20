public class Form {
    String name;
    Integer birthday;
    String hobby;
    Integer duration;
    String level;
    Boolean marriage;
    Double salary;

    public Form(String name, int birthday, String hobby, int duration, String level, boolean marriage, double salary) {}

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
