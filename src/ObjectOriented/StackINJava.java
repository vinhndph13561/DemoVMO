package ObjectOriented;

import java.util.Stack;

public class StackINJava {
    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        // Add elements to Stack
        animals.push("Dog"); //add first
        animals.push("Horse");
        animals.push("Cat");
        animals.add(2,"Dogg"); //add at index

        System.out.println("Stack: " + animals);

        // Remove element stacks
        String element = animals.remove(1); //remove at index
        System.out.println("Removed Element: " + element);
        System.out.println("New Vector: " + animals);
        String element1 = animals.pop(); //last element
        System.out.println("Removed Element: " + element1);
        animals.clear(); //remove all
        System.out.println("Vector after clear(): " + animals);

        // Access element
        String element2 = animals.get(2);
        System.out.println("Element at index 2: " + element2);
        String element3 = animals.peek(); //Access element from the top
        System.out.println("Element at top: " + element3);

        // Search an element
        int position = animals.search("Horse");
        System.out.println("Position of Horse: " + position);

        // Check if stack is empty
        boolean result = animals.empty();
        System.out.println("Is the stack empty? " + result);
    }
}
