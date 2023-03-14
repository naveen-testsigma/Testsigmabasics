package Testsigmabasics.Bank;

import java.util.Scanner;

class Amount implements Runnable {
    private Thread thread;
    private int accountNo;
    private int amount;
    private String threadName;

    Amount(String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }

    public void run() {
        System.out.println("Running " +  threadName );
        try {
            Scanner sc= new Scanner(System.in);
            System.out.println("Credit/Debit");
     /**
      * Boolean cred;
      * System.out.println("Enter the acc_no for verification: ");
      this.acc_no = sc.nextInt();
      BankService b = new BankService();
      boolean x = b.searcher(this.acc_no);
      if(x == true)
      System.out.println("Account Found");
      */
      /*IF THE ACC IS FOUND */
            /**
             if(x == true)
             {
             System.out.println("Enter Credit-0/Debit-1:");
             cred = sc.nextBoolean();
             if(cred == true)
             b.balance_clear(acc_no,amt);
             else
             b.balance_clear(acc_no,-1*amt);
             }
             */
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " +  threadName );
        if (thread == null) {
            thread = new Thread (this, threadName);
            thread.start ();
        }
    }
}

