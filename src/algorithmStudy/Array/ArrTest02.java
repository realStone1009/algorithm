package algorithmStudy.Array;
import java.util.Arrays;

public class ArrTest02 {
    public boolean  mySolution(int[] arr) {
        boolean answer = true;
        Arrays.sort(arr);
        for(int i= 0 ; i<arr.length; i++){
            if(arr[i]>arr.length){
                answer= false;
                return answer ;
            }
            if(arr[i] != i+1){
                answer= false;
                return answer ;
            }
        }

        return answer;
    }
    public boolean otherSolution(int[] arr){
        //O(nlogn)
        int[] answer = new int[arr.length];
        Arrays.sort(arr);
        for(int i = 0 ;i<answer.length;i++){
            answer[i] = i+1;
        }
        return Arrays.equals(answer,arr);
    }

    
}
