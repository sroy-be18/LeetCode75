package LeetCode_11;

public class LeetCode_11 {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int maxArea = 0;
        while (left < right){
            if((right - left) * Math.min(height[right], height[left]) > maxArea){
                maxArea = (right - left) * Math.min(height[right], height[left]);
            }
            if(height[right] < height[left]){
                right--;
            }
            else {
                left ++;
            }
        }
        return maxArea;
    }
}
