package day2023_01_17;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
//        char[] tempArr = my_string.toCharArray();
//        char temp = tempArr[num1];
//        tempArr[num1] = tempArr[num2];
//        tempArr[num2] = temp;
//        return String.valueOf(tempArr);

//        //2> substring() 메서드 이용
//        return my_string.substring(0, num1)+my_string.charAt(num2)+my_string.substring(num1+1, num2)+my_string.charAt(num1)+my_string.substring(num2, my_string.length());

        //3> Collections.swap 메서드 이용
        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList()); //문자열 to List
        Collections.swap(list, num1, num2); //swap
        return String.join("", list); //List to 문자열
    }
}