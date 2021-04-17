package chapter3;

import java.util.Stack;

public class Question_3_5_SortStack {

    public static void main(String[] argv) {
        Stack<Integer> inputStack = createStack();
        System.out.println("Sorted stack: " + sortStack(inputStack));
    }

    private static Stack<Integer> sortStack(Stack<Integer> inputStack) {
        int min = Integer.MAX_VALUE;
        Stack<Integer> tempSortingStack = new Stack<>();
        int stackSize = inputStack.size();

        for(int i = 0; i < stackSize; i++) {
            for(int j = i; j < stackSize; j++) {
                Integer top = inputStack.pop();
                if(top < min) {
                    min = top;
                }
                tempSortingStack.push(top);
            }

            inputStack.push(min);
            while(!tempSortingStack.isEmpty()) {
                int top = tempSortingStack.pop();
                if(top != min) {
                    inputStack.push(top);
                }
            }
            min = Integer.MAX_VALUE;
        }

        return inputStack;
    }

    private static Stack<Integer> createStack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(4);
        stack.push(6);
        stack.push(5);

        System.out.println("Stack: " + stack);
        return stack;
    }
}
