package poly;

public abstract class AbstractDemo {
    private String name;
    private static String className;// = "Abstract Demo";

    //the only possible way to access this is by inheritance
    public AbstractDemo(String name){
        setName(name);
    }

    public static final String getClassName() {
        return className;
    }

    public static void setClassName(String className) {
        AbstractDemo.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void sayHello();
}
