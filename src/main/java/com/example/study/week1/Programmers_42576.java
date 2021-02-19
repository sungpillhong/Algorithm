package com.example.study.week1;

import java.util.Arrays;

public class Programmers_42576 {
    //완주하지 못한 선수
    //https://programmers.co.kr/learn/courses/30/lessons/42576

    public static String solution(String[] participant, String[] completion) {

        Arrays.sort(participant);
        Arrays.sort(completion);

        String answer = null;
        int i = 0;
        while (i < completion.length) {
            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
                return answer;
            }
            i++;
        }
        return participant[i];

    }
}