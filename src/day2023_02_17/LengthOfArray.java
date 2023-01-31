package day2023_02_17;

//배열 원소의 길이
// 문제
// 블로그
public class LengthOfArray {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] str = new String[]{"We", "are", "the", "world!"};
        int[] answer = s.solution(str);
        for(int a : answer)
            System.out.print(a+" ");
    }
}

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for(int i = 0; i<strlist.length; i++)
            answer[i] = strlist[i].length();

        return answer;
    }
}