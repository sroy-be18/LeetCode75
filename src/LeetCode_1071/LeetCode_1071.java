package LeetCode_1071;

public class LeetCode_1071 {
    public String gcdOfStrings(String str1, String str2) {
        int gcdLength = gcd(str1.length(), str2.length());
        String candidateOutput = str1.substring(0, gcdLength);
        if(canDivide(str1, candidateOutput) && canDivide(str2, candidateOutput)){
            return candidateOutput;
        }
        return "";
    }

    private boolean canDivide(String str, String candidateOutput) {
        int n = str.length();
        int m = candidateOutput.length();
        if(n%m != 0){
            return false;
        }
        return candidateOutput.repeat(n / m).equals(str);
    }

    private int gcd(int length1, int length2) {
        while(length2 != 0){
            int temp = length2;
            length2 = length1 % length2;
            length1 = temp;
        }
        return length1;
    }
}
