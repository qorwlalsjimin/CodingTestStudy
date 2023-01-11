//제곱수 판별하기 https://school.programmers.co.kr/learn/courses/30/lessons/120909
public class DivSquareNum {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
//        System.out.println(s.solution(144));
//        System.out.println(s.solution(976));
//        System.out.println(s.solution(1));
        System.out.println(s.solution(1000));
    }
}

class Solution2{
    public int solution(int n) {
        int answer = 2;
        //1> 반복문으로 풀기
        for(int i = 1; i<=1000; i++)
            if(i*i == n) answer = 1;
        return answer;


    }
}