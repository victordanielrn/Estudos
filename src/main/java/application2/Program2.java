package application2;

import entities2.Account;
import entities2.BusinessAccount;
import entities2.SavingsAccount;

public class Program2 {
    public static void main (String[] args){
        Account acc= new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria" , 0.0, 500.0);
        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "BOB", 0.0,200.0);
        Account acc3 = new SavingsAccount(1004, "Victor", 0.0, 0.01);
        //DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

       // ERROR BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount ) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("loan");
        }
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("update");
        }



    }
}
