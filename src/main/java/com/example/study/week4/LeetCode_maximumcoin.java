package com.example.study.week4;

import java.util.Arrays;

//https://leetcode.com/problems/maximum-number-of-coins-you-can-get/

public class LeetCode_maximumcoin {

    public int maxCoins(int[] piles) {
        int answer=0;
        Arrays.sort(piles); // 오름차순
        int len = piles.length; // 길이가 3의 배수임 ex) 15
        if(len %  3 == 0){ // 3으로 나눠떨어지냐? ex) true
            int mok = len / 3; // 몫은 ex) 5번인덱스 부터 시작하기위해 그럼bob은 끝
            for(int i = mok; i < len; i+=2){ // bob한테 다 주고 나와 alice만 남게되면 +2인덱스는 다내꺼
                answer += piles[i]; // 다 더해주면 끝
            }
        }
        return answer;
    }
}
