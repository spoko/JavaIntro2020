package hmw;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        int [] numberArray = new int[20];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("Please enter an integer:");
            numberArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i * 5;
        }

        for (int i = 0; i < numberArray.length; i++) {
            System.out.printf("Index is: %d and value at that index is: %d\n", i, numberArray[i]);
        }
    }
}
