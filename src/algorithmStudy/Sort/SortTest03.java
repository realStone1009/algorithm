package algorithmStudy.Sort;

public class SortTest03 {
    public String solution(String s) {
        String answer = "";
        String lowerS = s.toLowerCase();
        char last = ' ';
        for(char a : lowerS.toCharArray()){
            if(last == ' ') a = Character.toUpperCase(a);
            answer += a;
            last = a;

        }

//        String answer = "";
//        String[] strArr = s.toLowerCase().split(" ");
//        for(String word : strArr){
//            if(Character.isLetter(word.charAt(0))){
//                word = word.substring(0, 1).toUpperCase() +word.substring(1,word.length())+ " ";
//                answer += word;
//            }else{
//                answer += word+ " ";
//            }
//        }
//        ;
//        return answer.substring(0,answer.length()-1);
        return answer;
    }

    public static void main(String[] args) {
        SortTest03 ss = new SortTest03();
        String s = "for the last week";

        System.out.println(ss.solution(s));

    }
}
