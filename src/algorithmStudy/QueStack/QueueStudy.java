package algorithmStudy.QueStack;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueStudy {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        //queue
        // System.out.println(list);
        // System.out.println(list.remove(0));
        // System.out.println(list);
        //stack
        // System.out.println(list);
        // System.out.println(list.remove(list.size()-1));
        // System.out.println(list);
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
        
    }
    

    
}
