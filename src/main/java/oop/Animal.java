package oop;

public class Animal {
    private int age;
    private String name;
    private float weight;
    private boolean hasTail;

    public boolean getHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0){
            this.age = age;
        }else {
            System.out.println("ERROR: Invalid input data for Age.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty() && !name.isBlank()){
            this.name = name;
        }else {
            System.out.println("ERROR: Invalid input data for Name.");
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if(weight > 0){
            this.weight = weight;
        }else {
            System.out.println("ERROR: Invalid input data for Name.");
        }
    }

    public void printData(){
        System.out.printf("Name is: %s, age is: %d, weight is: %.3f and has Tail: %b\n", name, age, weight, hasTail);
    }
}
