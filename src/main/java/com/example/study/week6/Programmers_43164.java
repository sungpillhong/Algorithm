package com.example.study.week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/43164
public class Programmers_43164 {

    static boolean ticketUse[]; //티켓을 사용했는지 안했는지 여부
    static List<String> list = new ArrayList<>();

    public String[] solution(String[][] tickets) {

        ticketUse = new boolean[tickets.length];

        dfs(tickets,"ICN","ICN",0); //ICN에서 출발하니깐

        Collections.sort(list); //정렬
        String[] answer = list.get(0).split(",");
        return answer;
    }

    public static void dfs(String[][] tickets, String startAirPort, String destinationAirPort, int cnt ) {
        if (cnt == tickets.length) { //다돌았으면 문자열을 list에 넣는다.
            list.add(destinationAirPort);
            return;
        }
        for (int i = 0; i < tickets.length; i++) {
            String startAirPort2 = tickets[i][0]; //출발공항
            String nextAirPort = tickets[i][1]; //출발공항의도착지
            if (startAirPort2.equals(startAirPort) && !ticketUse[i]) { //도착한 공항과 시작되는공항이 같고 티켓을 사용안했다면
                ticketUse[i] = true;
                dfs(tickets, nextAirPort, destinationAirPort + "," + nextAirPort, cnt+1);
                ticketUse[i] = false;
            }
        }
    }

}
