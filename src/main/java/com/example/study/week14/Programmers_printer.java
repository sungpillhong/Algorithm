package com.example.study.week14;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/42587
public class Programmers_printer {

    public int solution(int[] priorities, int location) {
        int answer = 1; //1번부터시작
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder()); //내림차순정렬

        for (int i = 0; i < priorities.length; i++) {
            q.add(priorities[i]); //q에 하나씩넣어준다.
        }

        while (!q.isEmpty()) {
           for(int i = 0 ; i < priorities.length; i++){
               if(priorities[i] == q.peek()){ //큐에서꺼낸값이랑
                   if(i == location){//인덱스번호랑 위치랑같으면 순서를 return
                       return answer;
                   }
                   q.poll();
                   answer++;//같지않으면 1씩증가
               }
           }
        }
        return answer;
    }
}
