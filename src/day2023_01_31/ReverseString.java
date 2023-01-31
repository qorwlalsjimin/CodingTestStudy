package day2023_01_31;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//문자열 뒤집기
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120822
// 블로그
public class ReverseString {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("jaron"));
    }
}

class Solution {
    public String solution(String my_string) {

        //1> Stream 풀이
        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());
        Collections.reverse(list);
        return String.join("", list);
    }
}