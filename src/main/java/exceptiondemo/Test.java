package exceptiondemo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Test {
    private static String name;
    public static void main(String[] args) throws SpecialException {
        int a = 2;
        int b = 0;
        int [] arrayInt = new int [5];
        ArrayList<Integer> list;
       // System.out.println(a/b);

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i + 2;
        }

        try{
            FileReader.readFile("sdfgsdgsdf");
            //some more method calls here
        }catch (FileNotFoundException e){
            System.out.printf("ERROR: File not possible to be found..." + e.getMessage());
            //add logg data to the lod here using the data from variable e
        }catch (IOException e){
            System.out.printf("ERROR: Invalid file name/ file location for %s\n", e.getMessage());
        }

        System.out.println(FileReader.divideNumbers(-3,0));
    }
}
