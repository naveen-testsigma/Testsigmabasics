package Assignment.Visitor;

public class MedicalInsurance implements Insurance {


    @Override
    public void lifeInsurance() {

    }

    @Override
    public void carInsurance() {

    }

    @Override
    public void medicalInsurance() {
        System.out.println("U go Medical Insurance");
    }
}
