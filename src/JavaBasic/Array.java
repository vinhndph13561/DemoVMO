package JavaBasic;

public class Array {
    public static void main(String args[]) {
        String[] name ={"Vinh","Linh","Minh"};

        System.out.println(name[0]);
        System.out.println(name.length);

        //        change the value of a specific element
        name[0]="Hoa";
        System.out.println(name[0]);
        System.out.println(name.length);
    }
}
