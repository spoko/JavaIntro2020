package oop;

public class Dog extends Animal {
    //instance variable
    private String breed;
//    private int age;
//    private String name;
//    private float weight;

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

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        if (age > 0){
//            this.age = age;
//        }else {
//            System.out.println("ERROR: Invalid input data for Age.");
//        }
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        if (!name.isEmpty() && !name.isBlank()){
//            this.name = name;
//        }else {
//            System.out.println("ERROR: Invalid input data for Name.");
//        }
//    }
//
//    public float getWeight() {
//        return weight;
//    }
//
//    public void setWeight(float weight) {
//        if(weight > 0){
//            this.weight = weight;
//        }else {
//            System.out.println("ERROR: Invalid input data for Name.");
//        }
//    }

    //method
    public void bark(){
        System.out.println("Bau bau");
    }

    public void printData(){
        System.out.printf("Name is: %s, breed is: %s, age is: %d, weight is: %.3f\n", super.getName(),
                breed, super.getAge(), super.getWeight());
    }
}
