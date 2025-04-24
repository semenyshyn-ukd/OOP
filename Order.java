import java.util.ArrayList;

public class Order {
    ArrayList<String> orders;
    private double total_price;
    private Notify notify;
    private Payment payment;

    public Order() {
        this.orders = new ArrayList<String>();
        this.total_price = 0.0;
        this.notify = notify;
        this.payment = payment;
    }

    public void setNotify(Notify notify) {
        this.notify = notify;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void addOrder(String order) {
        this.orders.add(order);
        System.out.println("Створено замовлення: " + order);
    }

    public void totalPrice(double price) {
        this.total_price += price;
        System.out.println("Загальна сума замовлення: " + this.total_price);
    }

    public boolean order() {
        boolean isPay = payment.pay(total_price);

        if (isPay) {
            notify.notify("створено замовлення на суму " + this.total_price);
            return true;
        } else {
            notify.notify("помилка при створенні замовлення!");
            return false;
        }
    }
}
