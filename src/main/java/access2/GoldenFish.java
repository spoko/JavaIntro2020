package access2;

import access.Pet;

public class GoldenFish extends Pet {
    private final boolean hasLongTail;// = true; final means constant

    public GoldenFish(boolean hasLongTail){
        this.hasLongTail = hasLongTail;
    }

    //the only way we can access protected method from other package - method Override
    protected String getProtectedName(){
        return super.getProtectedName();
    }

    //method overload
    private void swim(){
        System.out.println("Swim left");
    }

    //method overload
    private void swim(String direction){
        System.out.println("Swim " + direction);
    }

    public void cutLongTail(){
        //hasLongTail = false; - we cannot change something that is final
    }

    //final methods cannot be overwritten!
//    public void move(){
//        swim();
//    }
}
