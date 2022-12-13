package loops;

public class DoWhileDemo {
    public static void main(String[] args) {
        int someNumber = 7;

        do{
            System.out.printf("Current number is: %d\n", someNumber);
            someNumber++;
        }while (someNumber >=20);
    }
}
