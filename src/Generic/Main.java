package Generic;

import Method.MethodVisibility;

public class Main {
    public static void main(String[] args) {
        Generic<String, Integer> d = new Generic<String, Integer>("Age", 15);
        System.out.println(d.getKey() + ": " + d.getValue()); //Ouput: Study: hoc



    }

}
