package staticdemo;

public class Lada extends Car{
    private boolean hasAirConditioner;

    public Lada(String color) {
        super(color);
    }

    public void printLadaData(){
        super.printCarData();
        System.out.printf("Has Air Conditioner - %b\n", hasAirConditioner);
    }

    @Override
    public void driveForward() {
        System.out.println("Lada is moving forward...");
        //super.driveForward();
    }

    @Override
    public String driveTo(String direction) {
        return "Lada is moving " + direction + "...";
    }
}
