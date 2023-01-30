package day2023_02_14;

import java.util.Arrays;
import java.util.stream.IntStream;

//배열 뒤집기
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120821
// 블로그
public class ReverseArray {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] answer = s.solution(arr);
        for(int a : answer)
            System.out.print(a+" ");
    }
}

class Solution {
    public int[] solution(int[] num_list) {
        //1> 반복문으로 풀기
        int[] answer = new int[num_list.length];
        for(int i = 0, j = num_list.length-1; i<num_list.length; i++)
            answer[i] = num_list[j--];
        return answer;
    }
}