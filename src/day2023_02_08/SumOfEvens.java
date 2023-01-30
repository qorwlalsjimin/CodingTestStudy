package day2023_02_08;

import java.util.stream.IntStream;

//짝수의 합
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120831
// 블로그 https://qiwisil.tistory.com/46
public class SumOfEvens {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(10));
    }
}

class Solution {
    public int solution(int n) {
        return IntStream.range(2, n+1) //짝수의 시작인 2부터 n까지 스트림 생성
                .filter(i -> i%2==0) //짝수만 남도록 필터링
                .sum(); //남은 데이터들의 총합
    }
}