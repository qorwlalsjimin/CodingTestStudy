package day2023_02_17;

import java.util.Arrays;

//배열 원소의 길이
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120854
// 블로그
public class LengthOfArray {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] str = new String[]{"We", "are", "the", "world!"};
        int[] answer = s.solution(str);
        for(int a : answer)
            System.out.print(a+" ");
    }
}

class Solution {
    public int[] solution(String[] strlist) {
//        int[] answer = new int[strlist.length];
//
//        for(int i = 0; i<strlist.length; i++)
//            answer[i] = strlist[i].length();
//
//        return answer;

        return Arrays.stream(strlist) //문자열 배열로 Stream 생성
                .mapToInt(String::length) //int형으로 형변환, String 클래스의 length() 메서드
                .toArray(); //배열로 바꾸기
    }
}