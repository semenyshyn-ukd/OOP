public class Character {
    protected String name;
    protected int health;

    public void protect1(String shield) {
        System.out.println("Захисний інструмент " + name + ": " + shield);
    }
    public void protect2(String armoredVest, String helmet) {
        System.out.println("Захисний костюм " + name + ": " + armoredVest + " " + helmet);
    }

    public void attac1(String gun, String knee, String stunGan){
        System.out.println("Зброя для атаки для" + name + ": " + gun + " " + knee + " " + stunGan);
    }
    public void attac2(String sword, String spear, String sledgehammer){
        System.out.println("Зброя дл атаки для" + name + ": " + sword + " " + spear + " " + sledgehammer);
    }

    public void speccialAttac(){}
}
