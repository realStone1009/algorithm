package algorithmStudy.Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution8 {
    static int count,target ;
    static List<Integer> nums;
    static void rec_func(int k) {
        if (k == nums.size()) {
            return;
        } else {
            for (int i = k + 1; i < nums.size(); i++) {
                if (nums.get(k) + nums.get(i) < target) {
                    count++;
                }
            }
            rec_func(k + 1);
        }
    }

    public int countPairs(List<Integer> nums, int target) {
        this.count = 0;
        this.nums = nums;
        this.target = target;
        rec_func(0);

        return count;
    }
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums = Arrays.stream(new int[]{-6,2,5,-2,-7,-1,3}).boxed().collect(Collectors.toList()); ;
        Solution8 solution8 = new Solution8();
        System.out.println(solution8.countPairs(nums, -2));
    }
}