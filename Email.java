public class Email implements Notify {
    private String email;

    public Email(String email) {
        this.email = email;
    }

    @Override
    public void notify(String message) {
        System.out.println("Користувачу " + email + ": " + message);
    }
}
