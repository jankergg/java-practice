package Algorithem;
import java.util.HashMap;
public class lengthOfLongestSubstring {

    public static void main(String[] args) {
       int len = _lengthOfLongestSubstring("abdfqadfafd") ;
       System.out.println(len);
    }

    private static int _lengthOfLongestSubstring(String s){
        if(s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        for(int i=0,j=0;i<s.length();++i){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                j = Math.max(j, map.get(c) + 1);
            }
            map.put(c, i);
            max = Math.max(max, i-j + 1);
        }
        return max;
    }
}
