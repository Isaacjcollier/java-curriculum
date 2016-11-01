import java.util.*;

public class Practice {

  public static void main (String [] args) {
    // create a HashmMap
    HashMap<Integer, String> classMates = new HashMap<Integer, String>();
    // Add everyone at your table with the key as your rating for how awesome they are
    classMates.put(12, "Kristjan");
    classMates.put(11, "George");
    classMates.put(9, "Isaac");
    classMates.put(8, "Derek");
    //get one value and print it out
    System.out.println(classMates.get(2));
    // remove yourself
    classMates.remove(9);
    // print
    System.out.println(classMates);
  }
}

// // Create a new ArrayList
// ArrayList<String> names = new ArrayList<String>();
// // Add everyone at your tables name to it
// names.add("George");
// names.add("Derek");
// names.add("Isaac");
// names.add("Kristjan");
// // Print it out
// System.out.println("All the names: " + names);
// // remove yourself
// names.remove("Isaac");
// // Print it out again
// System.out.println("All the names(without Isaac): " + names);
