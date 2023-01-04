package encapsulation;

import java.util.LinkedList;

public class Person {
    private String name;
    private float money;
    private LinkedList<Product> bagOfProducts = new LinkedList<>();

    public Person(String name, float money){
        setName(name);
        setMoney(money);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (!name.trim().isEmpty()){
            this.name = name;
        }else {
            System.out.println("Error: Invalid Person name");
        }
    }

    public float getMoney() {
        return money;
    }

    private void setMoney(float money) {
        if (money >= 0){
            this.money = money;
        }else {
            System.out.println("Error: Invalid Person money");
        }
    }

    public void buyProduct(Product product){
        if (this.getMoney() >= product.getCost()){
            this.bagOfProducts.add(product);
            this.setMoney(this.getMoney() - product.getCost());
            System.out.printf("\"%s bought %s\"\n", this.getName(), product.getName());
        }else {
            System.out.printf("\"%s can't afford %s\"\n", this.getName(), product.getName());
        }
    }

    public void printItemsFromTheBag(){
        if (bagOfProducts.size() == 0){
            System.out.printf("\"%s Nothing bought.\"\n", this.getName());
            return;
        }


    }
}
