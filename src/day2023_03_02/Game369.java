package day2023_03_02;

import java.util.Arrays;

//369게임
//문제 https://school.programmers.co.kr/learn/courses/30/lessons/120891
public class Game369 {
    public static void main(String[] args) {
        Solution6 s = new Solution6();
        System.out.println(s.solution(29423));
    }
}

class Solution6 {
    public int solution(int order) {
        return (int) Arrays.stream(String.valueOf(order).split("")) //int to Stream
                .mapToInt(Integer::parseInt)
                .filter(m -> m==3||m==6||m==9) //3, 6, 9만 남기고
                .count(); //카운트
    }
}