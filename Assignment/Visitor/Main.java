package Assignment.Visitor;

public class Main {
    public static void main(String[] args) {
        Insurance I = new LifeInsurance();
        I.lifeInsurance();
        I = new MedicalInsurance();
        I.medicalInsurance();
        I = new CarInsurance();
        I.carInsurance();
    }

}
