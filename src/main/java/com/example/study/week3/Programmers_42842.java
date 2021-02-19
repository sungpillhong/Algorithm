package com.example.study.week3;

public class Programmers_42842 {
    //카펫
    //https://programmers.co.kr/learn/courses/30/lessons/42842
    public int[] solution(int brown, int yellow){
        int[] answer = new int[2];

        int width=0;
        int height=0;
        int total = brown + yellow;
        //brown+yellow = width*height
        //(2*width)+(2*height)-4 = brown
        //width+height = (brown+4)/2
        //yellow = (width*height)-brown
        int wplush = (brown+4)/2; //가로+세로

        if(brown < 8 || yellow < 1){ //예외처리
            return answer;
        }
        for(height=3; height <= total; height++ ){ //세로는 최소3부터시작
             width = wplush - height; //가로 = 가로+세로-세로

            if(height > width){ //세로가 가로보다 클경우는 안됨
                break;
            }
            // yellow 갯수가 맞고, 전체카펫수가 가로*세로가 맞으면
            if((width-2)*(height-2) == yellow && (width*height)==total){
                answer[0] = width;
                answer[1] = height;
                break;
            }
        }
        return answer;
    }
}
