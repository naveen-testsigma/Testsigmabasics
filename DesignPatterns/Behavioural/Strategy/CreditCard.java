package DesignPatterns.Behavioural.Strategy;

class CreditCard implements PaymentGateway {

    @Override
    public void display() {
        System.out.println("Paid using CreditCard");
    }
}
