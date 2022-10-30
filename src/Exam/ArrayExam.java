package Exam;

public class ArrayExam {
    public int Solution(String s){
        int answer = 0;
        //"one4seveneight"	1478
        //"23four5six7"	234567
        //"2three45sixseven"	234567
        //"123"	123
        String[] nums ={"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i = 0; i<nums.length; i++){
           s = s.replace(nums[i],String.valueOf(i));
        }
        answer = Integer.parseInt(s);
        return answer;

    }

    public static void main(String[] args) {
        ArrayExam arr = new ArrayExam();
        System.out.println(arr.Solution("2three45sixseven"));

    }
}
