package com.example.study.week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/43164
public class Programmers_43164 {

    static boolean visited[]; //티켓을 사용했는지 안했는지 여부
    static List<String> list = new ArrayList<>();

    public String[] solution(String[][] tickets) {

        visited = new boolean[tickets.length];

        for(int i = 0 ; i < tickets.length; i++) {
            String from = tickets[i][0]; //출발
            String to = tickets[i][1]; //도착
            if(from.equals("ICN")) { //인천이 시작일때
                visited[i] = true; //첫 티켓사용

                dfs(tickets,from + ",", to, 1);
                visited[i] = false;
            }
        }
        Collections.sort(list); //정렬
        String[] answer = list.get(0).split(",");
        return answer;
    }
    // ["ICN", "COO", "ICN", "BOO", "DOO"]
    public static void dfs(String[][] tickets, String route, String end, int cnt ) {
        if (cnt == tickets.length) { //다돌았으면 문자열을 list에 넣는다.
            list.add(route + end);
            return;
        }
        for (int i = 0; i < tickets.length; i++) {
            String from = tickets[i][0]; //출발
            String to = tickets[i][1]; //도착
            if (end.equals(from) && !visited[i]) { //도착한 공항과 시작되는공항이 같고 방문하지않았으면
                visited[i] = true;
                cnt++;
                dfs(tickets, route + end + ",", to, cnt); //갱신하면서 재귀
                visited[i] = false;
            }
        }
    }

}
