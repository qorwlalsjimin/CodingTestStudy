package day2023_01_11;

import java.util.Arrays;
import java.util.stream.Collectors;

//문자열 정렬하기(2)
//문제 https://school.programmers.co.kr/learn/courses/30/lessons/120911
//블로그 https://qiwisil.tistory.com/38
public class SortString {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("Bcad"));
    }
}

class Solution {
    public String solution(String my_string) {
//        //1> char배열 to 문자열 => Arrays.sort()
//        char[] chars = my_string.toLowerCase().toCharArray();
//        Arrays.sort(chars);
//        String answer = new String(chars);
//        return answer;

        //2> Stream
        return Arrays.stream(my_string.toLowerCase().split("")) //소문자가 된 문자열을 ""로 나누어 Stream 생성
                .sorted() //정렬
                .collect(Collectors.joining()); //collect로 String형으로 모아준다
    }
}
