package day2023_01_30;

import java.time.LocalDate;

//나이 출력
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120820
public class PrintAge {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(43);
    }
}

class Solution {
    public int solution(int age) {
        LocalDate today = LocalDate.now();
        return today.getYear() - age + 1;
        //return LocalDate.now().getYear() - age + 1;
        //* 문제에서는 2022년이 기준이지만, 공부를 위해 메서드 사용

//        //내 풀이
//        return 2022-age+1;
    }
}