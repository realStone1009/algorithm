package QueStack;

import java.util.Arrays;
import java.util.Comparator;

public class Test04 {
    public int solution(int[] priorities, int location){
        int answer = 0;
        //[2,1,3,2]
        //2
        //1
        Integer[] integerArr = Arrays.stream(priorities).boxed().toArray( Integer[]::new );
        Arrays.sort(integerArr, Comparator.reverseOrder());
        for(int i = 0 ; i<integerArr.length;i++){
            if(integerArr[i]==location){
                answer = i;
                break;
            }
            if(i== integerArr.length && answer ==0){
                answer = integerArr.length;
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
