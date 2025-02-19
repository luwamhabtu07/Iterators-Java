import java.util.Map;
import java.util.TreeMap;

public class TreeMapIterator {
    public static void main(String[] args) {
        // Create and populate TreeMap
        TreeMap<String, Double> temperatures = new TreeMap<>();
        temperatures.put("January", 32.5);
        temperatures.put("February", 35.0);
        temperatures.put("March", 45.2);
        temperatures.put("April", 55.1);
        temperatures.put("May", 65.4);
        temperatures.put("June", 75.3);

        // Find highest and lowest temperatures
        Map.Entry<String, Double> lowest = temperatures.firstEntry();
        Map.Entry<String, Double> highest = temperatures.lastEntry();

        System.out.println("Lowest Temperature: " + lowest.getKey() + " → " + lowest.getValue());
        System.out.println("Highest Temperature: " + highest.getKey() + " → " + highest.getValue());
    }
}
