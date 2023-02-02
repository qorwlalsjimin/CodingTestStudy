package day2023_02_02;

//세균 증식
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120910
// 블로그 https://qiwisil.tistory.com/57
public class GrowBacterial {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(7, 4));
    }
}

class Solution2 {
    public int solution(int n, int t) {
        //1> 반복문으로 풀기
        int answer = n;
        for(int i = 0; i<t; i++)
            answer *=2;
        return answer;

        //2> 제곱 메서드로 풀기
//        return (int)Math.pow(2, t)*n;
    }
}