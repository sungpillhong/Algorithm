package com.example.study.week8;

import java.util.Collections;
import java.util.PriorityQueue;

//https://programmers.co.kr/learn/courses/30/lessons/42628
public class Programmers_42628 {

    public int[] solution(String[] operations) {
        int[] answer = {0,0};
        PriorityQueue<Integer> minqueue = new PriorityQueue<>();
        PriorityQueue<Integer> maxqueue = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < operations.length; i++){

            String[] num = operations[i].split(" ");

            if(num[0].startsWith("I")){ //I로 시작하면 넣어주기 둘다
                minqueue.add(Integer.parseInt(num[1]));
                maxqueue.add(Integer.parseInt(num[1]));
            }else{

                if(minqueue.isEmpty() || maxqueue.isEmpty()){ //00인데 아직 돌릴게 남아있으면
                    continue;
                }

                if(Integer.parseInt(num[1]) == -1){ //최솟값 삭제
                    int min = minqueue.poll(); //최솟값하나꺼내서 삭제 둘다 제거안해주면 {I 16, D 1} 일때 0 16출력됨
                    minqueue.remove(min);
                    maxqueue.remove(min);
                }else{
                    int max = maxqueue.poll(); //최댓값 삭제
                    maxqueue.remove(max);
                    minqueue.remove(max);
                }
            }

        }

        if(maxqueue.isEmpty() || minqueue.isEmpty()){ //둘중하나라도 빈값이면 {0,0} 리턴해줘야함
            answer[0] = 0;
            answer[1] = 0;
        }else{
            answer[0] = maxqueue.poll();
            answer[1] = minqueue.poll();
        }

        return answer;
    }
}
