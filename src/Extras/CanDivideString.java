package Extras;

public class CanDivideString {
    public boolean canDivide(String str1, String str2){
        if(str1.length() % str2.length() != 0){
            return false;
        }
        return str2.repeat(str1.length() / str2.length()).equals(str1);
    }
}
