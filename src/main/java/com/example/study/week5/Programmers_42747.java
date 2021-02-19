package com.example.study.week5;


import java.util.Arrays;
import java.util.Collections;

//https://programmers.co.kr/learn/courses/30/lessons/42747
public class Programmers_42747 {

    public int solution(int[] citations) {
        int answer = 0;
        int citationsCnt = citations.length;
        //Integer타입 배열로 변경해 주어야 내림차순가능..
        Integer[] citationsSortd = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(citationsSortd, Collections.reverseOrder());
        //6,5,3,1,0 일때 인덱스는 1 2 3 4 5로 비교하여
        for(int i = 0; i < citationsCnt; i++){ //0 1 2 3 4 ...
            //i+1인 이유는 인덱스는 0부터 시작이기 때문에 1부터시작해서 배열안에 값을
            //비교하다가 인덱스+1이 정렬된 값 보다 클경우 그게 최대값이기 때문에 거기까지의 갯수를 구함!
            if(citationsSortd[i] < i+1){
                answer = i; //그럼 i가 됌.
                break;
            }
            if(i == citationsCnt-1){ //i는 0부터 시작하기 때문에 길이에서 -1
                answer = i+1; //갯수를 구해야하기 때문에 index+1
            }
        }
        return answer;
    }
}
