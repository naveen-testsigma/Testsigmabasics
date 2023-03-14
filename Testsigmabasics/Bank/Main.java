package Testsigmabasics.Bank;

import java.util.Scanner;

public class Main extends BankService{
    public static void main(String[] args) {
        Bank bank = new BankService();
        int accountToDelete,flag =0,choice,accountToDisplay;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("1.Add\n2.Display\n3.Delete\n4.Exit\nEnter Choice: ");
            choice = scanner.nextInt();
            if(choice == 1){
                bank.add();
                bankerList.add(bank);
            }
            else if(choice ==2){
                System.out.println("Enter acc no to display : ");
                accountToDisplay = scanner.nextInt();
                for(Bank s : bankerList) {
                    if (s.accountReturn() == accountToDisplay) {
                        s.display();
                        flag =1;
                        break;
                    }
                }
                if(flag ==0)
                    System.out.println("\nAccount Id " + accountToDisplay+ " Not found!");

            }
            else if(choice == 3){
                System.out.println("Enter acc no to delete : ");
                accountToDelete = scanner.nextInt();
                for(Bank s : bankerList) {
                    if (s.accountReturn() == accountToDelete) {
                        s.delete(s.accountReturn());
                        bankerList.remove(s);
                        flag =1;
                        break;
                    }
                }
                if(flag ==0)
                    System.out.println("\nAccount Id" + accountToDelete+ "Not found !");
            }
            else
                break;
        }
        while(choice<4 && choice>=1);
    }
}
