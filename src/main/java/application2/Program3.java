package application2;

import entities2.Account;
import entities2.SavingsAccount;

public class Program3 {
    public static void main (String[] args) {
        Account x = new Account(1020, " maria", 1000.0);
        Account y = new SavingsAccount(1021, "Victor", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());

    }
}
