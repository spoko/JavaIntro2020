package operators;

public class AritmeticalDemo {

    public static void main(String[] args) {
        int a = 34;
        int b = 3;
        int sum = a + b;

        System.out.println(a % b);

        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);

        System.out.println(b--);
        System.out.println(b);
        System.out.println(--b);
        System.out.println(b);

        //System.out.println(a / 0);

        System.out.printf("The sum is: %d\n", sum);

        sum += a;// the same as sum = sum + a;

        System.out.printf("The sum is: %d\n", sum);
    }
}
