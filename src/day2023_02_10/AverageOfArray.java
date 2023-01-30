package day2023_02_10;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AverageOfArray {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(s.solution(arr));
    }
}


class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        answer = IntStream.of(numbers).sum() / (float)numbers.length;
        return answer;
    }
}