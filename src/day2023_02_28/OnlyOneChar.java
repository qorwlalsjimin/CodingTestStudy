package day2023_02_28;

import java.util.Arrays;
import java.util.stream.StreamSupport;

public class OnlyOneChar {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("abcabcadc"));
        System.out.println(s.solution("hello"));
        System.out.println(s.solution("abdc"));
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] copy_s = s.toCharArray();
        Arrays.sort(copy_s);

        for(char c : copy_s)
            if(s.length() - (s.replaceAll(String.valueOf(c), "")).length() == 1) answer += c+"";

        return answer;
    }
}