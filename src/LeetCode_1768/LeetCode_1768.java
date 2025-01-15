package LeetCode_1768;

public class LeetCode_1768 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder output = new StringBuilder();
        int size1 = word1.length();
        int size2 = word2.length();
        int i = 0, j = 0;
        while (i < size1 && j < size2) {
            output.append(word1.charAt(i));
            output.append(word2.charAt(j));
            i++;
            j++;
        }
        while (i < size1) {
            output.append(word1.charAt(i));
            i++;
        }
        while (j < size2) {
            output.append(word2.charAt(j));
            j++;
        }
        return output.toString();
    }
}
