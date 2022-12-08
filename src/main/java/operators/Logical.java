package operators;

public class Logical {
    public static void main(String[] args) {
        byte a = 3;
        byte b = 4;
        byte c = 9;

        System.out.println(a >= b && b <= c);// false
        System.out.println(a >= b || b <= c);//true
        System.out.println(!(a >= b && b <= c));//true
        System.out.println(!(a >= b) && b <= c);//true

        System.out.println((b >= a ? "b is greater" : "b is Not greater"));
        System.out.println((c >= a ? "c is greater" : "c is Not greater"));


    }
}
