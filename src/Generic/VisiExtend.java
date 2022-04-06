package Generic;

import Method.MethodVisibility;

public class VisiExtend extends MethodVisibility {
    public static void main(String[] args) {
        VisiExtend mv = new VisiExtend();
        mv.name2 = "Nam";
        mv.name3 = "Minh";

        System.out.println(mv.name3);
    }

}
