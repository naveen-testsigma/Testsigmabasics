package Assignment.Strategy;

public class ApplePay implements BHIM {

    @Override
    public void credit() {
        System.out.println("U are now crediting via ApplePay");
    }

    @Override
    public void debit() {
        System.out.println("U are now debiting via ApplePay");
    }
}
