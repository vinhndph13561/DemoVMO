package Method;

public class Static {
//    The static keyword in Java is used for memory management mainly.
//    We can apply static keyword with variables, methods, blocks and nested classes.
//    The static keyword belongs to the class than an instance of the class.
    int stuNo;
    String name;
    static String college = "FPT College"; // Static variable

//    Static method
    static void change() {
        college = "FPT Polytechnic College";
    }

    Static(int s, String n) {
        stuNo = s;
        name = n;
    }

    void display() {
        System.out.println(stuNo + " - " + name + " - " + college);
    }

    public static void main(String args[]){
        Static s1 = new Static(1, "Thông");
        Static s2 = new Static(2, "Minh");
        Static s3 = new Static(3, "Anh");

        s1.display();
        s2.display();
        s3.display();
        //call static method
        Static.change();

        s1.display();
        s2.display();
        s3.display();
    }
}
