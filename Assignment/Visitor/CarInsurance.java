package Assignment.Visitor;

public class CarInsurance implements Insurance {

    @Override
    public void lifeInsurance() {

    }

    @Override
    public void carInsurance() {
        System.out.println("U got CarInsurance! ");
    }

    @Override
    public void medicalInsurance() {

    }
}
