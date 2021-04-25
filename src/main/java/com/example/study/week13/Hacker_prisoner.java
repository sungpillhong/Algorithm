package com.example.study.week13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//https://www.hackerrank.com/challenges/save-the-prisoner/problem
public class Hacker_prisoner {
    //n: 수감자 수 ex)4
    //m: 과자의 수 ex)6
    //s: 간식을 전달하기 시작할 의자 번호 ex)2
    //일때 마지막 과자를 받은 수감자는 3번째 result=3 이되야함.
    public int saveThePrisoner(int n, int m, int s){
        int answer=m+s-1;
        // answer 값이 수감자의 수 랑같으면 바로당첨자가됨
        if(answer == n){
            return answer;
        }else{//그렇지않을 경우 나머지를 구하면 당첨자가 나옴
            answer = answer % n;
        }
        return answer;
    }
}
