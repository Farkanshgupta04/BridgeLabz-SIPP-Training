import java.util.Stack;

class StackSorter {
    static void sort(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sort(stack);
            insert(stack, temp);
        }
    }

    static void insert(Stack<Integer> stack, int val) {
        if (stack.isEmpty() || val > stack.peek()) {
            stack.push(val);
        } else {
            int temp = stack.pop();
            insert(stack, val);
            stack.push(temp);
        }
    }
}

public class SortStackRecursion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(10);
        stack.push(20);
        stack.push(5);

        StackSorter.sort(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}