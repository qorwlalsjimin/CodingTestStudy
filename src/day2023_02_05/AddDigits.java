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
//        //1> 반복문
//        int answer = 0;
//        while(n > 0){
//            answer += n%10; //4 3 2
//            n/=10; //123 12 1
//        }
//        return answer;

        //2> Stream
        return Arrays.stream(
                String.valueOf(n) //String의 값이 된 n을
                        .split("") //하나하나씩 나누어서 Stream을 만든다
            )
                .mapToInt(Integer::parseInt)//Stream의 데이터들을 다시 int로 바꾸고
                .sum(); //모두 더해준다
    }
}