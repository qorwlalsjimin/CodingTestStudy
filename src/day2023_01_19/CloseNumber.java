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

//        원소 하나씩 다 돌면서
//        n-원소의 절댓값을 만드시오! //abs
//        그리고 절댓값의 최소값을 찾아...
//
//        여기서 주의할 점은!
//        만약에 answer에 들어있는 값이랑 원소랑 절댓값이 똑같다면
//        answer이랑 원소랑 크기 비교를 해서 원소가 더 크면 넣으면 안 되유
//
//        최소값을 만드는 원소를 answer에 넣어주세용