package Method;

public class MethodVisibility {
    private String name1; //access only in the class containing it
    protected String name2; //access within the same package and a subclass outside the same package
    public String name3; //all classes can access
    String name4; //access within the same package
}
