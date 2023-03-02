package day2023_03_02;

import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.stream.IntStream;

//문자열 정렬하기(1)
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120850
// 블로그 https://qiwisil.tistory.com/65
public class SortStr {
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        int[] answer = s.solution("p2o4i8gj2"); //2 4 8 2 // 2 2 4 8

        for(int a : answer)
            System.out.print(a+" ");

    }
}

class Solution3 {
    public int[] solution(String my_string) {
        /*나의 풀이*/
        char[] chars = my_string.toCharArray(); //String to char[]

        int[] answer = CharBuffer.wrap(chars).chars() //char[] to Stream
                .filter(Character::isDigit) //숫자만 남기기
                .map(Character::getNumericValue) //숫자의 아스키코드인 값('50')들을 실제 값(2)으로 바꾸어주기
                .sorted() //정렬
                .toArray(); //Stream to Array

        return answer;

        /*다른 분의 풀이*/
//        return Arrays.stream(my_string.replaceAll("[A-Z|a-z]", "").split("")) //숫자만 남긴 문자열 to Stream
//                .sorted() //정렬
//                .mapToInt(Integer::parseInt) //String to int
//                .toArray(); //배열로 만들기

    }
}