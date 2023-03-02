package day2023_03_01;

//공던지기
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120843
// 블로그 https://qiwisil.tistory.com/60
public class CastBall {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = new int[]{1, 2, 3}; //({1, 2, 3}, 3) 2
        System.out.println(s.solution(arr, 3)); //3
    }
}

class Solution {
    public int solution(int[] numbers, int k) {
        return numbers[(k-1)*2 % numbers.length];
    }
}