package arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Sofia");
        cities.add("Plovdiv");
        cities.add(0, "Varna");
        System.out.printf("Cities are: %s and the count is: %d", cities, cities.size());
    }
}
