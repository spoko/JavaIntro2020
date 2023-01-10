package access;

public class Pet {
//Private constructor
//    private Pet(){
//
//    }

    public String publicName; //not OK
    protected String protectedName;
    String defaultName;
    private String privateName;

    protected String getProtectedName() {
        return protectedName;
    }

    public String getPublicName() {
        return publicName;
    }

    String getDefaultName() {
        return defaultName;
    }

    //internal method
    private String getPrivateName() {
        return privateName;
    }

    public final void move(){
        System.out.println("I am moving...");
    }

    public static void main(String[] args) {
        Pet internalPet = new Pet();
        internalPet.publicName = "asdfs";
        internalPet.protectedName = "asdas";
        internalPet.defaultName = "dsfsfsd";
        internalPet.privateName = "sdfsdf";
        internalPet.getPrivateName();
    }
}
