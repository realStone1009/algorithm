package QueStack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class Test02 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> que = new LinkedList<>();
        //[93, 30, 55], [1, 30, 5]
        //[7,3,9]
        for(int i = 0; i<progresses.length; i++){
            float p = progresses[i];
            float s = speeds[i];
            int days = (int)Math.ceil((100-p)/s);
            que.offer(days);
        }
        Queue<Integer> answer = new LinkedList<>();
        int count = 1;
        int pre = que.poll();
        while(!que.isEmpty()){
            int n =que.poll();
            if(pre >= n){
                count++;
                continue;
            }
            answer.offer(count);
            count = 1;
            pre = n;

        }
        answer.offer(count);
        //[2,1]
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        Test02 test = new Test02();
        int[] arr = {93,30,55};
        int[] arr2 = {1, 30, 5};
        test.solution(arr,arr2);
    }
}
