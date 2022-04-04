package ObjectOriented;

public class ImplementClass implements InterfaceClass {
    @Override
    public void method() {
        System.out.println("This is Interface");
    }

    public static void main(String args[]){
        ImplementClass im = new ImplementClass();
        im.method();
    }
}
