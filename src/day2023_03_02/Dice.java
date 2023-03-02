package day2023_03_02;

//주사위의 개수
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120845
// 블로그 https://qiwisil.tistory.com/64
public class Dice {
}

class Solution4 {
    public int solution(int[] box, int n) {
        return (box[0]/n) * (box[1]/n) * (box[2]/n);
    }
}