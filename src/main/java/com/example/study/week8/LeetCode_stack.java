package com.example.study.week8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//https://leetcode.com/problems/decode-string/
public class LeetCode_stack {

    Pattern p = Pattern.compile("\\[[a-z]*\\]"); //영어단어만 추출

    public String decodeString(String s) {

        Matcher m = p.matcher(s);
        String sub = "";
        if(!m.find()){
            return s;
        }else{
            sub = m.group(); //첫번째 단어만
        }
        String content = sub.substring(1,sub.length()-1); //"[", "]" 제거

        String pattern ="\\d(?=\\["+content+"\\])"; //전방탐색 [content] 앞의 숫자를 가져올 수 있는 정규식
        Pattern numberCompile = Pattern.compile(pattern);
        Matcher numberMatcher = numberCompile.matcher(s);
        int count = 0 ;

        if(numberMatcher.find()){ 
            count = Integer.valueOf(numberMatcher.group()); //숫자를 가져옴
        }

        String instend = "";

        for(int i=0;i<count;i++){ //숫자만큼 반복해서 문자열생성
            instend += content;
        }

        return decodeString(s.replace(count+sub,instend)); // 숫자[content] 대신 문자열로 변경해서 재호출
    }
}
