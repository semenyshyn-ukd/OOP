import java.util.*;

public class Bank {
    ArrayList<BankAccount> card = new ArrayList<>();

    //Додавання рахунку
    public void add(BankAccount account) {
        card.add(account);
    }

    //Отримуємо рахунок по номеру
    public void getCard(int accountNumber, ArrayList<BankAccount> card) {
        for (BankAccount account : card) {
            if (account.getAccountNumber() == accountNumber) {
                System.out.println("Ваш рахунок: " + account);
                return;
            }
        }
        System.out.println("Такого рахунку не існує");
    }

    //Вивести всі рахунки
    public void showCard(){
        for (BankAccount account : card) {
            System.out.println(account);
        }
    }

    //Переказ з одного рахунку на інший
    public void transaction(int senderAccountNumber, int receiverAccountNumber, double amount) {
        BankAccount sender = null;
        BankAccount receiver = null;

        for (BankAccount account : card) {
            if (account.getAccountNumber() == senderAccountNumber) {
                sender = account;
            }
            if (account.getAccountNumber() == receiverAccountNumber) {
                receiver = account;
            }
        }

        if (sender == null || receiver == null) {
            System.out.println("Один з акаунтів не знайдений.");
            return;
        }

        if (sender.getBalance() < amount) {
            System.out.println("На рахунку відправника недостатньо коштів для переказу.");
            return;
        }

        // Знімаємо кошти з рахунку відправника
        sender.setBalance(sender.getBalance() - amount);
        // Додаємо кошти на рахунок отримувача
        receiver.setBalance(receiver.getBalance() + amount);

        System.out.println("Переказ успішно завершено!");
        System.out.println("Рахунок відправника: -" + amount);
        System.out.println("Рахунок отримувача: +" + amount);
    }
}
