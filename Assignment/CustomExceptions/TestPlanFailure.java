package Assignment.CustomExceptions;

public class TestPlanFailure extends Exception{
    TestPlanFailure(String failure) {
        super(failure);
    }
}
