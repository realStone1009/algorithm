package Set;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

 class SetTest03 {

    int[] solution(int []arr) {
        List<Integer> list = new LinkedList<>();
        int last = -1;
        for(int i = 0; i<arr.length; i++){
            if(last == arr[i]) continue;
            
            last = arr[i];
            list.add(arr[i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        SetTest03 test = new SetTest03();
        System.out.println(Arrays.toString(test.solution(arr)));
    }
}
