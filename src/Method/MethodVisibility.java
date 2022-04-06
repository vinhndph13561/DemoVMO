package Method;

public class MethodVisibility {
    private String name1; //access only in the class containing it
    protected String name2; //access within the same package and a subclass outside the same package
    public String name3; //all classes can access
    String name4; //access within the same package

    public static void main(String[] args) {
        MethodVisibility mv = new MethodVisibility();
        mv.name1 = "Linh";
        mv.name2 = "Vinh";
        mv.name3 = "Minh";
        mv.name4 = "Binh";
        System.out.println(mv.name1);
        System.out.println(mv.name2);
        System.out.println(mv.name3);
        System.out.println(mv.name4);
    }
}
