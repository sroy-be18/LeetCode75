package LeetCode_1431;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;
        for(int candy : candies){
            maxCandies = Math.max(candy, maxCandies);
        }
        for(int candy : candies){
            result.add(candy + extraCandies >= maxCandies);
        }
        return result;
    }
}
