package day2023_02_01;

import java.util.Arrays;

//배열 자르기
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120833
// 블로그 https://qiwisil.tistory.com/54
public class SliceArray {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        Solution2 s = new Solution2();
        int[] answer = s.solution(numbers, 1, 3);
        for(int a : answer)
            System.out.print(a+" ");
    }
}

class Solution2 {
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2+1);
    }
}