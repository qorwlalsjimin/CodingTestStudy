package day2023_02_27;

import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TheCntOfK {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(1, 13, 1));
    }
}

class Solution {
    public int solution(int i, int j, int k) {
        List list = IntStream.range(i, j+1) //i부터 j까지 있는 숫자 스트림 형성
                        .mapToObj(m -> m+"") //정수형 데이터들을 문자열로 변환
                        .collect(Collectors.toList()); //Stream to List

        String str = String.join("", list); //List to String

        return str.length() - str.replace(String.valueOf(k), "").length(); //(문자열 길이) - (특정 문자를 뺀 문자열 길이) = (특정 문자 개수)
    }
}