package hmw2;

import java.util.Scanner;

public class Hmw2 {
    public static void main(String[] args) {
        String inputString = "Your name is <myName>";
        System.out.println(inputString);
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        //solution using replace
        System.out.println(inputString.replace("<myName>", name));
        //The same solution using substring
        System.out.println(inputString.substring(0, inputString.indexOf('<')) + name);
    }
}
