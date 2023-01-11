package staticdemo;

public class Test {
    public static void main(String[] args) {
        System.out.println(Car.getCounter());

        Car car1 = new Car("green");
        car1.setEngineType("Gasoline");
        Car car2 = new Car("red");
        car2.setEngineType("Petrol");

        System.out.println(Car.getCounter());
        System.out.println(car1.getCounter());
        System.out.println(car1.getEngineType());
        System.out.println(car2.getCounter());
        System.out.println(car2.getEngineType());

        System.out.println("------------------");
        car1.driveForward();
        System.out.println(car2.driveTo("backwards"));

        Lada lada1 = new Lada("white");
        lada1.driveForward();
        System.out.println(lada1.driveTo("left"));
    }
}
