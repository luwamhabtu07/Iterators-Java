import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIterator {
    public static void main(String[] args) {
        // Create and populate HashMap
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("Books", 12);
        inventory.put("Movies", 8);
        inventory.put("Games", 15);
        inventory.put("Clothes", 5);
        inventory.put("Shoes", 20);

        // Iterate using an Iterator
        Iterator<Map.Entry<String, Integer>> iterator = inventory.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // Modify values during iteration
        iterator = inventory.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getKey().equals("Books")) {
                inventory.put("Books", entry.getValue() + 5); // Increase book count
            }
            if (entry.getKey().equals("Shoes")) {
                iterator.remove(); // Remove shoes
            }
        }

        System.out.println("Updated Inventory: " + inventory);
    }
}
