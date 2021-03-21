package com.example.study.week9;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class LeetCode_verically {

    public List<String> printVertically(String s){

        ArrayList<String> vertically = new ArrayList<>();

        String verticalArr[] = s.split(" "); //공백으로 잘라서 배열에 담기
        int arrSize = verticalArr.length; // 배열의 길이
        int maxSize = verticalArr[0].length(); // 어떻게 보면 초기화 (vertically list를 몇개 생성할지)

        for(String word : verticalArr){
            if(word.length() > maxSize){ //초기화된 maxSize보다 큰게나오면 그값을 셋팅
                maxSize = word.length();
            }
        }

        for(int i = 0; i < maxSize; i++){ //vertically List 수만큼
            String verticalWord = "";

            for(int j = 0 ; j < arrSize; j++){ //세로로 이어붙일때 배열의길이만큼 for문
                String oneWord = verticalArr[j]; //하나의 단어를 가져와서
                if(oneWord.length() > i){
                    verticalWord += oneWord.charAt(i); //붙이기
                }else{
                    verticalWord += " ";
                }
            }
            vertically.add(verticalWord.stripTrailing()); //stripTrailing 뒤에 붙는 공백제거 (자바11버전에 추가됨)
        }
        return vertically;
    }

}
