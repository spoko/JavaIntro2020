package encapsulation;

public class Test {
    public static void main(String[] args) {
        Person elena = new Person("Elena", 11.0f);
        Person alex = new Person("Alex", 4.0f);

        Product coffee = new Product("Coffee", 10);
        Product tea = new Product("Tea", 2);

        elena.buyProduct(coffee);
        alex.buyProduct(tea);
        alex.buyProduct(tea);
        elena.buyProduct(tea);
    }
}
