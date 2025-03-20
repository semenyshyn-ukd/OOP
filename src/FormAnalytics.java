import java.util.*;
public class FormAnalytics {
    ArrayList<Form> persons = new ArrayList<>();
    //практична 5

    //створення колекції з анкетами
    public void add(String name, int birthday, String hobby, int duration, String level, boolean marriage, double salary){
        persons.add(new Form(name, birthday, hobby, duration, level, marriage, salary));
    }

    //переглянути все
    public void show(){
        for (Form show : persons){
            System.out.println(show.aboutMyself());
        }
    }

    //середня зп
    public void middleSalary(){
        int middleSalary = 0;

        for (Form middle : persons){
            middleSalary += middle.salary;
        }

        System.out.println("Середня зарплата: " + middleSalary);
    }

    //одружені люди
    public void marriaages(){
        ArrayList<Form> marriageList = new ArrayList<>();

        for (Form marriage : persons){
            if (marriage.marriage == true) {
                marriageList.add(marriage);
            }
        }
        System.out.println("Одружені люди: " + marriageList);
    }

    //сортування за віком
}
