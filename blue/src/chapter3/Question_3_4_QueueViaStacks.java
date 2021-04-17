package chapter3;

import java.util.Stack;

public class Question_3_4_QueueViaStacks {

    public static void main(String[] argv) {
        Stack<Integer> addToQueueStack = createAddToQueueStack();
        int removedElement = remove(addToQueueStack);
        System.out.println("Removed Element: " + (removedElement == -1 ? "Queue was empty!" : removedElement));
        System.out.println(addToQueueStack);
    }

    private static int remove(Stack<Integer> addToQueueStack) {
        if(addToQueueStack.isEmpty()) {
            return -1;
        }
        Stack<Integer> removeFromQueueTempStack = new Stack<>();
        while(!addToQueueStack.isEmpty()) {
            removeFromQueueTempStack.push(addToQueueStack.pop());
        }
        int result = removeFromQueueTempStack.pop();
        while (!removeFromQueueTempStack.isEmpty()) {
            addToQueueStack.push(removeFromQueueTempStack.pop());
        }

        return result;
    }

    private static Stack<Integer> createAddToQueueStack() {
        Stack<Integer> pushQueue = new Stack<>();
        pushQueue.push(1);
        pushQueue.push(2);
        pushQueue.push(3);
        pushQueue.push(4);

        System.out.println("Queue: ");
        System.out.println(pushQueue);

        System.out.println("Pushing 5: ");
        pushQueue.push(5);
        System.out.println(pushQueue);
        return pushQueue;
    }
}
