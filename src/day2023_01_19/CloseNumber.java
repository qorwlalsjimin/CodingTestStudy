package day2023_01_19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
        for(int a : array){
            int abs = Math.abs(n-a); //n과의 차이
            if(min > abs) { //answer보다 작으면
                if((min==abs) && (answer<a)) //answer에 들어있는 값이랑 절대값이랑 같고 answer이 더 작으면
                    break; //멈춤
                answer = a;
                min = abs;
            }
        }
        return answer;
    }
}