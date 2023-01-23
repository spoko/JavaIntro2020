package poly;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        DeveloperEmp dev1 = new DeveloperEmp("Ivan", "male", "JAVA",
                "01/01/23", 1000, "IT", true);

        DeveloperEmp dev2 = new DeveloperEmp("Rositsa", "female", "JAVA",
                "01/01/23", 1000, "IT", false);

        QAEmployee qa1 = new QAEmployee("Bilyana", "female", "C#",
                "01/01/20", 1000, "IT", true);

        QAEmployee qa2 = new QAEmployee("Mihail", "male", "C#",
                "01/01/20", 1000, "IT", false);

        //AbstractDemo abs = new AbstractDemo(); not possible to have instance/ object from an abstract class

        dev1.printSalary(500); //1750;
        dev2.printSalary(500); //1500;
        qa1.printSalary(500); //2000;
        qa2.printSalary(500); //1500;
        System.out.println(RemoteEmployee.isRemote());
        dev1.drinkCoffee();
        dev1.drinkCoffee("non-caffeine");


        System.out.println("\nPlease enter a length for the Fibonacci sequence: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        int[] values = new int[a];
        values[0] = 0;
        values[1] = 1;

        for(int i = 2; i < a; i++){
            values[i] = values[i - 1] + values[i - 2];}
        for(int i = 0; i < a; i++){
            System.out.println(values[i]);}

    }
}
