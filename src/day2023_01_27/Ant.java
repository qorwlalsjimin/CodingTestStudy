package day2023_01_27;

//개미군단
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120837
// 블로그 https://qiwisil.tistory.com/61
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
        int answer = hp/5;

        hp %= 5;

        answer += hp/3;
        hp %= 3;

        answer += hp;

        return answer;

        /*다른 분의 풀이*/
        //return (hp/5) + ((hp%5) / 3) + ((hp%5) % 3);
        //return (장군개미) + (병정개미) + (일개미)
        //return (5로 나눈 몫) + ((장군개미 빼고 남은 개미수)/3) + (5로 나눈 나머지로 3을 나눠서 남은 나머지, /1해도 안 해도 같은 결과)
    }
}