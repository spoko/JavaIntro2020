package operators;

public class Equals {
    public static void main(String[] args) {
        String str1 = "My string";
        String str2 = "My string3";
        int x, y, z;
        x = y = z = 10;

        System.out.println(str1.equals(str2));

        System.out.println(str1 == str2);

        System.out.printf("X: %d, Y: %d, Z: %d", x, y, z);


    }
}
