package exceptiondemo;

import java.io.*;

public class FileReader {

    public static void readFile(String fileName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

        String tmp = null;

        while ((tmp = bufferedReader.readLine()) != null){
            System.out.println(tmp);
        }
        bufferedReader.close();
        fileInputStream.close();
    }

    public static int divideNumbers(int a, int b) throws SpecialException {
        try{
            return a/b;
        }catch (ArithmeticException e){
            System.out.println("You can`t divide by 0!");
            throw new SpecialException(e.getMessage());
        }
    }
}
