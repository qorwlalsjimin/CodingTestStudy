package day2023_02_05;

import java.util.Arrays;
import java.util.stream.IntStream;

//자릿수 더하기
//문제 https://school.programmers.co.kr/learn/courses/30/lessons/120906
//블로그
public class AddDigits {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(1234));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n/10 > 0){
            answer += n%10; //4 3 2
            n/=10; //123 12 1
        }
        answer += n%10;
        return answer;
    }
}