package DesignPatterns.Behavioural.Strategy;

public class Main {

    public static void main(String[] args) {
        PaymentGateway paymentGateway=new CreditCard();
        PaymentService paymentService=new PaymentService(paymentGateway);
        paymentService.makePayment();
    }
}