package LeetCode_283;

public class LeetCode_283 {
    public void moveZeroes(int[] nums) {
        //[0,1,0,3,12]
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j++] = temp;
            }
        }
    }
}
