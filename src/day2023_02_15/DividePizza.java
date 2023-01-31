package day2023_02_15;

//피자 나눠 먹기(1)
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120814
// 블로그
public class DividePizza {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(7));
        System.out.println(s.solution(1));
        System.out.println(s.solution(15));

    }

}

class Solution {
    public int solution(int n) {
        //직접 푼 풀이
        int answer = (int)Math.ceil((double)n/7);

//        //다른 사람의 풀이
//        int answer = (n+6)/7;
        return answer;
    }
}