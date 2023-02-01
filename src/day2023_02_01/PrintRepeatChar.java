package day2023_02_01;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PrintRepeatChar {
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        System.out.println(s.solution("hello", 3));
    }
}

class Solution4 {
    public String solution(String my_string, int n) {
        StringBuilder stringBuilder = new StringBuilder();

        //1> 이중 반복문 [내 풀이]
        for(int i = 0; i<my_string.length(); i++)
            for(int j = 0; j<n; j++)
                stringBuilder.append(my_string.charAt(i));

        //2> repeat [남의 풀이]
//        for(char c : my_string.toCharArray())
//            answer.append((c+"").repeat(n));

        return stringBuilder.toString();
    }
}