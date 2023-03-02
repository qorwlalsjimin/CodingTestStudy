package day2023_03_02;

import java.util.Arrays;
import java.util.stream.IntStream;

//369게임
public class Game369 {
    public static void main(String[] args) {
        Solution6 s = new Solution6();
        System.out.println(s.solution(29423));
    }
}

class Solution6 {
    public int solution(int order) {
        return (int) Arrays.stream((order+"").split("")) //int to Stream
                .filter(m -> m.equals("3")||m.equals("6")||m.equals("9")) //3, 6, 9만 남기고
                .count(); //카운트
    }
}