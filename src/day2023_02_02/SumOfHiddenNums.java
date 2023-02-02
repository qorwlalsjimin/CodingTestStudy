package day2023_02_02;

import java.util.Arrays;
import java.util.stream.IntStream;

//숨어있는 숫자의 덧셈 (1)
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120851
// 블로그 https://qiwisil.tistory.com/56
public class SumOfHiddenNums {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("aAb1B2cC34oOp"));
    }
}

class Solution {
    public int solution(String my_string) {

//        //1> 반복문 [내가 푼 풀이]
//        int answer = 0;
//        for(char c : my_string.toCharArray())
//            if(c > '0' && c <= '9')answer += Character.getNumericValue(c);
////            if(c > '0' && c <='9') answer += c - '0';

//        //2> char형 IntStream [남의 풀이]
//        return my_string.chars() //IntStream 생성
//                .mapToObj(i -> (char) i) //데이터를 char형으로 변환
//                .filter(Character::isDigit) //숫자인 데이터만 남기기
//                .map(String::valueOf) //char to String
//                .mapToInt(Integer::valueOf) //String to int
//                .sum(); //모두 더하기

        //3> char형 IntStream [내 풀이]
        return my_string.chars() //intStream 생성
                .filter(Character::isDigit) //숫자인 데이터만 남기기
                .map(Character::getNumericValue) //char형 숫자(아스키코드)를 int형 숫자로
                .sum(); //모두 더하기
    }
}