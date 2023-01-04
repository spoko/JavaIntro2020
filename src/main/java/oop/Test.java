package oop;

public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog(2, "Morti", 15.0f, false, "Frenchie");
        Cat cat1 = new Cat(3, "Garfield", 5.03f, true, "Some");
        Dog dog2 = new Dog(dog1);

        Address dogAddress = new Address("Sofia", "G. M. Dimitrov", 1000);

        dog1.setAddress(dogAddress);
        dog2.setAddress(dogAddress);

        dog1.printData();

        dog2.printData();

        System.out.printf("Name is: %s, breed is: %s, age is: %d, weight is: %.3f\n", dog1.getName(), dog1.getBreed(),
                dog1.getAge(), dog1.getWeight());

        dog1.bark();

        cat1.printData();
        cat1.printData(true);
        cat1.mau();

        someTestMethod("Hello world");

        dog1.suggestFood(WeekDays.Monday);
        checkEquals(calculateAverage(3453,3345,3), calculateAverage(6443,65345,634534));
    }

    public static void someTestMethod(String param){
        System.out.println(param);
    }

    public static int calculateAverage(int a, int b, int c){
        int result = (a + b + c) / 3;
        return result;
    }

    public static boolean checkEquals(int a, int b){
        return a == b;
    }
}
