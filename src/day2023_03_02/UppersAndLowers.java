package day2023_03_02;

import java.util.Arrays;
import java.util.stream.Collectors;

//대문자와 소문자
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120893
// 블로그 https://qiwisil.tistory.com/63
public class UppersAndLowers {
    public static void main(String[] args) {
        Solution5 s = new Solution5();
        System.out.println(s.solution("cccCCC"));
    }
}

class Solution5 {
    public String solution(String my_string) {
        return Arrays.stream(my_string.split(""))
                .map(m -> m.charAt(0)<91 ? m.toLowerCase() : m.toUpperCase()) //아스키코드 91보다 작으면 대문자임
                .collect(Collectors.joining());
    }
}