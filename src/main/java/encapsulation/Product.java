package encapsulation;

import java.util.LinkedList;

public class Product {
    private String name;
    private float cost;

    public Product(String name, float cost){
        setName(name);
        setCost(cost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.trim().isEmpty()){
            this.name = name;
        }else {
            System.out.println("Error: Invalid Product name");
        }
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        if (cost >= 0){
            this.cost = cost;
        }else {
            System.out.println("Error: Invalid Product cost");
        }
    }
}
