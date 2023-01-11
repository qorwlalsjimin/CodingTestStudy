package day2023_01_11;

//제곱수 판별하기
//문제 https://school.programmers.co.kr/learn/courses/30/lessons/120909
//블로그 https://qiwisil.tistory.com/37
public class DivSquareNum {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(144));
        System.out.println(s.solution(976));
        System.out.println(s.solution(1));
        System.out.println(s.solution(1000));
    }
}

class Solution2{
    public int solution(int n) {
//        int answer = 2;
//        //1> 반복문으로 풀기
//        for(int i = 1; i<=1000; i++)
//            if(i*i == n) answer = 1;
//        return answer;

        //2> Math.pow()메서드 이용해서 풀기
//        return (int)Math.pow( (int)Math.pow(n, 0.5) ,2)==n ? 1 : 2;

        //3> Math.sqrt()메서드 이용해서 풀기
        return n%Math.sqrt(n)==0 ? 1 : 2;
    }
}