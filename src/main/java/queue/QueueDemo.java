package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> cars = new LinkedList<String>();
        cars.offer("BMW");
        cars.offer("Mercedes");
        cars.offer("Honda");
        cars.offer("Volvo");
        System.out.println(cars);
        cars.poll();
        System.out.println(cars);
    }
}
