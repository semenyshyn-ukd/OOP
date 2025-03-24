import java.util.*;

public class BankAccount {
    private String owner;
    private int accountNumber;
    private double balance;
    private ArrayList<String> history;

    // Конструктор
    public BankAccount(String owner, int accountNumber, double balance) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.history = new ArrayList<String>();
    }

    // Гетери та сетери
    public String getOwner() {
        return owner;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<String> getHistory() {
        return history;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setHistory(ArrayList<String> history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return "Рахунок: " + accountNumber + ", Власник: " + owner + ", Баланс: " + balance;
    }

    // Поповнення балансу
    public void plusBalance(double amount) {
        setBalance(getBalance() + amount);
        recordTransaction("Поповнення рахунку", amount);
    }

    // Зняття коштів
    public void minusBalance(double amount) {
        if (amount > balance) {
            System.out.println("Недостатньо коштів");
            return;
        }
        setBalance(getBalance() - amount);
        recordTransaction("Зняття коштів", amount);
    }

    // Переглянути баланс
    public void showBalance() {
        System.out.println("Ваш баланс: " + balance);
        history.add("Переглянуто баланс");
    }

    // Переглянути історію транзакцій
    public void showHistory() {
        if (history.isEmpty()) {
            System.out.println("Історія порожня.");
        } else {
            for (String s : history) {
                System.out.println(s);
            }
        }
    }

    // Редагування інформації про власника
    public void editOwner(String newOwner, int newNumber) {
        setOwner(newOwner);
        setAccountNumber(newNumber);
        history.add("Змінено інформацію про власника");
    }

    // Приватний метод для запису транзакцій в історію
    private void recordTransaction(String transactionType, double amount) {
        String transactionDetails = transactionType + ": " + amount;
        history.add(transactionDetails);
    }
}
