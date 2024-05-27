package algorithmStudy.Sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortTest01 {

    public int[] solution(int[] arr) {

        //[4,3,2,1]	[4,3,2]
        //[10]	[-1], Collections.reverseOrder());
        if(arr.length == 1){

            return new int[]{-1};
        }
        List<Integer> arrToList = Arrays.stream(arr)
                                        .boxed()
                                        .collect(Collectors.toList());
        arrToList.sort(Comparator.reverseOrder());
        arrToList.remove(arrToList.size()-1);

        int[] answer = arrToList.stream().mapToInt(i->i).toArray();
        return answer;
    }
    public int[] otherSolution(int[] arr){
//        int min = Integer.MAX_VALUE;
//        if(arr.length == 1){
//            return new int[] {-1};
//        }
//        for(int a : arr) if(a<min) min = a;
//        int index = 0;
//        int[] answer = new int[arr.length-1];
//        for(int a : arr){
//            if (a == min ) continue;
//            answer[index++] = a;
//        }
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i->i!=min).toArray();
//        return answer;
    }

    public static void main(String[] args) {
        SortTest01 s = new SortTest01();
        s.solution(new int[]{ 32,123,21,332,3122,41
        });
    }

}
