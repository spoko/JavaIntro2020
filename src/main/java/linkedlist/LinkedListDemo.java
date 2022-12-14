package linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Volvo");

        System.out.println("Before removing: " + cars);
        cars.remove("BMW");
        cars.remove(1);
        System.out.println("After removing: " + cars);
    }
}
