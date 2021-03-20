package com.example.study.week9;

import java.util.Collections;
import java.util.PriorityQueue;

//https://programmers.co.kr/learn/courses/30/lessons/12927
public class Programmers_12927 {

    public long solution(int n, int[] works){
        long answer = 0;

        PriorityQueue<Integer> Queue = new PriorityQueue<>(Collections.reverseOrder()); //내림차순정렬

        for(int i=0; i < works.length; i++){
            Queue.offer(works[i]); //큐에 담기
        }

        while (n != 0){
            int workTime = Queue.poll(); //하나씩꺼냄
            if( workTime == 0){
                break;
            }
            Queue.offer(workTime-1); //꺼냈으니까 -1해서 다시넣어줌
            n = n-1; // 일한 시간을 빼주기
        }
        for(int num : Queue){
            answer += Math.pow(num,2); //2제곱
        }
        return answer;
    }
}
