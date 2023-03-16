package Assignment.Strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String creditOrdebit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Credit or Debit : ");
        creditOrdebit = scanner.next();
        System.out.println("Enter Service Provider 1.Gpay 2.Phonepe 3.Applepay : ");
        String serviceProvider = scanner.next();
        if(serviceProvider.equals("Gpay")){
            BHIM bhim = new Gpay();
            PaymentServiceBHIM P = new PaymentServiceBHIM(bhim);
            P.setService(creditOrdebit);
        }
        else if(serviceProvider.equals("Phonepe")){
            BHIM bhim = new PhonePE();
            PaymentServiceBHIM P = new PaymentServiceBHIM(bhim);
            P.setService(creditOrdebit);
        }
        else {
            BHIM bhim = new ApplePay();
            PaymentServiceBHIM P = new PaymentServiceBHIM(bhim);
            P.setService(creditOrdebit);
        }
    }

}
