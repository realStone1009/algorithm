package algorithmStudy.QueStack;

import java.util.LinkedList;
import java.util.List;

public class Test04 {
    class Paper{
        boolean isMine;
        int priority;
        Paper(int p, boolean m){
            priority = p;
            isMine = m;
        }
    }

    public int solution(int[] priorities, int location){
        int answer = 0;
        //[2,1,3,2]
        //2[1,(3),2]
        //(3)[2,2,1]

        //[(1),1,9,1,1,1]
        //(1)[1,9,1,1,1]
        //9[1,1,1,1,(1)]
        // [1,1,1,1,(1)]1번째 출력
        // [1,1,1,(1)] 2번째 출력
        // [1,1,(1)] 3번째 출력
        // [1,(1)] 4번째 출력
        // [(1)] 5번째 출력
        List<Paper> queue = new LinkedList<>();
        for(int i = 0 ; i<priorities.length;i++){
            queue.add(new Paper(priorities[i],i==location));
        }
        while(!queue.isEmpty()){
            Paper now = queue.remove(0);
            boolean printable = true;
            for(Paper p : queue){
                if(now.priority < p.priority ){
                    printable = false;
                    break;
                }
            }
            if(!printable){
                queue.add(now);
                continue;
            }
            answer++;
            if(now.isMine){
                return answer;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Test04 test = new Test04();
        int[] arr = {1, 1, 9, 1, 1, 1};
        test.solution(arr, 0);
    }
}
