package Testsigmabasics.Bank;

public class CreditDebit{

    public static void main(String args[]) {
        Amount amountThread = new Amount( "Credit/Debit Session");
        amountThread.start();

    }
}
