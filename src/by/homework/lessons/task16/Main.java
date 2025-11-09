package by.homework.lessons.task16;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account a1 = new Account("1", "111", "BYN", 1000.0);
        Account a2 = new Account("2", "222", "BYN", 500.0);
        Account a3 = new Account("3", "333", "BYN", 300.0);
        Account a4 = new Account("4", "444", "USD", 200.0);
        Account a5 = new Account("5", "555", "USD", 100.0);

        bank.addAccount(a1);
        bank.addAccount(a2);
        bank.addAccount(a3);
        bank.addAccount(a4);
        bank.addAccount(a5);

        try {
            bank.transferMoney("111", "222", 200.0);
            bank.transferMoney("444", "555", 50.0, 2.5);
        } catch (AccountNotFoundException e) {
            System.out.println("Откройте счёт в нашем банке для выполнения переводов");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Недостаточно средств для перевода");
        } finally {
            System.out.println("Спасибо, что воспользовались услугами банка");
        }

        System.out.println("Баланс 111: " + a1.getBalance());
        System.out.println("Баланс 222: " + a2.getBalance());
        System.out.println("Баланс 444: " + a4.getBalance());
        System.out.println("Баланс 555: " + a5.getBalance());
    }
}
