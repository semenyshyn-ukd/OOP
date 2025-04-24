public class SMS implements Notify {
    private String phone;

    public SMS(String phone) {
        this.phone = phone;
    }

    @Override
    public void notify(String message) {
        System.out.println("Користувачу " + phone + ": " + message);
    }
}
