public class Priest extends Character{
    public Priest(String name, int health) {
        super(name, health);
    }
    @Override
    public void speccialAttac() {
        System.out.println(name + " Захищається та атакує чарами");
    }
}
