package algorithmStudy.Exam;

public class StringSplitExam {
    public int solution(String s) {
        int answer = 0;
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        return answer;

    }

    public static void main(String[] args) {
        String s = "banana";
        char[] chars = new char[s.length()];
        int answer = 0;
        char x1 = s.charAt(0);
        char x2 = ' ';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (x1 == s.charAt(i)) {
                count++;
            } else {
                count--;
            }
            if(i+1 == s.length()){
                answer++;
                break;
            }
            if (count == 0) {
                answer++;
                x1 = s.charAt(i+1);
            }
        }
        System.out.println(answer);
    }
}
