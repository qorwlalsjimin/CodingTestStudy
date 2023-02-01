package day2023_02_01;

import java.util.stream.IntStream;

//삼각형의 완성조건 (1)
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120889
// 블로그
public class ConditionOfTriangle {
    public static void main(String[] args) {
        int[] arr = new int[]{3,3,2};
        Solution3 s = new Solution3();
        System.out.println(s.solution(arr));
    }
}

class Solution3 {
    public int solution(int[] sides) {
        //1> IntStream의 max()와 sum()
        int max = IntStream.of(sides) //sides로 IntStream 생성
                .max() //최댓값 구하기
                .getAsInt(); //optionalInt를 int형으로 반환
        int sum = IntStream.of(sides) //sides로 IntStream 생성
                .sum() //배열 원소들의 총합 구하기
                -max; //max 빼주기

        return (max<sum) ? 1 : 2; //sum이 max보다 클때만 1, 아니면 2반환
    }
}
