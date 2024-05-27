package algorithmStudy.Exam;
import java.util.*;

class Solution5 {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);  // 배열 정렬

        Queue<Integer> queue = new LinkedList<>();
        for (int num : nums) {
            queue.offer(num);
        }

        int[] result = new int[nums.length];
        int index = 0;

        while (!queue.isEmpty()) {
            // Alice가 최소값 제거
            int aliceValue = queue.poll();

            // Bob이 최소값 제거
            if (!queue.isEmpty()) {
                int bobValue = queue.poll();

                // Bob이 제거한 값을 먼저 추가
                result[index++] = bobValue;
            }

            // Alice가 제거한 값을 추가
            result[index++] = aliceValue;
        }

        return result;

    }
    public static void main(String[] args) {
    int[] nums = {5,4,2,3};

    Solution5 solution = new Solution5();
        System.out.println(Arrays.toString(solution.numberGame(nums)));
    }
}