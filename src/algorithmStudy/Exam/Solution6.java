package algorithmStudy.Exam;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

    public class Solution6 {

        public static void quickSort(int[] nums, int low, int high) {
            if (low < high) {
                int pi = partition(nums, low, high);

                quickSort(nums, low, pi - 1);  // 왼쪽 부분 배열을 정렬합니다.
                quickSort(nums, pi + 1, high); // 오른쪽 부분 배열을 정렬합니다.
            }
        }

        public static int partition(int[] nums, int low, int high) {
            int pivot = nums[high]; // 피벗을 배열의 마지막 요소로 선택합니다.
            int i = (low - 1);

            for (int j = low; j < high; j++) {
                if (nums[j] <= pivot) {
                    i++;
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            int temp = nums[i + 1];
            nums[i + 1] = nums[high];
            nums[high] = temp;

            return i + 1;
        }

    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;
        quickSort(nums, 0, nums.length - 1);
        int max = nums[nums.length - 1];
        int secondMax = nums[nums.length - 2];
        return (max -1)* (secondMax -1);
    }

    public static void main(String[] args) {
    int[] nums = {10,7,2,5};

    Solution6 solution = new Solution6();
        System.out.println((solution.maxProduct(nums)));
    }
}