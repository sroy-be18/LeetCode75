package LeetCode_238;

import java.util.Arrays;

public class LeetCode_238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int res = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    res *= nums[j];
                }
            }
            result[i] = res;
        }
        return result;
    }

    public int[] productExceptSelfOptimized(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int prefix = 1, postfix = 1;
        Arrays.fill(result, 1);
        for (int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= postfix;
            postfix *= nums[i];
        }
        return result;
    }
}
