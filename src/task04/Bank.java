package task04;

import java.util.Random;

public class Bank {
    private Account[] accounts;
    private long totalBalance;

    public Bank(int numAccounts, long initialBalance) {
        accounts = new Account[numAccounts];
        totalBalance = numAccounts * initialBalance;

        for (int i = 0; i < numAccounts; i++) {
            accounts[i] = new Account(initialBalance);
        }
    }

    public synchronized void transfer(int from, int to, long amount) {
        if (accounts[from].getBalance() < amount) return;

        accounts[from].withdraw(amount);
        accounts[to].deposit(amount);
        totalBalance -= amount;
    }

    public synchronized long getTotalBalance() {
        return totalBalance;
    }
}
