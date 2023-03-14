package Testsigmabasics.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Object> OBJECT = new ArrayList<>();
    static String[] SPLITTER = new String[4];
    public static void main(String[] args) {

        try {
            File f = new File("");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine())
            {
                SPLITTER = sc.nextLine().split("; ");
                String id = SPLITTER[0];
                String message = SPLITTER[1];
                String error_code = SPLITTER[3];
                Logger l = new Logger(id,message,error_code);
                OBJECT.add(l);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e);
        }


    }
}
