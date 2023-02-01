package day2023_02_02;

public class SumOfHiddenNums {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("aAb1B2cC34oOp"));
    }
}

class Solution {
    public int solution(String my_string) {

        //1> 반복문 [내가 푼 풀이]
        int answer = 0;
        for(char c : my_string.toCharArray())
            if(c > '0' && c <= '9')answer += Character.getNumericValue(c);
//            if(c > '0' && c <='9') answer += c - '0';

        return answer;
    }
}