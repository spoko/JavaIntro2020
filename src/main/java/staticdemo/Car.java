package staticdemo;

public class Car extends DriveCar {
    private static String engineType;
    private final int FACTORY_NUMBER = 34534534;
    private String color;
    private static int counter;
    private final static boolean FOUR_WHEEL_DRIVE = true; //constant

    static {
        System.out.println("Static initialazer started...");
        engineType = "Petrol";
        //BRAND_NAME = "Opel";
    }

    public Car(String color){
        System.out.println("Constructor started...");
        counter++;
        //randomInt = 10;
        this.color = color;
    }

    public static String getEngineType() {
        return engineType;
    }

    public static void setEngineType(String _engineType) {
        engineType = _engineType;
    }

    public static int getCounter() {
        return counter;
    }

    //method overload
    public final void printCarData(){
        System.out.printf("Non-static fields area: Color: %s, Factory Id: %d.\n", color, FACTORY_NUMBER);
        System.out.printf("Static fields area: Engine Type: %s, Counter: %d, 4WD: %b\n", engineType, counter, FOUR_WHEEL_DRIVE);
    }

    //method overload
    public final void printCarData(String carId){
        //do something
    }

    @Override
    public void driveForward() {
        System.out.println("Car is moving forward...");
    }

    @Override
    public String driveTo(String direction) {
        return "Car is moving " + direction + "...";
    }
}
