package CollectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class JVHashMap {
    //HashMap stores data as key and value pairs.
    //HashMap contains only unique elements.
    //HashMap allows null key and null value
    //HashMap has no order

    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> numberMapping = new HashMap<>();

        // Add Key-Value into HashMap
        numberMapping.put("One", 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Three", 3);
        numberMapping.putIfAbsent("Four", 4);//Add key-value pairs only if key does not exist in HashMap
                                             //or mapped to null

        //Get a value
        System.out.println(numberMapping.get("One"));

        //Remove an object at key
        numberMapping.remove("Two");

        //Remove all
        numberMapping.clear();

        System.out.println(numberMapping);
    }
}
