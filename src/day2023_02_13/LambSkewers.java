package day2023_02_13;

//양꼬치
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120830
// 블로그
public class LambSkewers {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(10, 3));
    }
}

class Solution {
    public int solution(int n, int k) {
        //1인분 12,000
        //음료수 2,000
        int answer = 0;
        answer = n*12000 + (k - n/10)*2000; //양꼬치 총액 + 서비스로 받은 음료수 제외하고 음료수 총액
        return answer;
    }
}