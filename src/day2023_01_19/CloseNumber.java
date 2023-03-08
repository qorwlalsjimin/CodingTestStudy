package day2023_01_19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//가까운 수
// https://school.programmers.co.kr/learn/courses/30/lessons/120890
// 블로그 https://qiwisil.tistory.com/67
public class CloseNumber {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = new int[]{1, 1, 1};
        System.out.println("*"+s.solution(arr, 1));
    }
}

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 100; //원소의 최솟값: 1, n의 최댓값: 100 => 나올 수 있는 차의 최댓값: 99

        Arrays.sort(array); //정렬 안 되어있는 array도 있음

        for(int a : array){ //array 요소 하나씩 보기
            int abs = Math.abs(n-a); //n과의 차이 구하기
            if(min > abs) { //차이가 min보다 작을때 => 절댓값
                if((min==abs) && (answer<a)) //min에 들어있는 값이랑 절댓값이랑 같고 answer이 더 작으면
                    break; //멈춤
                answer = a; //정답이 아니라서 못멈추면 answer에 a를 넣고
                min = abs; //min에 절댓값를 넣어준다
            }
        }
        return answer;
    }
}