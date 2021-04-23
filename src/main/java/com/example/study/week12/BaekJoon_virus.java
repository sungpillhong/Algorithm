package com.example.study.week12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//https://www.acmicpc.net/problem/2606
public class BaekJoon_virus {

    public static ArrayList<Integer> list[];
    public static boolean visited[];
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int comCount = sc.nextInt(); //컴퓨터수
        int comConn = sc.nextInt(); //컴퓨터연결 수

        list = new ArrayList[comCount+1];
        visited = new boolean[comCount+1];

        for(int i = 1; i<comCount+1; i++){
            list[i] = new ArrayList<>();
        }

        for(int i = 1; i<comConn+1;i++){
            int first = sc.nextInt();
            int second = sc.nextInt();
            list[first].add(second);
            list[second].add(first);
        }
        dfs(1);

        System.out.println(count-1);
    }
    public static void dfs(int cur){

        if(visited[cur]){
            return;
        }

        visited[cur] = true;
        count++;
        for(int i : list[cur]){ //하나씩 방문하면서 true
            if(!visited[i]){
                dfs(i);
            }
        }
    }
}
