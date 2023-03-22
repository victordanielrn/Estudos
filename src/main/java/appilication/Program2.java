package appilication;

import entities2.Account;
import entities2.BusinessAccount;
import entities2.SavingsAccount;

public class Program2 {
    public static void main(String[] args) {
        Account acc1 = new Account(1011, "Alex", 1000.0);
        acc1.withdraw(200.00);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount (1002, "maria", 1000.0, 0.01);
        acc2.withdraw(200.00);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "victor", 1000.0, 500.0);
        acc3.withdraw(200);
        System.out.println(acc3.getBalance());
    }
}
