package access2;

import access.Pet;

public class Test2 {
    public static void main(String[] args) {
        Pet misho = new Pet();
        //not possible to be accessing outside it`s package
        //misho.defaultName = "something";
        //can be accessed with subclass - inheritance
        //misho.protectedName = "something";
        //can be accessing from anywhere
        misho.publicName = "something";

        GoldenFish fish = new GoldenFish(true);
        fish.getProtectedName();
    }
}
