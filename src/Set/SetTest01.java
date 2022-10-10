package Set;

import java.util.HashSet;

public class SetTest01 {
    boolean solution(int[] lotto){
        HashSet<Integer> set = new HashSet<>();
        boolean answer = true;
        for(int item : lotto){
            set.add(item);

        }
        if(set.size()!=6){
            answer = false;
        }
        return answer;
    }
}
