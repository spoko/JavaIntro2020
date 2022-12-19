package oop;

public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        Address dogAddress = new Address();
        System.out.println(dogAddress);
        dogAddress.setPostalCode(1000);
        dogAddress.setCity("Sofia");
        dogAddress.setStreetName("G. M. Dimitrov");

        cat1.setBreed("Some");
        cat1.setAge(12);
        cat1.setHasTail(true);
        cat1.setWeight(5.03f);
        cat1.setName("Garfield");

        dog1.setBreed("French");
        dog1.setName("Morti");
        dog1.setAge(22);
        dog1.setWeight(15.04f);
        dog1.setAddress(dogAddress);

        dog1.printData();

        System.out.printf("Name is: %s, breed is: %s, age is: %d, weight is: %.3f\n", dog1.getName(), dog1.getBreed(),
                dog1.getAge(), dog1.getWeight());

        dog1.bark();

        cat1.printData();
        cat1.printData(true);
        cat1.mau();

        someTestMethod("Hello world");
    }

    public static void someTestMethod(String param){
        System.out.println(param);
    }
}
