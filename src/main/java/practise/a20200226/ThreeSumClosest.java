package practise.a20200226;

import java.util.Arrays;

/**
 * @author malu
 * @description: leetcode-16,最接近三数之和
 * @date 2020/2/2620:27
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[2];
        int len = nums.length;
        if (len == 3) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            int left = i + 1;
            int right = len - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    return target;
                } else if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
                if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;

    }
}