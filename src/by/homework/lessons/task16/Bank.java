package by.homework.lessons.task16;

import java.util.HashSet;
import java.util.Set;

class Bank {
    private Set<Account> accounts = new HashSet<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount) {
        Account from = null;
        Account to = null;

        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumberFrom)) from = acc;
            if (acc.getAccountNumber().equals(accountNumberTo)) to = acc;
        }

        if (from == null || to == null) {
            throw new AccountNotFoundException("not.found.account", "Account not found");
        }

        if (from.getBalance() < amount) {
            throw new NotEnoughMoneyException("not.enough.money", "Not enough money");
        }

        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);
    }

    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount, double exchangeRate) {
        Account from = null;
        Account to = null;

        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumberFrom)) from = acc;
            if (acc.getAccountNumber().equals(accountNumberTo)) to = acc;
        }

        if (from == null || to == null) {
            throw new AccountNotFoundException("not.found.account", "Account not found");
        }

        if (from.getCurrency() != to.getCurrency()) {
            throw new AccountNotFoundException("not.found.account", "Currency does not match");
        }

        if (from.getBalance() < amount) {
            throw new NotEnoughMoneyException("not.enough.money", "Not enough money");
        }

        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount * exchangeRate);
    }
}
