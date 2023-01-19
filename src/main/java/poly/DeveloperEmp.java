package poly;

public class DeveloperEmp extends Employee {
    private boolean hasMicrosoftCertificate;

    public DeveloperEmp(String name, String sex, String specialty, String startDate, double salary,
                        String department, boolean hasMicrosoftCertificate){
        super(name, sex, specialty, startDate, salary, department);
        setHasMicrosoftCertificate(hasMicrosoftCertificate);
    }

    public boolean isHasMicrosoftCertificate() {
        return hasMicrosoftCertificate;
    }

    public void setHasMicrosoftCertificate(boolean hasMicrosoftCertificate) {
        this.hasMicrosoftCertificate = hasMicrosoftCertificate;
    }

    public void writeTests(){
        System.out.println(super.getName() + " is writing unit tests.");
    }

    @Override
    public void printSalary(double bonus) {
        if (isHasMicrosoftCertificate()){
            super.printSalary(bonus * 1.5);
        }else {
            super.printSalary(bonus);
        }
    }


    public void drinkCoffee(){
        System.out.println("I am drinking coffee");
    }


    protected void drinkCoffee(String coffeeType){
        System.out.printf("I am drinking %s coffee", coffeeType);
    }
}
