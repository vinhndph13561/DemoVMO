package JavaBasic;

public class Variables {

//    instance variable
    private String name; // This is instance variable

    public Variables(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println("Name  : " + name);
    }

//    Static variable
    public static String name1 = "Nguyen Duc Vinh"; // This is static variable

    public static void main(String args[]) {
        //    local variable
        String name2 = "Vinh1"; // This is local variable
        System.out.println("Name: " + name2);

        //    instance variable
        Variables instance = new Variables("Vinh2");
        instance.showName();

        //    Static variable
        System.out.println("Name : " + name1);
    }
}
