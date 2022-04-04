package CollectionsFramework;

import java.util.*;

public class HashSetAndLinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> setA = new HashSet<String>();
        setA.add("Java");
        setA.add("Python");
        setA.add("Java");
        setA.add("PHP");
        System.out.println("Số phần tử của setA: " + setA.size());
        System.out.println("Các phần tử của setA: " + setA);
        System.out.println("setA có chứa Java không? " + setA.contains("Java"));
        System.out.println("setA có chứa C++ không? " + setA.contains("C++"));

        //Add from another HashSet
        HashSet<String> setB = new HashSet<String>();
        setB.add("JS");
        setA.addAll(setB);

        //Traversing HashSet
        System.out.println("Các phần tử của setA: ");
        Iterator<String> iterator = setA.iterator();
        while (iterator.hasNext()) {
            System.out.println((String) iterator.next());
        }

        //Remove
        setA.remove("PHP");
        setA.clear();

        //Convert to List
        List<String> listA = new ArrayList<>();
        listA.addAll(setA);

        //LinkedHashSet
        LinkedHashSet<Integer> LHS
                = new LinkedHashSet<Integer>();

        // using add() to initialize values
        // [1, 2, 3, 4]
        LHS.add(1);
        LHS.add(2);
        LHS.add(3);
        LHS.add(4);

        // print LinkedHashSet
        System.out.println("LinkedHashSet: "
                + LHS);

        // Get the hashCode value
        // using hashCode() value
        System.out.println("HashCode value: "
                + LHS.hashCode());
    }
}
