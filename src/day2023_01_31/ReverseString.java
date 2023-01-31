package day2023_01_31;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//문자열 뒤집기
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120822
// 블로그
public class ReverseString {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("jaron"));
    }
}

class Solution {
    public String solution(String my_string) {

//        //1> Stream 풀이
//        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());
//        Collections.reverse(list);
//        return String.join("", list);

        //2> StringBuilder 풀이
        StringBuilder stringBuilder = new StringBuilder(my_string);
        stringBuilder.reverse();
        return stringBuilder.toString();

/*
*   ▶️StringBuilder와 StringBuffer란?
*   String은 값 변경이 불가능하다
*   concat()이나 + 연산자로 값을 붙일 수 있지만 실제로는 기존 값을 버리고 새로 값을 할당하는 원리이다
*   그래서 StringBuilder와 StringBuffer은 concat()이나 + 연산자를 안 쓰려고 사용하는 것이다
*       ㄴcontcat()이나 +를 1000번 이상하면 속도가 매우 느려진다
*
*
*   ▶️StringBuilder 대 StringBuffer
*   StringBuffer는 멀티 스레드 환경에서 사용하는 것이 안전하다
*   공통 메서드가 동기화되기 때문이고, 값이 예상치 못하게 변경되는 것을 방지해준다
*
*   그 외는 StringBuilder의 성능이 더 뛰어나기 때문에
*   StringBuilder를 사용해주면 된다
*
*   🚩출처: https://wakestand.tistory.com/245
*/

    }
}