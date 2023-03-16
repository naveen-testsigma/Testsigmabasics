package Assignment.LevelException;

import java.util.logging.Level;

public class Main {
    void Level4Exception(int a) throws Exception{
        try{
            System.out.println(0/0);
        }
        catch (Exception e){
            System.out.println("value of a "+ a);
            throw new Exception();
        }
    }
    void Level3Exception(int a)throws Exception{
        try{
            Level4Exception(a+10);
        }
        catch (Exception e){
            System.out.println("value of a "+ a);
            throw new Exception();
        }
    }
    void Level2Exception(int a)throws Exception{

        try{
            Level3Exception(a+10);
        }
        catch (Exception e){
            System.out.println("value of a "+ a);
            throw new Exception();
        }
    }
    void Level1Exception() throws Exception{
        int a = 10;
        try {
            Level2Exception(a+10);
        }
        catch (Exception e){
            System.out.println("value of a "+ a);
            throw new Exception();
        }

    }
    public static void main(String[] args) {
        try{
            Main a = new Main();
            a.Level1Exception();
        }
        catch (Exception e){

        }
    }
}
