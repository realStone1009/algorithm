package Sort;

import java.util.Arrays;

public class SortTest02 {
    public String[] solution(String[] strings, int n){
        Arrays.sort(strings, (s1 ,s2)-> {
            if(s1.charAt(n) == s2.charAt(n))return s1.compareTo(s2);
            return s1.charAt(n) - s2.charAt(n);
        });
        return strings;
    }

    public static void main(String[] args) {
        SortTest02 s = new SortTest02();
        s.solution(new String[]{"car","apple","corn"

        },0);
    }
}
