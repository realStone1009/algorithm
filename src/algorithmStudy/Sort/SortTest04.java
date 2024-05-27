package algorithmStudy.Sort;

import java.util.Arrays;

public class SortTest04 {
    public int solution(int[] citations) {
        //[0,1,3,5,6]
        Arrays.sort(citations);
        int h = 0;
        for(int i = 0; i<citations.length;i++){
            h = citations.length - i;
            if(citations[i] >= h) return h;
        }
        return 0;
    }
    public static void main(String[] args) {
        SortTest04 s = new SortTest04();

        int a = s.solution(new int[]{0,3,1,5,6});
        System.out.println(a);
    }
}
