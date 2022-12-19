package oop;

public class Dog extends Animal {
    //instance variable
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (!breed.isEmpty() && !breed.isBlank()){
            this.breed = breed;
        }else {
            System.out.println("ERROR: Invalid input data for Breed.");
        }
    }

    //method
    public void bark(){
        System.out.println("Bau bau");
    }

    public void printData(){
        System.out.printf("Name is: %s, breed is: %s, age is: %d, weight is: %.3f, address is: %s\n", super.getName(),
                breed, super.getAge(), super.getWeight(), super.getAddress().toString());
    }

    public static void main(String[] args) {
        Test.someTestMethod("Hello from Dog Class");
        Dog.eat(Dog.getDogFood(2));
    }

    public static void eat(String food){
        System.out.println("Eating " + food);
    }

    public static String getDogFood(int value){
        String result = "";

        switch (value){
            case 1:
                result = "granuli";
                break;
            case 2:
                result = "pastet";
                break;
            case 3:
                result = "coocked";
                break;
            default:
                result = "Invalid entry";
        }

        return result;
    }

    public static int getNumber(int a, int b, int c){
        int result = (a + b + c) / 3;
        return result;
    }

    public static boolean checkEquals(int a, int b){
        return a == b;
    }
}
