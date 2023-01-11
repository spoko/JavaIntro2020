//package i.e. location of the file
package programming.intro;

import java.util.Scanner;

//Class
public class Intro {
    //Main method of the class
    public static void main(String[] args) {
        //outputs the text in the console
        System.out.println("Please enter your name:");
        //scanner class used for getting the user input
        Scanner scanner = new Scanner(System.in);
        //variable name for storing the name entered
        String name = scanner.nextLine();

        //Compile error example:
        //Stirng asd = "asdas";

        //outputs the text in the console
        System.out.println("Please enter your age:");
        //variable age for storing the age entered
        int age = scanner.nextInt();

        //outputs the text in the console
        System.out.println("Hi, " + name + " your age is: " + age);

        //checks some logic
        if (age > 17){
            System.out.println(name + " is able to drink.");
        }else {
            System.out.println(name + " is NOT able to drink");
        }

        int num1 = 435;
        int num2 = 453;
        int num3 = 456;

        String MyName = "My name is <myName>";
        System.out.println("Please enter your name:");


        name = scanner.nextLine();

        System.out.println(MyName.replace("<myName>", name));

        //Compare two strings
        System.out.println("Please enter the first string to compare:");
        String FirstString = scanner.nextLine();

        System.out.println("Please enter the second string to compare:");
        String SecondString = scanner.nextLine();

        System.out.println(FirstString.compareTo(SecondString) == 0 ? "the two strings are the same" : "the two strings are different" );

    }

    public static int maxNumber(int a, int b){
        if (a > b){
            return a;
        }else{
            return b;
        }
    }
}
