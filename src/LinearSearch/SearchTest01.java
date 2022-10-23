package LinearSearch;

import java.util.Arrays;

public class SearchTest01 {
    
    public boolean solution(String[] phone_book) {
    //119 97674223 1195524421
    String prefix = phone_book[0];
    for(int i = 1 ; i<phone_book.length ; i++){
        if(phone_book[i].startsWith(prefix)){
            return false;
        } 
        else{
            prefix = phone_book[i];
        } 
    }
    boolean answer = true;
    return answer;
}

    public static void main(String[] args) {
        String[] str = {"119","9399213","9491213323"};
        Arrays.sort(str);
        for(String s : str)
        System.out.println(s);

        String st1 = "S";
        String st2 = "s";
        System.out.println(st1.equals(st2.toUpperCase()));
        }
    
}
