package LeetCode_605;

public class LeetCode_605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int size = flowerbed.length;
        for(int i = 0; i < size; i++){
            int left = i == 0 ? 0 : flowerbed[i-1];
            int right = i == size - 1 ? 0 : flowerbed[i+1];
            if(left + right + flowerbed[i] == 0){
                flowerbed[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }
}
