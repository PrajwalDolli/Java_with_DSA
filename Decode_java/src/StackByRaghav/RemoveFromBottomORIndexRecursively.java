package StackByRaghav;
import java.util.Stack;

public class RemoveFromBottomORIndexRecursively {
    public static void recursivePop(Stack<Integer> st, int idx) {
        if (idx == 0) { // Base case: Reached the target index
            st.pop();
            return;
        }
        int ele = st.pop(); // Remove top element
        recursivePop(st, idx - 1); // Reduce index and continue
        st.push(ele); // Push elements back after removing target element
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        int idx = 3; // Remove element at index 1 (from bottom)
        System.out.println("Before: " + st); // Output: [1, 2, 3, 4]
        recursivePop(st, st.size() - 1 - idx); // Convert bottom index to top index
        System.out.println("After: " + st);  // Expected Output: [1, 3, 4]
    }
}
