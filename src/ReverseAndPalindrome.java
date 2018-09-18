import java.util.*;

public class ReverseAndPalindrome {
    public boolean checkPalindrome(String str){
        str = str.toLowerCase();
        StringBuffer reverseBuf = new StringBuffer("");
        for(int i=0; i<str.length(); i++)
            reverseBuf = reverseBuf.append(str.charAt(str.length()-1-i));
        if(str.equals(new String(reverseBuf)))
            return true;
        else
            return false;
    }
}
