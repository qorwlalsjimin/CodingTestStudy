package day2023_02_01;

import java.util.Arrays;
import java.util.stream.IntStream;

//삼각형의 완성조건 (1)
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120889
// 블로그 https://qiwisil.tistory.com/55
public class ConditionOfTriangle {
    public static void main(String[] args) {
        int[] arr = new int[]{3,3,2};
        Solution3 s = new Solution3();
        System.out.println(s.solution(arr));
    }
}

class Solution3 {
    public int solution(int[] sides) {
//        //1> IntStream의 max()와 sum() [나의 풀이]
//        int max = IntStream.of(sides) //sides로 IntStream 생성
//                .max() //최댓값 구하기
//                .getAsInt(); //optionalInt를 int형으로 반환
//        int sum = IntStream.of(sides) //sides로 IntStream 생성
//                .sum() //배열 원소들의 총합 구하기
//                -max; //max 빼주기
//
//        return (sum>max) ? 1 : 2; //sum이 max보다 클때만 1, 아니면 2반환


        //2> Arrays.sort() [힌트를 얻어서 푼 풀이]
        Arrays.sort(sides); //배열 원소들 오름차순 정렬
        return sides[0]+sides[1]>sides[2] ? 1 : 2; //첫번째와 두번째 원소의 합이 세번째 원소(제일 큼)보다 클때만 1, 아니면 2반환
    }
}
