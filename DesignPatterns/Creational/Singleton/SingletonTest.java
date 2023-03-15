package DesignPatterns.Creational.Singleton;

public class SingletonTest {
    /**
     * Volatile keyword is used to modify the value of a variable by different threads.
     * It is also used to make classes thread safe. It means that multiple threads can use a method
     * and instance of the classes at the same time without any problem. The volatile keyword can
     * be used either with primitive type or objects.The volatile keyword does not cache the value
     * of the variable and always read the variable from the main memory.
     * The volatile keyword cannot be used with classes or methods. However, it is used with variables.
     * It also guarantees visibility and ordering. It prevents the compiler from the reordering of code.
     * * The contents of the particular device register could change at any time,
     * so you need the volatile keyword to ensure that such accesses are not optimized away by the compiler.
     */
    private static volatile SingletonTest instance;
    private  String data;

    private SingletonTest(String data){
        this.data = data;

    }
     void getDetails(){
        System.out.println(data);
    }
    static SingletonTest getInstance(String data){
        SingletonTest result = instance;
        if(result == null){
            synchronized (SingletonTest.class){
                result = instance;
                if(result == null)
                    instance =  result = new SingletonTest(data);
            }

        }
        return result;
    }
}
