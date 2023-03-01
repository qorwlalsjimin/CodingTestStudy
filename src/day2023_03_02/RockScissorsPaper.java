package day2023_03_02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//가위 바위 보
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120839
// 블로그
public class RockScissorsPaper {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("205"));
    }
}

//가위 2
//바위 0
//보 5
class Solution {
    public String solution(String rsp) {

        /*Stream*/
        return Arrays.stream(rsp.split("")) //문자열로 Stream 생성
                .map(m -> m.equals("2") ? "0" : m.equals("0") ? "5" : "2") //2이면 0, 0이면 5고 아니면 2
                .collect(Collectors.joining()); //Stream to String

        /*switch문*/
//        String answer = "";
//        for(char r : rsp.toCharArray()){
//            switch(r){
//                case '2':
//                    answer += "0";
//                    break;
//                case '0':
//                    answer += "5";
//                    break;
//                case '5':
//                    answer += "2";
//                    break;
//            }
//        }
//
//        return answer;
    }
}