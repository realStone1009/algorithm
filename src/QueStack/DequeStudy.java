package QueStack;

import java.util.Deque;
import java.util.LinkedList;

public class DequeStudy {
    public static void main(String[] args) {
        
        Deque<Integer> deque = new LinkedList<>();
        deque.offerFirst(1);
        System.out.println(deque);

        deque.offerLast(2);
        System.out.println(deque);

        deque.offerFirst(1);
        System.out.println(deque);
        
        deque.offerLast(1);
        System.out.println(deque);

        deque.pollFirst();
        System.out.println(deque);
    }
}
