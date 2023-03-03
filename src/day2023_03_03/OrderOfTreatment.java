package day2023_03_03;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//진료순서 정하기
// 문제 https://school.programmers.co.kr/learn/courses/30/lessons/120835
// 블로그
public class OrderOfTreatment {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = new int[]{3, 76, 24}; //3 1 2
        int[] answer = s.solution(arr);
        for(int i : answer)
            System.out.print(i+" ");
    }
}

/*
 * emer_copy_list를 정렬해서 3, 24, 76으로 만든다
 * 값으로 인덱스 값을 알기 위해서는 List로 변환해줘야한다. emer_list를 만들어준다
 * 내림차순 정렬을 해야하는데 그러려면 List(emer_copy_list)로 만들어야한다
 * reverse()로 내림차순 정렬을 해주면 76, 24, 3
 * emer_copy_list를 하나씩 반복하면서 answer[emer_list.indexOf(아이템)] = order++;
 */


class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        List emer_list = IntStream.of(emergency).boxed().collect(Collectors.toList()); //emergency List: 숫자 위치 알기 용도
        List emer_copy_list = IntStream.of(emergency).boxed().collect(Collectors.toList()); //emergency List: 숫자 정렬 용도

        Collections.sort(emer_copy_list); //오름차순 정렬 후
        Collections.reverse(emer_copy_list); //내림차순으로 바꿔주기

        int order = 1; //순서, 1부터 시작해서 증가될 예정
        for(Object e : emer_copy_list) //정렬했던 List의 foreach: e에는 우선순위가 높은 숫자부터 들어온다
            answer[emer_list.indexOf(e)] = order++; //정렬하지 않은 List를 이용해 원래 숫자의 index값을 알아내어 answer에 순서값을 넣어준다

        return answer;
    }
}