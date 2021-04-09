package com.example.study.week11;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/gray-code/
public class LeetCode_graycode {
    public List<Integer> grayCode(int n) {
        List<Integer> gray = new ArrayList<>();
        gray.add(0); //초기화

        if(n == 0){
            return gray;
        }else if(n == 1){
            gray.add(1);
            return gray;
        }
        else{ //n이 2이상일때
            int grayCode = 1 << n-1; //시프트연산자로 n-1만큼 왼쪽으로 이동 즉 2의제곱승
            gray = grayCode(n-1);
            for(int i = gray.size()-1; i >=0; i--){
                gray.add(grayCode+gray.get(i));
            }
            return gray;
        }
    }
}
