package encapsulation;

public class Test {
    public static void main(String[] args) {
        //part one
        Person elena = new Person("Elena", 11.0f);
        Person alex = new Person("Alex", 4.0f);

        Product coffee = new Product("Coffee", 10);
        Product tea = new Product("Tea", 2);

        elena.buyProduct(coffee);
        alex.buyProduct(tea);
        alex.buyProduct(tea);
        elena.buyProduct(tea);
        elena.printItemsFromTheBag();
        alex.printItemsFromTheBag();

        System.out.println("--------------------------");
        //Part two
        Person mimi = new Person("Mimi", 0);
        Product juice = new Product("Juice", 2);

        mimi.buyProduct(juice);
        mimi.printItemsFromTheBag();

        System.out.println("--------------------------");
        //part tree
        Person peter = new Person("Petar", -3);
        Product bread = new Product("Bread", 1);
        peter.buyProduct(bread);

    }
}
