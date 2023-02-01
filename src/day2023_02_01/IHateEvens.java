package day2023_02_01;

import java.util.stream.IntStream;

//짝수는 싫어요
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120813
public class IHateEvens {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] answer = s.solution(10);
        for(int a : answer)
            System.out.print(a+" ");
    }
}

class Solution {
    public int[] solution(int n) {
        return IntStream.range(1, n+1).filter(i -> i%2==1).toArray();
    }
}