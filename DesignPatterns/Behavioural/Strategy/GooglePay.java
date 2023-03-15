package DesignPatterns.Behavioural.Strategy;

class GooglePay implements PaymentGateway {

    @Override
    public void display() {
        System.out.println("Paid using google pay");
    }
}
