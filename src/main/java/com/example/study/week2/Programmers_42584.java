package com.example.study.week2;

import java.util.LinkedList;
import java.util.Queue;

public class Programmers_42584 {

    // 주식 가격
    //https://programmers.co.kr/learn/courses/30/lessons/42584
    
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> queue = new LinkedList<>();
        //큐에 넣기
        for(int number : prices){
            queue.add(number);
        }
        while (!queue.isEmpty()){
            int value = queue.poll();
            int index = prices.length-queue.size(); //배열의 전체길이 - 큐의 사이즈 = 1,2,3,4,5증가
            for(int i = index; i < prices.length; i++){
                answer[index-1] ++; //0부터 시작하므로 -1
                if(value > prices[i]){ //큐에서 꺼낸값이 다음 배열안의 값보다 작으면 주식가격하락
                    break;
                }
            }
        }
        return answer;
    }
}
