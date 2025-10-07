package LeetCode_169;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LeetCode_169 {
    public int majorityElement(List<Integer> nums){
        int count = 0;
        int element = 0;
        for(int num : nums){
            if(count == 0){
                element = num;
                count++;
            }else if (element == num){
                count++;
            }else {
                count--;
            }
        }
        count = 0;
        for(int num : nums){
            if(num == element){
                count++;
            }
        }
        return count > nums.size()/2 ? element : -1;
    }
    public int majorityElementMap(List<Integer> nums){
        Map<Integer, Long> frequencyMap = nums.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for(Map.Entry<Integer, Long> entry : frequencyMap.entrySet()){
            if(entry.getValue() > nums.size() / 2){
                return entry.getKey();
            }
        }
        return -1;
    }
}
