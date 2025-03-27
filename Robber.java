public class Robber extends Character{
    public Robber(String name, int health){
        super(name, health);
    }
    @Override
    public void speccialAttac() {
        System.out.println(name + " Ховається та захищається");
    }
}
