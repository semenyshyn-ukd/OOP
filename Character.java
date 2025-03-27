public class Character {
    protected String name;
    protected int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }


    public void protect() {
        System.out.println(name + ": захищається");
    }
    public void protect(String protect1, String protect2, String protect3) {
        System.out.println("Захисний костюм: " + protect1 + " " + protect2 + "\nЗахисний інструмент: " + protect3);
    }

    public void attac(){
        System.out.println(name + ": атакує");
    }
    public void attac(String arms1, String arms2, String arms3){
        System.out.println(name + ": атакував " + arms1 + " " + arms2 + " " + arms3);
    }

    public void speccialAttac(){
        System.out.println("");
    }

    @Override
    public String toString() {
        return "\nПерсонаж: " + name + "\nЗдоров'я:  " + health;
    }
}
