package Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrTest03{
    /*
     * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
     */
    public int[] solution(long n) {
        int[] answer = {};
        int num = 0;
        List<Integer> arrList = new ArrayList<Integer>();
        while(n > 0){
            num = (int) (n%10);
            arrList.add(num);
            n /= 10;
        }
 
        answer = arrList.stream().mapToInt(i->i).toArray();
        return  answer;
    }
    public int[] otherSoultion(long n){
        List<Integer> list = new LinkedList<>();
        while(n > 0){
        list.add((int)(n%10));
        n = n/10;

        }
        return list.stream().mapToInt(Integer::intValue).toArray() ;
    }

}
