package algorithmStudy.Exam;

import javax.swing.*;
import java.util.Arrays;

class Solution7 {
    public int[] solution(int[] array, int[][] commands) {
        int i, j, k = 0;
        int[] answer = new int[commands.length];

        for (int p = 0; p < commands.length; p++) {
            i = commands[p][0];
            j = commands[p][1];
            k = commands[p][2];
            int[] temp = new int[j-i +1];
            temp = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(temp);
            answer[p] = temp[k-1];
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        Solution7 solution7 = new Solution7();
        System.out.println(Arrays.toString(solution7.solution(arr, command)));
    }
}