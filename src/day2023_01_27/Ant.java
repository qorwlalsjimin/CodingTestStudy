package day2023_01_27;

//개미군단
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120837
// 블로그
public class Ant {
    public static void main(String[] args) {
        Solution s = new Solution();
//        System.out.println(s.solution(23));
//        System.out.println(s.solution(24));
        System.out.println(s.solution(999));
    }
}

class Solution {
    public int solution(int hp) {
        int answer = 0;

        answer += hp/5;
        hp %= 5;

        answer += hp/3;
        hp %= 3;

        answer += hp;

        return answer;
    }
}