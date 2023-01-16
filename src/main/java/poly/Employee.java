package poly;

public class Employee {
    private String name;
    private String sex;
    private String specialty;
    private String startDate;
    private double salary;
    private String department;

    public Employee(String name, String sex, String specialty, String startDate, double salary, String department){
        //this.name = name;// ако го оставим така ще можем да създадем обект през конструктора с празен стринг за име с други думи избягваме валидацията!
        //this way all the input data will be validated:
        setName(name);
        setSex(sex);
        setSpecialty(specialty);
        setStartDate(startDate);
        setSalary(salary);
        setDepartment(department);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (!name.trim().isEmpty()){
            this.name = name;
        }else {
            System.out.println("System Error: Invalid input for name.");
        }

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (!sex.trim().isEmpty()){
            this.sex = sex;
        }else {
            System.out.println("System Error: Invalid input for sex.");
        }
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        if (!specialty.trim().isEmpty()){
            this.specialty = specialty;
        }else {
            System.out.println("System Error: Invalid input for specialty.");
        }
    }

    public String getStartDate() {
        return startDate;
    }

    private void setStartDate(String startDate) {
        if (!startDate.trim().isEmpty()){
            this.startDate = startDate;
        }else {
            System.out.println("System Error: Invalid input for start date.");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 780){
            this.salary = salary;
        }else {
            System.out.println("System Error: Invalid input for salary. Cannot be less than the minimal wage.");
        }

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (!department.trim().isEmpty()){
            this.department = department;
        }else {
            System.out.println("System Error: Invalid input for department.");
        }
    }

    //internal method for this class
    private double calculateSalary(double bonus){
        if (bonus > 300){
            bonus = bonus - (bonus * 0.1); //-10% tax - например ново законово изискване - лесно добавяме на централизирано място
            //и всички наследници вече изчисляват по правилния начин без да се налага промяна по/ в тях.
        }
        return this.salary + bonus;
    }

    //accessible from the outside
    public void printSalary(double bonus){
        System.out.printf("Salary for this employee is: %.2f.\n", this.calculateSalary(bonus));
    }
}
