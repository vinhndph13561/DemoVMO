package CollectionsFramework;

import java.util.*;

public class CollectionMethods {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Vinh");
        arrayList.add("Minh");
        arrayList.add("Linh");
        arrayList.add("Binh");
        System.out.println("All elements of ArrayList");
        System.out.print("\t" + arrayList + "\n");

        List<String> linkedList = new LinkedList<>();
        linkedList.add("PHP");
        linkedList.add("Python");
        linkedList.add("Java");
        linkedList.add("C++");
        System.out.println("All elements of LinkedList");
        System.out.print("\t" + linkedList + "\n");

        Set<String> hashSet = new HashSet<>();
        hashSet.add("PHP");
        hashSet.add("Python");
        hashSet.add("Java");
        hashSet.add("Java");
        hashSet.add("C++");
        System.out.println("All elements of Set");
        System.out.print("\t" + hashSet + "\n");

    }
}
