package Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrTest01 {
        public int[] mySolution(int[] arr) {
            int[] answer = {};
            int max = arr[0];
            int index = 0;
            int count = 0;
            int arrNumber =0;       
            //{0,1,2,3}
            for(int i = 0 ; i < arr.length ; i++) {
                if(max < arr[i]){
                    max = arr[i];
                }
            }
            for(int i = 0 ; i < arr.length ; i++) {
                if(max == arr[i]){
                    count++;
                }
            }
            answer = new int[count];
            for(int i = 0 ; i < arr.length ; i++) {
                if(max == arr[i]){
                    index = i;
                    answer[arrNumber++] = index;
                }
            }
        return answer;
        }
        //1.배열을 사용하여 푼 방법
        public int[] arraySolution(int[] arr) {
            int[] answer = {};
            int max = 0;
            int index = 0;
            int count = 0; 
            //{0,1,2,3}
            for(int i : arr) if(i > max) max = i;
            for(int i : arr) if(i == max) count++;
            answer = new int[count];
            for(int i = 0 ; i<arr.length; i++) if(arr[i] == max) answer[index++] = i;
        return answer;
        }

        public int[] listSolution(int[] arr){
            int[] answer = {};
            //Find max Using Stream
            int max = Arrays.stream(arr).max().getAsInt();
            //Using IntStream
            answer = IntStream.range(0, arr.length).filter(i-> arr[i] == max).toArray();
            return answer;
            // for(int i : arr) if( i > max) max = i;
            // List<Integer> integerList = new LinkedList<>();
            // for(int i = 0 ; i < arr.length ;i++) if( arr[i] == max) integerList.add(i);
            // //List to convert Array
            // answer = new int[integerList.size()];
            // for(int i = 0; i<integerList.size(); i ++) answer[i] = integerList.get(i);
            // //Using Stream
            // return 
            // integerList.stream().mapToInt(Integer::intValue).toArray();
        }
}

