package task04;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int numAccounts = 2;
        long initialBalance = 10000;
        int numTransactions = 8;
        Random random = new Random();

        Bank bank = new Bank(numAccounts, initialBalance);

        for (int i = 0; i < numTransactions; i++) {
            int fromAccount = random.nextInt(numAccounts);
            int toAccount = random.nextInt(numAccounts);
            long amount = random.nextInt((int) initialBalance);

            bank.transfer(fromAccount, toAccount, amount);
        }

        System.out.println("Total balance after transactions: " + bank.getTotalBalance());
    }
    }
