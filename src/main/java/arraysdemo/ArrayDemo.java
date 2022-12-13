package arraysdemo;

public class ArrayDemo {
    public static void main(String[] args) {
        int [] numbers = {3, 90, -45, 365};
        String [] names = {"Ivan", "Georgi", "Messi"};
        double [] doubleNumbers = new double[10];
        String [] cities = new String[20];
        boolean [] answers = new boolean[10];

        //cities[1] = 5;

        System.out.println(names);
        printElements(numbers);
        printElements(names);
        doubleNumbers[5] = 67.33333;
        printElements(doubleNumbers);
        printElements(cities);
    }

    public static void printElements(int [] elements){
//        for (int i = 0; i < elements.length; i++){
//            System.out.println(elements[i]);
//        }
        for (int element : elements) {
            System.out.println(element);
        }
        System.out.println("-------------");
    }
    public static void printElements(String [] elements){
//        for (int i = 0; i < elements.length; i++){
//            System.out.println(elements[i]);
//        }
        for (String element : elements){
            System.out.println(element);
        }
        System.out.println("-------------");
    }

    public static void printElements(double [] elements){
        for (int i = 0; i < elements.length; i++){
            System.out.println(elements[i]);
        }
        System.out.println("-------------");
    }
}
