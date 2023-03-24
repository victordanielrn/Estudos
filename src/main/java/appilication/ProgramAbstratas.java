package appilication;

import entities2.Account;
import entities2.BusinessAccount;
import entities2.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class ProgramAbstratas {
    public static void main(String[] args) {

        List<Account>list= new ArrayList<>();

        list.add(new SavingsAccount(1001, "Maria", 500.00, 0.01));
        list.add(new BusinessAccount(1002, "Bob", 1000.0,400.0 ));
        list.add(new SavingsAccount(1003, "Mirian", 300.00, 0.01));
        list.add(new BusinessAccount(1004, "Bobi", 500.0,500.0 ));

        double sum = 0.0;
        for (Account acc : list){
          sum += acc.getBalance();

        }
        System.out.printf("Total balance : %.2f%n", sum);

        for (Account acc : list){
            acc.deposit(10.0);
        }
        for (Account acc : list){
            System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }
    }

}
