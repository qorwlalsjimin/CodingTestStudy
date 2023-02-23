package day2023_02_22;

import java.util.stream.IntStream;

//구슬을 나누는 경우의 수
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120840
public class DivideMarble {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(5,3));
    }
}

class Solution {
    public int solution(int balls, int share) {

        int n=1, n_m=1, m=1;

        //1> 반복문으로 풀기
        for(int i = 1; i<=balls; i++) n *= i;
        for(int i = 1; i<=share; i++) m *= i;
        for(int i = 1; i<=balls-share; i++) n_m *= i;

        System.out.println(n);
        System.out.println(n_m);
        System.out.println(m);

        return n/(n_m*m);
    }
}