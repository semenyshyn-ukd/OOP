public class Main {
    public static void main(String[] args) {
        // Створення об'єкта банку
        Bank bank = new Bank();

        // Створення акаунтів
        BankAccount account1 = new BankAccount("Іван Іванов", 123456, 1000.50);
        BankAccount account2 = new BankAccount("Олексій Петров", 654321, 2000.75);
        BankAccount account3 = new BankAccount("Марія Сидорова", 111222, 1500.00);

        // Додавання акаунтів в банк
        bank.add(account1);
        bank.add(account2);
        bank.add(account3);

        // Виведення всіх акаунтів
        bank.showCard();

        // Викликаємо методи для конкретного акаунту
        System.out.println("\nВикористовуємо методи для акаунту 1:");
        account1.plusBalance(500);
        account1.minusBalance(200);
        account1.showBalance();
        account1.showHistory();

        // Викликаємо методи для акаунту 2
        System.out.println("\nВикористовуємо методи для акаунту 2:");
        account2.plusBalance(1000);
        account2.minusBalance(500);
        account2.showBalance();
        account2.showHistory();

        // Переказ між акаунтами
        bank.transaction(123456, 654321, 500.00);

        // Виведення оновлених акаунтів
        bank.showCard();
    }
}
