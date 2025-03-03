package LeetCode_1679;

import java.util.Arrays;

public class LeetCode_1679 {
    public int maxOperations(int[] nums, int k) {
        int count = 0;
        Arrays.sort(nums);
        int left = 0, right  = nums.length - 1;
        while(left < right){
            if(nums[right] + nums[left] == k){
                count++;
                right--;
                left++;
            } else if (nums[right] + nums[left] > k) {
                right--;
            }
            else{
                left++;
            }
        }
        return count;
    }
}
