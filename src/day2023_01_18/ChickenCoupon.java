package day2023_01_18;

//치킨쿠폰
//문제 https://school.programmers.co.kr/learn/courses/30/lessons/120884
//블로그 https://qiwisil.tistory.com/42
public class ChickenCoupon {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(100));
    }
}

class Solution {
    public int solution(int chicken) {
        int answer = 0;

        while(chicken >= 10){ //쿠폰이 10개 이상 남았을때만
            answer += chicken / 10; //쿠폰 10개당 치킨 1개
            chicken += (chicken / 10) - (chicken / 10 * 10);
            //쿠폰으로 바꾼 치킨 받으면서 쿠폰도 한 장 받고
            //치킨 바꾸느라 쓴 쿠폰도 10장 단위로 빼주기
        }

        return answer;
    }
}