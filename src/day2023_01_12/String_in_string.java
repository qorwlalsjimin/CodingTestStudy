package day2023_01_12;

//문자열안에 문자열
//문제 https://school.programmers.co.kr/learn/courses/30/lessons/120908
//블로그 https://qiwisil.tistory.com/39
public class String_in_string {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
    }
}

class Solution {
    public int solution(String str1, String str2) {
        //1> contains 메서드로 간단하게 풀기
        return str1.contains(str2) ? 1 : 2;
    }
}