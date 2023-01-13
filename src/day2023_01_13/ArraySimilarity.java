package day2023_01_13;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//배열의 유사도
//문제 https://school.programmers.co.kr/learn/courses/30/lessons/120903
//블로그 https://qiwisil.tistory.com/41
public class ArraySimilarity {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] s1 = new String[]{"n", "omg"};
        String[] s2 = new String[]{"m", "dot"};
        System.out.println(s.solution(s1, s2));
    }
}

class Solution {
    public int solution(String[] s1, String[] s2) {
//        //1> 반복문
//        int answer = 0;
//        List<String> s2List = Arrays.stream(s2).collect(Collectors.toList());
//
//        for(String s : s1)
//            if(s2List.contains(s)) answer++;
//        return answer;

        //2> HashSet
        HashSet<String> set = new HashSet<>(Arrays.asList(s1)); //s1 배열로 해시셋 생성
        return (int)Arrays.stream(s2) //s2 배열로 Stream 생성
                .filter(set::contains) //s2 데이터들 중 해시셋에 포함된 것만 남긴다
                .count(); //필터링된 데이터들의 개수 카운팅
    }
}
