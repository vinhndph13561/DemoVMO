package Generic;

import java.util.Arrays;
import java.util.List;

public class GenericWithWildcards {
    public static void main(String[] args) {
        List < Integer > intList = Arrays.asList(10, 20, 30, 40);
        List < String > stringList = Arrays.asList("Vinh","Linh","Minh");
        printList(intList);
        printList(stringList);
    }
    private static void printList(List < ?>list) {
        System.out.println(list);
    }
}
