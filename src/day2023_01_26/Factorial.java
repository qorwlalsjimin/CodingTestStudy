package day2023_01_26;

import java.util.Arrays;
import java.util.stream.IntStream;

//팩토리얼
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120848
// 블로그
public class Factorial {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("*: "+s.solution(3628800));
        System.out.println("*: "+s.solution(7));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;

        //이중 반복문
//        int temp = 1; //팩토리얼 계산값
//        for(int i = 10; i>0; i--){
//            temp = 1; //반복 돌때마다 1로 되돌아감
//            for(int j = 1; j<=i; j++)
//                temp *= j; //팩토리얼 계산
//            if(temp <= n) { //계산된 값이 n보다 작거나 같으면
//                // cf) temp는 반복할수록 값이 작아진다. => temp가 n보다 작아졌을때가 포인트
//                answer = i; //answer에 i 넣고
//                break; //멈춘다
//            }
//        }

        return answer;
    }
}
