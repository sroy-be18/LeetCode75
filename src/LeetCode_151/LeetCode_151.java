package LeetCode_151;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode_151 {
    public String reverseWords(String s) {
        //brute force
        List<String> words = new ArrayList<>();
        int n = s.length();
        for(int i = 0; i < n; i++){
            while(i < n && s.charAt(i) == ' '){
                i++;
            }
            if(i < n){
                StringBuilder sb = new StringBuilder();
                int j = i;
                while(j < n && s.charAt(j) != ' '){
                    sb.append(s.charAt(j));
                    j++;
                }
                words.add(sb.toString());
                i = j;
            }
        }
        Collections.reverse(words);
        return String.join(" ", words);
    }
    public String reverseWordsBuiltInMethod(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");
        StringBuilder output = new StringBuilder();
        for(int i = words.length-1; i >= 0; i--){
            output.append(words[i]);
            if(i != 0){
                output.append(" ");
            }
        }
        return output.toString();
    }
}
