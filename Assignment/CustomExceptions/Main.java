package Assignment.CustomExceptions;

public class Main {

    public static void main(String[] args){
        try {
            throw new TestSuiteFailure("The test failed !");
            /*
            /throw new TestPlanFailure/TestSuite
             */

        }
        catch (TestCaseFailure t){
            System.out.println(t);
        }

        catch (TestSuiteFailure t){
            System.out.println(t);
        }
        catch (TestPlanFailure t){
            System.out.println(t);

        }

        catch (Exception e){
            System.out.println(e);
        }
    }
}
