package com.example.study.week3;

import java.util.PriorityQueue;

public class Programmers_42626 {

    //더 맵게
    //https://programmers.co.kr/learn/courses/30/lessons/42626
    public int solution(int[] scoville, int k){
        int count =0 ;
        PriorityQueue<Integer> q = new PriorityQueue<>(); //우선순위 큐

        for(int i =0; i < scoville.length; i++){
            q.add(scoville[i]);
        }

        while (true){
            //만약 q안에 스코빌지수보다 크면 더이상 계산을 안해도 되므로 break
            if(q.peek() >= k){
                break;
            }
            else if(q.size() == 1) { //1개는 계산x
                return -1;
            }else{
                q.add(q.poll() + (q.poll()*2)); //새로운 요리
                count++;
            }
        }
        return count;
    }

}
