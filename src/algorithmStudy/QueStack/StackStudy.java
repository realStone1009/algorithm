package algorithmStudy.QueStack;

import java.util.Stack;

// Queue : offer, poll, peek : 들어간 순서대로
// Stack : push, pop, peek : 들어간 반대로
// Deque : offerFirst, offerLast, pollFirst/Last, peekFirst/Last : 양방향
public class StackStudy {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(2);
        stack.push(3);
        stack.push(2);
        stack.push(5);

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.err.println();
        
    }
}
