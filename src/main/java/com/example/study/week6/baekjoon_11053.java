package com.example.study.week6;

//https://www.acmicpc.net/problem/11053
public class baekjoon_11053 {

    public static void main(String[] args) {

        int[] arrint = new int[]{10, 20, 10, 20, 30, 20, 50, 70}; //배열
        int dp[] = new int[8]; //
        int max = 0;
        for(int i = 0; i < arrint.length; i++){ //0 1 2 3 4 5 인덱스
            dp[i] = 1; // 처음에 1주고 시작
            for(int j = 0; j < i; j++){ // j가 0부터 i가 될때 까지
                if(arrint[j] < arrint[i] && dp[j] >= dp[i]){ //현재위치의 인덱스의 값에서 이전의 지나온 인덱스의 값과 비교하여 클경우 dp 1씩증가
                    dp[i] = dp[j]+1;
                }
            }
        }
        for(int i : dp){
            max = Math.max(max, i); //제일 높은 숫자를 구함
        }
        System.out.println(max);
    }
}

