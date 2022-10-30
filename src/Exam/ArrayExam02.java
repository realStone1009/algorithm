package Exam;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayExam02 {
    public int Soulution(int[] numbers){
        //[1,2,3,4,6,7,8,0]	14
        //[5,8,4,0,6,7,9]	6
        Arrays.sort(numbers);   // int -> List
        List<Integer> numbersList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        int[] arr = IntStream.range(0,9).toArray();
        List<Integer> zeroToNine = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int count = numbersList.size();
        while(count>0){
            zeroToNine.remove(numbersList.get(count-1));
            count--;
        }
        int sum = 0;
        for(int i : zeroToNine) sum += i ;

        return sum ;

    }

    public static void main(String[] args) {
        ArrayExam02 arr = new ArrayExam02();
        arr.Soulution(new int[]{1, 2, 3, 4});
    }
}
