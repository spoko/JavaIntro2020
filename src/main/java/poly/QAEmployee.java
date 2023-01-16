package poly;

public class QAEmployee extends Employee {
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
            super.printSalary(bonus * 2);
        }else {
            super.printSalary(bonus);
        }

    }
}
