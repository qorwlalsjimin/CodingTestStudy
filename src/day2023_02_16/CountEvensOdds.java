package day2023_02_16;

import java.util.stream.IntStream;

//짝수 홀수 개수
// 문제
// 블로그
public class CountEvensOdds {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = new int[]{1,2,3,4,5};
        int[] answer;
        answer = s.solution(arr);

        for(int a : answer)
            System.out.print(a+" ");
    }
}

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        //1> IntStream을 이용한 풀이
        answer[0] = (int)IntStream.of(num_list).filter(i -> i%2==0).count();
        answer[1] = (int)IntStream.of(num_list).filter(i -> i%2==1).count();

        //2> 반복문을 이용한 풀이
        for(int i = 0; i<num_list.length; i++)
            answer[num_list[i] % 2]++;

        return answer;
    }
}