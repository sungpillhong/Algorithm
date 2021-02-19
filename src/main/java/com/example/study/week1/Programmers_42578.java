package com.example.study.week1;

import java.util.HashMap;
import java.util.Iterator;

public class Programmers_42578 {

    //위장
    //https://programmers.co.kr/learn/courses/30/lessons/42578
    public static int solution(String[][] clothes) {

        int answer = 1;
        HashMap<String, Integer> clothesMap = new HashMap<>();

        for(String[] clothe : clothes){

            if(clothesMap.containsKey(clothe[1])){
                clothesMap.put(clothe[1], clothesMap.get(clothe[1])+1);
            }else{
                clothesMap.put(clothe[1],1);
            }
        }

        Iterator<String> keys = clothesMap.keySet().iterator();
        while (keys.hasNext()){
            String key = keys.next();
            answer *=clothesMap.get(key)+1;
        }
        return answer-1;
    }
}
