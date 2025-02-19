import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ArrayListIterator {
    public static void main(String[] args) {
        // Create and populate the ArrayList with 10 random integers
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(100)); // Random numbers between 0-99
        }

        System.out.println("Original List: " + numbers);

        // Use an Iterator to traverse the list and calculate sum
        Iterator<Integer> iterator = numbers.iterator();
        int sum = 0;
        while (iterator.hasNext()) {
            int num = iterator.next();
            System.out.print(num + " ");
            sum += num;
        }
        System.out.println("\nTotal Sum: " + sum);

        // Attempt to modify list while iterating
        try {
            for (Integer num : numbers) {
                if (num % 2 == 0) { // If number is even, remove it
                    numbers.remove(num);
                }
            }
        } catch (Exception e) {
            System.out.println("Error modifying list during iteration: " + e.getMessage());
        }
    }
}
