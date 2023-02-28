package day2023_02_28;

import java.util.Arrays;

//한 번만 등장한 문자
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120896
// 블로그 https://qiwisil.tistory.com/59
public class OnlyOneChar {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("abcabcadc"));
        System.out.println(s.solution("hello"));
        System.out.println(s.solution("abdc"));
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";

        char[] copy_s = s.toCharArray(); //매개변수 문자열로 char 배열 만들기
        Arrays.sort(copy_s); //알파벳 정렬

        for(char c : copy_s) //알파벳 하나하나 돌면서
            if(s.length() - (s.replaceAll(String.valueOf(c), "")).length() == 1) answer += c+""; //특정 문자의 개수가 1이면 answer에 알파벳 추가

        return answer;

//        /*다른 분의 풀이*/
//        int[] alpha = new int[26]; //총 알파벳 개수만큼 배열 방 생성
//        for(char c : s.toCharArray()){
//            alpha[c - 'a']++; //아스키코드 값을 이용해 고유의 방 위치 지정, 알파벳 개수 카운트
//        }
//
//        StringBuilder answer = new StringBuilder(); //문자열 수정을 위해 StringBuilder 생성 (String보다 효율 좋음)
//        for(int i = 0; i < 26; i++){ //총 알파벳 개수만큼 반복
//            if(alpha[i] == 1){ //1 카운트인 알파벳만
//                answer.append((char)(i + 'a')); //다시 'a'를 더해 answer에 더해준다
//            }
//        }
//        return answer.toString(); //StringBuilder to String
    }
}