package oop;

public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        cat1.setBreed("Some");
        cat1.setAge(12);
        cat1.setHasTail(true);
        cat1.setWeight(5.03f);
        cat1.setName("Garfield");

        dog1.setBreed("French");
        dog1.setName("Morti");
        dog1.setAge(22);
        dog1.setWeight(15.04f);

        dog1.printData();

        System.out.printf("Name is: %s, breed is: %s, age is: %d, weight is: %.3f\n", dog1.getName(), dog1.getBreed(),
                dog1.getAge(), dog1.getWeight());

        dog1.bark();

        cat1.printData();
        cat1.mau();
    }
}
