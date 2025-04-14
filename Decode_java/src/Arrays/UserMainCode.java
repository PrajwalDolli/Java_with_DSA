import java.io.*;
import java.util.*;

class UserMainCode {

    public int uniqueNumbers(int input1, int input2, int input3) {
        // Set to store unique number of marbles left in the jar
        Set<Integer> uniqueMarbles = new HashSet<>();
        // Queue for BFS (Breadth-First Search) to explore all possible outcomes
        Queue<Integer> queue = new LinkedList<>();

        // Start with the initial number of marbles
        queue.add(input1);
        uniqueMarbles.add(input1);

        // Perform BFS
        while (!queue.isEmpty()) {
            int currentMarbles = queue.poll();

            // Perform operation by subtracting input2 (A)
            int newMarblesA = currentMarbles - input2;
            if (newMarblesA > 0 && !uniqueMarbles.contains(newMarblesA)) {
                queue.add(newMarblesA);
                uniqueMarbles.add(newMarblesA);
            }

            // Perform operation by subtracting input3 (B)
            int newMarblesB = currentMarbles - input3;
            if (newMarblesB > 0 && !uniqueMarbles.contains(newMarblesB)) {
                queue.add(newMarblesB);
                uniqueMarbles.add(newMarblesB);
            }
        }

        // Return the total count of unique marbles left
        return uniqueMarbles.size();
    }

    public static void main(String[] args) {
        UserMainCode obj = new UserMainCode();

        // Example 1
        System.out.println(obj.uniqueNumbers(4, 1, 2));  // Output: 4

        // Example 2
        System.out.println(obj.uniqueNumbers(10, 2, 5));  // Output: 8
    }
}