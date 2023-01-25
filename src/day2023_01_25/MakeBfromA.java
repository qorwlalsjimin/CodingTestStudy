package day2023_01_25;

import java.util.Arrays;

//A로 B 만들기
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120886
// 블로그 https://qiwisil.tistory.com/44
public class MakeBfromA {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("*"+s.solution("olleh", "hello"));
//        System.out.println(s.solution("allpe", "apple"));
    }
}

class Solution {
    public int solution(String before, String after) {
        Object[] arrbefore =
                Arrays.stream(before.split("")) //문자열 to Stream
                .sorted() //Stream 정렬
                .toArray(); //Stream to 배열
        Object[] arrafter = Arrays.stream(after.split("")).sorted().toArray();
        return Arrays.equals(arrbefore, arrafter) ? 1 : 0;
    }
}
