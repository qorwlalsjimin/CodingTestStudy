import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//문자열 정렬하기(2) https://school.programmers.co.kr/learn/courses/30/lessons/120911
public class SortString {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("Bcad"));
    }
}

class Solution {
    public String solution(String my_string) {
        char[] chars = my_string.toLowerCase().toCharArray();
        Arrays.sort(chars);
        String answer = new String(chars);
        return answer;
    }
}
