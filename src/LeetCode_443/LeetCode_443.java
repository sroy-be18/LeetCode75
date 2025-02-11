package LeetCode_443;

public class LeetCode_443 {
    public int compress(char[] chars) {
        //"a","a","b","b","c","c","c"
        int index = 0;
        int groupSize = 1;
        for(int i = 1; i < chars.length; i++){
            if(chars[i-1] == chars[i]){
                ++groupSize;
            }
            else{
                chars[index++] = chars[i-1];
                if(groupSize > 1){
                    for(char c : String.valueOf(groupSize).toCharArray()){
                        chars[index++] = c;
                    }
                }
                groupSize = 1;
            }
        }
        chars[index++] = chars[chars.length - 1];
        if(groupSize > 1){
            for(char c : String.valueOf(groupSize).toCharArray()){
                chars[index++] = c;
            }
        }
        return index;
    }
}
