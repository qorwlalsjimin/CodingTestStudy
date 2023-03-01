package day2023_03_02;

//가위 바위 보
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120839
// 블로그
public class RockScissorsPaper {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("205"));
    }
}

class Solution {
    public String solution(String rsp) {
        String answer = "";
        //가위 2
        //바위 0
        //보 5

        for(char r : rsp.toCharArray()){
            switch(r){
                case '2':
                    answer += "0";
                    break;
                case '0':
                    answer += "5";
                    break;
                case '5':
                    answer += "2";
                    break;
            }
        }

        return answer;
    }
}