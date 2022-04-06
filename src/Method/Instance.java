package Method;

public class Instance {
    //Instance variables in Java are non-static variables which are defined in a class outside any method,
    // constructor or a block. Each instantiated object of the class has a separate copy or instance of that
    // variable. An instance variable belongs to a class.
    private String name;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public static void main(String args[]) {
//        create an instance variable of a class
        Instance inst = new Instance();
        inst.name="Vinh";
        System.out.println(inst.getName());

        Instance inst2 = new Instance();
        inst2.name="Minh";
        System.out.println(inst2.getName());
    }
}
