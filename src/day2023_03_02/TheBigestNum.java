package day2023_03_02;

import java.util.Arrays;

public class TheBigestNum {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] arr = new int[]{1, 8, 3};
        int[] answer = s.solution(arr);
        for(int a : answer)
            System.out.print(a+" ");
    }
}

class Solution2 {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int[] array_copy = Arrays.copyOf(array, array.length);
        Arrays.sort(array_copy);
        answer[0] = array_copy[array.length-1];
        for(int i = 0; i<array.length; i++)
            if(array[i]==answer[0]) answer[1] = i;
        return answer;
    }
}