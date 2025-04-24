public class Card implements Payment {
    private String number;

    public Card(String number) {
        this.number = number;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Оплачено");
        return true;
    }
}
