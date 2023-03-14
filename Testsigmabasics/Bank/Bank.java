package Testsigmabasics.Bank;

import java.util.Scanner;

abstract class Bank {
    private String name;
    private int accountId;
    private long balance;
    private enum type {Saving, Current};
    type accountType;
    Scanner scanner = new Scanner(System.in);

    void add(){
        String x;
        System.out.println("\nEnter Name: "); name = scanner.nextLine();
        System.out.println("Enter acc_no: "); accountId = scanner.nextInt();
        System.out.println("Enter Acc Type(Saving,Current) : "); x = scanner.next();
        if(x=="Current"){
            accountType = type.Current;
        }
        else
            accountType = type.Saving;
        System.out.println("Enter Deposit amt: "); balance = scanner.nextLong();

    };

    void delete(int accountId) {
        System.out.println("The account "+accountId+" was successfully removed");
    };

    void display(){
        System.out.println("Account Holder Name : "+name);
        System.out.println("Account No          : "+ accountId);
        System.out.println("Account Type        : "+ accountType);
        System.out.println("Account Balance     : "+balance);

    };
    int accountReturn(){
        return accountId;
    }
    void balanceReturn(int amount){
        this.balance += amount;
    }

}