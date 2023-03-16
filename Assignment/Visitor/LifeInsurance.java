package Assignment.Visitor;

public class LifeInsurance implements Insurance {

    @Override
    public void lifeInsurance() {
        System.out.println("U got LifeInsurance! ");
    }

    @Override
    public void carInsurance() {

    }

    @Override
    public void medicalInsurance() {

    }
}
