import java.util.*;
public class FormAnalytics {
    ArrayList<Form> persons = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    //практична 5

    //створення колекції з анкетами
    public void add(Form person) {
        persons.add(person);
    }

    //переглянути все
    public void show() {
        for (Form show : persons) {
            System.out.println(show.aboutMyself());
        }
    }

    //середня зп
    public double middleSalary() {
        double middleSalary = 0;

        for (Form middle : persons) {
            middleSalary += middle.salary;
        }

        if (!persons.isEmpty()) {
            middleSalary = middleSalary / persons.size();
        }

        System.out.println("Середня зарплата: " + middleSalary);

        return middleSalary;
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
    public void sortByAge() {
        Collections.sort(persons, new Comparator<Form>() {
            @Override
            public int compare(Form person1, Form person2) {
                return person1.birthday.compareTo(person2.birthday);
            }
        });

        System.out.println("Відсортовано за роком народження:");
        show();
    }

    //сортування за іменем
    public void sortByName() {
        Collections.sort(persons, new Comparator<Form>() {

            @Override
            public int compare(Form o1, Form o2) {
                return o1.name.compareTo(o2.name);
            }
        });
    }

    //практична 6

    //к-сть анкет
    public void countForms(){
        System.out.println(persons.size());
        }

    //фільтр за роком
    public void filtrAge() {
        ArrayList<Form> filtrAgeList = new ArrayList<>();
        System.out.print("Який вік бажаєте знайти? ");
        int userAge = scanner.nextInt();

        for (Form person : persons) {
            int age = 2025 - person.birthday;
            if (age == userAge) {
                filtrAgeList.add(person);
                System.out.println("К-сть людей з таким віком: " + filtrAgeList.size());
            }
        }
        System.out.println("Людей з таким віком не знайдено!");
    }

    //середній вік всіх
    public void middleAge() {
        int middleAgeList = 0;

        for (Form middle : persons) {
            int age = 2025 - middle.birthday;
            middleAgeList += age;
        }
        System.out.println("Середній вік всіх учасників: " + middleAgeList/persons.size());
    }

    //де зп більше на 10%
    public void coolMiddleSalary() {
        double middleSalary = middleSalary();  // Середня зарплата

        for (Form middle : persons) {
            // Порівнюємо зарплату з середньою зарплатою, підвищеною на 10%
            if (middle.salary >= middleSalary * 1.1) {
                System.out.println("Людина з зп вищою за середню на 10%: " + middle.aboutMyself());
            }
        }
    }

    //топ 3 захоплення
    public void mostPopularHobbies() {
            HashMap<String, Integer> hobbyCount = new HashMap<>();

            for (Form person : persons) {
                String hobby = person.hobby;
                if (hobbyCount.containsKey(hobby)) {
                    hobbyCount.put(hobby, hobbyCount.get(hobby) + 1);
                } else {
                    hobbyCount.put(hobby, 1);
                }
            }

            List<Map.Entry<String, Integer>> sortedHobbies = new ArrayList<Map.Entry<String, Integer>>(hobbyCount.entrySet());

            Collections.sort(sortedHobbies, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                    return entry2.getValue().compareTo(entry1.getValue());
                }
            });

            System.out.println("Топ 3 найпопулярніших захоплень:");
            for (int i = 0; i < Math.min(3, sortedHobbies.size()); i++) {
                Map.Entry<String, Integer> entry = sortedHobbies.get(i);
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

    //сортування по тривалості хобі
    public void sortDuration() {
        Collections.sort(persons, new Comparator<Form>() {
            @Override
            public int compare(Form o1, Form o2) {
                return o1.duration.compareTo(o2.duration);
            }
        });
    }

    //топ 3 хобі одружених і холостих
    public void mostPopularHobbiesByMaritalStatus() {
        // Мапи для підрахунку захоплень для одружених та не одружених осіб
        HashMap<String, Integer> marriedHobbyCount = new HashMap<>();
        HashMap<String, Integer> unmarriedHobbyCount = new HashMap<>();

        // Розподіляємо осіб на одружених та не одружених
        for (Form person : persons) {
            String hobby = person.hobby;
            if (person.marriage == true) {
                marriedHobbyCount.put(hobby, marriedHobbyCount.getOrDefault(hobby, 0) + 1);
            } else {
                unmarriedHobbyCount.put(hobby, unmarriedHobbyCount.getOrDefault(hobby, 0) + 1);
            }
        }

        System.out.println("Топ 3 найпопулярніших захоплень серед одружених:");
        printTopHobbies(marriedHobbyCount);

        System.out.println("Топ 3 найпопулярніших захоплень серед не одружених:");
        printTopHobbies(unmarriedHobbyCount);
    }

    // Метод для виведення топ 3 захоплень
    private void printTopHobbies(HashMap<String, Integer> hobbyCount) {
        List<Map.Entry<String, Integer>> sortedHobbies = new ArrayList<>(hobbyCount.entrySet());

        Collections.sort(sortedHobbies, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry2.getValue().compareTo(entry1.getValue());
            }
        });

        for (int i = 0; i < Math.min(3, sortedHobbies.size()); i++) {
            Map.Entry<String, Integer> entry = sortedHobbies.get(i);
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}