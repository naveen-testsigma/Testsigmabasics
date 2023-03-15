package DesignPatterns.Behavioural.Strategy;

class Paytm implements PaymentGateway {

    @Override
    public void display() {
        System.out.println("Paid using paytm");
    }
}
