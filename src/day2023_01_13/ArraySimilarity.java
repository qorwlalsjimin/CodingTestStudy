package day2023_01_13;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

//배열의 유사도
//문제 https://school.programmers.co.kr/learn/courses/30/lessons/120903
//블로그
public class ArraySimilarity {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] s1 = new String[]{"n", "omg"};
        String[] s2 = new String[]{"m", "dot"};
        System.out.println(s.solution(s1, s2));
    }
}

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String s : s1)
            for(String ss : s2)
                if(s.equals(ss)) answer++;
        return answer;
    }
}
