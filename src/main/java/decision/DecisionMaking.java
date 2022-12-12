package decision;

public class DecisionMaking {
    public static void main(String[] args) {
        //calling a method with some parameter
        printStatus(-20);
        printStatus(20);
        printStatus(12);
        printStatus(45);

        selectWeekOfTheDay(3);
        selectWeekOfTheDay(2);
    }

    //method
    public static void printStatus(int age){
        //kid: 0 - 12
        //teenager: 13 - 19
        //adult: 20 - 65
        //retired: 66 - 120
        if (age >= 0 && age <= 12){
            System.out.printf("The user is a kid with the age of %d\n", age);
        }else if (age >= 13 && age <= 19){
            System.out.printf("The user is a teenager with the age of %d\n", age);
        }else if (age >= 20 && age <= 65){
            System.out.printf("The user is a adult with the age of %d\n", age);
        }else if (age >= 66 && age <= 120){
            System.out.printf("The user is a retired with the age of %d\n", age);
        }else {
            System.out.println("Vampire!!!");
        }
    }

    //method
    public static void selectWeekOfTheDay(int dayOfTheWeek){
        switch (dayOfTheWeek){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
