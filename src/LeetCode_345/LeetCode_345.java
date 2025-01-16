package LeetCode_345;

import java.util.Arrays;

public class LeetCode_345 {
    public String reverseVowels(String s) {
        int beg = 0, end = s.length()-1;
        char [] charArray = s.toCharArray();
        while(beg < end){
            if(isVowel(charArray[beg]) && isVowel(charArray[end])){
                char temp = charArray[beg];
                charArray[beg] = charArray[end];
                charArray[end] = temp;
                beg++;
                end--;
            }
            if(isVowel(charArray[beg]) && !isVowel(charArray[end])){
                end--;
            }
            if(!isVowel(charArray[beg]) && isVowel(charArray[end])){
                beg++;
            }
            if(!isVowel(charArray[beg]) && !isVowel(charArray[end])){
                beg++;
                end--;
            }

        }
        return new String(charArray);
    }
    public boolean isVowel(char c){
        return (c == 'A' || c == 'a' || c == 'E' || c== 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u');
    }
}
