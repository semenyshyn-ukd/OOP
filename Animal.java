public class Animal {
    protected String name;
    protected enum Kind{ХИЖАК, ТРАВОЇДНА}
    protected int age;
    protected int weight;
    protected int lvlHungry;
    protected String location;
    protected Kind kind;

    public void sound(String name, String sound) {
        System.out.println("Тваринка " + name + " каже " + sound);
    }
    public void eat(String name, String eat) {
        System.out.println("Тваринка " + name + " їсть " + eat);

        if(kind.equals("ХИЖАК") && eat.equalsIgnoreCase("Трава")){
            System.out.println("Тваринка відмовиться від трави чи фруктів!");
        }
        if (kind.equals("ТРАВОЇДНА") && eat.equalsIgnoreCase("м'ясо")){
            System.out.println("Тваринка відмовиться від м'яса!");
        }
    }
    public void walk(String name, String walk) {
        System.out.println("Тваринка " + name + " рухається" + walk);
    }
    public void show(String name, String kind, int age, int weight, int lvlHungry, String location) {
        System.out.println("\nНазва тваринки: " + name +
                "\n");
    }
}
