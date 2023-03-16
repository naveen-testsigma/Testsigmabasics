package Assignment.Strategy;

public class PhonePE implements BHIM {

    @Override
    public void credit() {
        System.out.println("U are now crediting via PhonePE :) ");
    }

    @Override
    public void debit() {
        System.out.println("U are now debiting via PhonePE :) ");
    }
}
