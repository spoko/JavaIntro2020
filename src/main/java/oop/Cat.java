package oop;

public class Cat extends Animal{
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

    public void mau(){
        System.out.println("Mau mau");
    }

    public void printData(){
        System.out.printf("Name is: %s, breed is: %s, age is: %d, weight is: %.3f and has tail: %b\n", super.getName(), breed,
                super.getAge(), super.getWeight(), super.getHasTail());
    }
}
