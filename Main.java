public class Main {
    public static void main(String[] args) {
        Order order1 = new Order();

        order1.addOrder("Смартфон");
        order1.addOrder("Чохол");

        order1.totalPrice(10000.0);

        Payment cardPayment = new Card("1234-5678-9012-3456");
        order1.setPayment(cardPayment);

        Notify emailNotify = new Email("customer@example.com");
        Notify smsNotify = new SMS("0999031392");
        order1.setNotify(emailNotify);
        order1.setNotify(smsNotify);

        Order_interface orderProcessor = new DoneOrder();
        boolean result = orderProcessor.order(order1);

        if (result) {
            System.out.println("Замовлення успішно оброблено!");
        } else {
            System.out.println("Помилка при обробці замовлення!");
        }
    }
}