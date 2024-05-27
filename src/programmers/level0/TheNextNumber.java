package programmers.level0;

public class TheNextNumber {
     /*
     /     common      	result
        [1, 2, 3, 4]      5
        [2, 4, 8]	      16
     */

    public int solution(int[] common) {
        int answer = 0;
        if (common[1] - common[0] == common[2] - common[1]) {
            answer = common[common.length - 1] + (common[1] - common[0]);
        } else {
            answer = common[common.length - 1] * common[2] / common[1];
        }
        return answer;
    }

    public static void main(String[] args) {
        TheNextNumber theNextNumber = new TheNextNumber();
        theNextNumber.solution(new int[]{1, 2, 3, 4});
    }
}
