package Assignment.Strategy;

public class Gpay implements BHIM {

    @Override
    public void credit() {
        System.out.println("U are now crediting via Gpay :)");
    }

    @Override
    public void debit() {
        System.out.println("U are now debiting via Gpay :)");
    }
}
