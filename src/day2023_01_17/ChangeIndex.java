package day2023_01_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//인덱스 바꾸기
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120895
// 블로그 https://qiwisil.tistory.com/43
public class ChangeIndex {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("hello", 1, 2)); // h e l l o
        System.out.println(s.solution("I love you", 3, 6)); // I love you => I l veoyou

    }
}

class Solution {
    public String solution(String my_string, int num1, int num2) {
//        //1> char 배열 이용
//        char[] tempArr = my_string.toCharArray(); //문자열 to char[]
//
//        //swap
//        char temp = tempArr[num1];
//        tempArr[num1] = tempArr[num2];
//        tempArr[num2] = temp;
//
//        return String.valueOf(tempArr); //char[] to 문자열



//        //2> substring() 메서드 이용
//        return my_string.substring(0, num1)                     //num1 전까지
//                +my_string.charAt(num2)                         //num2에 해당하는 문자
//                +my_string.substring(num1+1, num2)              //num1 다음부터 ~ num2전까지
//                +my_string.charAt(num1)                         //num1에 해당하는 문자
//                +my_string.substring(num2, my_string.length()); //num2 다음부터 ~ 끝까지


        //3> Collections.swap 메서드 이용
        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList()); //문자열 to List
        Collections.swap(list, num1, num2); //swap
        return String.join("", list); //List to 문자열
    }
}