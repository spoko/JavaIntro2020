package oop;

public class Animal extends AnimalActions {
    private int age;
    private String name;
    private float weight;
    private boolean hasTail;
    private Address address;

    public boolean isHasTail() {
        return hasTail;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

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

    //method overload
    protected String printData(boolean printNameAndAgeOnly){
        if (printNameAndAgeOnly){
            return String.format("Name is: %s, age is: %d.\n", name, age);
        }else {
            return String.format("Name is: %s, age is: %d, weight is: %.3f and has Tail: %b\n", name, age, weight, hasTail);
        }
    }

    public void run(){
        System.out.println("Running");
    }

    public void call(String word) {
        System.out.println(word);
    }
}
