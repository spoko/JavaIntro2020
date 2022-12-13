package loops;

public class WhileDemo {
    public static void main(String[] args) {
        printNumbersDownToZero(10);
        printNumbersUpToNumber(7);
        factorial(3);
        factorial(5);
    }

    public static void printNumbersDownToZero(int number){
        if (number < 0)
            number = 0;
        while (number > 0){
            System.out.println(number);
            number--;
        }
    }

    public static void printNumbersUpToNumber(int number){
        if (number < 0)
            number = 0;
        int counter = 1;

        while (counter != number + 1){
            System.out.println(counter);
            counter++;
        }
    }

    public static void factorial(int number){
        int iterator = number;
        int factorial = 1;

        while (iterator > 0){
            factorial *= iterator;
            iterator--;
        }
        System.out.printf("You entered %d. %d! = %d\n", number, number, factorial);
    }
}
