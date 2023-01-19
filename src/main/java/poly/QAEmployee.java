package poly;

public class QAEmployee extends Employee implements InterfaceDemo, RemoteEmployee {
    private boolean hasISTQB;

    public QAEmployee(String name, String sex, String specialty, String startDate, double salary,
                      String department, boolean hasISTQB) {
        super(name, sex, specialty, startDate, salary, department);
        setHasISTQB(hasISTQB);
    }

    public boolean isHasISTQB() {
        return hasISTQB;
    }

    public void setHasISTQB(boolean hasISTQB) {
        this.hasISTQB = hasISTQB;
    }

    public void printSalary(double bonus){
        if(isHasISTQB()){
            System.out.printf("Salary from QAEmployee: is: %.2f.\n", this.calculateSalary(bonus * 2));
            //super.printSalary(bonus * 2);
        }else {
            System.out.printf("Salary from QAEmployee: is: %.2f.\n", this.calculateSalary(bonus));
        }
    }

    @Override
    public void sayHi() {
        System.out.println("Hello!");
    }

    @Override
    public void sayBye() {
        System.out.println("Bye!");
    }

    @Override
    public void workFromHome() {
        System.out.println("Working from home...");
    }

    @Override
    public void attendDailyMeetingsFromHome() {
        System.out.println("Join daily meeting");
    }
}
