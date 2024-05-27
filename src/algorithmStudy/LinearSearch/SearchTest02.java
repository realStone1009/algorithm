package algorithmStudy.LinearSearch;

public class SearchTest02 {
    boolean solution(String s) {
        String s2 = s.toUpperCase();
        char[] strArr = s2.toCharArray();
        int count = 0;
        for(int i = 0; i<strArr.length; i++){
            if(strArr[i] == ('P')){
                count++;  
            }
            if(strArr[i] == ('Y')){
                count--;
            }
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return count ==0;
    }
    public static void main(String[] args) {
    }
}
