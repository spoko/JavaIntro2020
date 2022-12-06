package data.types;

public class VariableTest {
    public static void main(String[] args) {
        //all variables here are local (inside the method)
        //some primitive types
        byte age = 99;
        char someChar = '|';
        double pi = 3.14;
        float piFloat = 3.14f;
        boolean isEven = false;
        boolean iseven = true;

        //Object - referent type
        Dog frenchBulldog = new Dog();// using default constructor will be learned latter
        Dog frenchBulldog2 = new Dog();// using default constructor will be learned latter

        //printing values
        System.out.println(frenchBulldog.name + " " + frenchBulldog.age + " " + Dog.breedName);
        Dog.breedName = "Frenchie";
        //specific instance variables:
        frenchBulldog.name = "Morti";
        frenchBulldog.age = 2;
        frenchBulldog2.name = "Sharo";
        frenchBulldog2.age = 1;

        //printing values
        System.out.println("Data for " + frenchBulldog + " " + frenchBulldog.name + " " + frenchBulldog.age + " " + Dog.breedName);
        System.out.println("Data for " + frenchBulldog2 + " " + frenchBulldog2.name + " " + frenchBulldog2.age + " " + Dog.breedName);

        System.out.printf("Data for %s is: %s, %d, %s\n", frenchBulldog, frenchBulldog.name, frenchBulldog.age, Dog.breedName);

        //referent type - string
        String someString = "    someName   ";
        System.out.println(someString);
        System.out.println(someString.trim());

        someString = "\'Someone\' should do something... \n";
        System.out.println(someString);

        System.out.printf("Age is: %d", age);
    }
}
