package CollectionsFramework;

import java.util.*;

public class TraversingListsandCustomTypes {
    public static void main(String[] argv) {

        // create list
        List<String> myList = new ArrayList<>();

        // add 4 different values to list
        myList.add("Vinh");
        myList.add("Linh");
        myList.add("Minh");
        myList.add("Trinh");


        // Simple For loop
        System.out.println("==============> 1. Simple For loop Example.");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // New Enhanced For loop
        System.out.println("\n==============> 2. New Enhanced For loop Example..");
        for (String temp : myList) {
            System.out.println(temp);
        }

        // Iterator - Returns an iterator over the elements in this list in proper sequence.
        System.out.println("\n==============> 3. Iterator Example...");
        Iterator<String> crunchifyIterator = myList.iterator();
        while (crunchifyIterator.hasNext()) {
            System.out.println(crunchifyIterator.next());
        }

        // ListIterator - traverse a list of elements in either forward or backward order
        // An iterator for lists that allows the programmer to traverse the list in either direction, modify the list during iteration,
        // and obtain the iterator's current position in the list.
        System.out.println("\n==============> 4. ListIterator Example...");
        ListIterator<String> crunchifyListIterator = myList.listIterator();
        while (crunchifyListIterator.hasNext()) {
            System.out.println(crunchifyListIterator.next());
        }

        // while loop
        System.out.println("\n==============> 5. While Loop Example....");
        int i = 0;
        while (i < myList.size()) {
            System.out.println(myList.get(i));
            i++;
        }

        // Iterable.forEach() util: Returns a sequential Stream with this collection as its source
        System.out.println("\n==============> 6. Iterable.forEach() Example....");
        myList.forEach((temp) -> {
            System.out.println(temp);
        });

        // collection Stream.forEach() util: Returns a sequential Stream with this collection as its source
        System.out.println("\n==============> 7. Stream.forEach() Example....");
        myList.stream().forEach((crunchifyTemp) -> System.out.println(crunchifyTemp));
    }
}
