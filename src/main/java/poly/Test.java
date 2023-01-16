package poly;

public class Test {
    public static void main(String[] args) {
        DeveloperEmp dev1 = new DeveloperEmp("Ivan", "male", "JAVA",
                "01/01/23", 1000, "IT", true);

        DeveloperEmp dev2 = new DeveloperEmp("Rositsa", "female", "JAVA",
                "01/01/23", 1000, "IT", false);

        QAEmployee qa1 = new QAEmployee("Bilyana", "female", "C#",
                "01/01/20", 1000, "IT", true);

        QAEmployee qa2 = new QAEmployee("Mihail", "male", "C#",
                "01/01/20", 1000, "IT", false);

        dev1.printSalary(500); //1750;
        dev2.printSalary(500); //1500;
        qa1.printSalary(500); //2000;
        qa2.printSalary(500); //1500;
    }
}
