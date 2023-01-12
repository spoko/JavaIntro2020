package mathdemo;

import java.util.Random;

public class MathDemo {
    public static void main(String[] args) {
        //write method which returns area of triangle by known:
        //a, b and angle in between
        System.out.printf("The area is: %.3f\n", findTriangleAreaByTwoSidesAndAngle(3.0,5.0,60.0));
        System.out.println("-------------------");
        Random random = new Random();
        System.out.println(random.nextInt(0, 100));
    }

    public static double findTriangleAreaByTwoSidesAndAngle(double sideA, double sideB, double angle){
        return 0.5 * sideA * sideB * Math.sin(Math.toRadians(angle));
    }
}
