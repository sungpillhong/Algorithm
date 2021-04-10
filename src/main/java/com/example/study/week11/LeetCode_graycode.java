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
        /**
         * n이 3일경우
         * 000 000
         * 001 001
         *
         * 011 010+001
         * 010 010+000
         *
         * 110 100+010
         * 111 100+011
         * 101 100+001
         * 100 100+000
         */
        else{ //n이 2이상일때
            int firstGrayCode = 1 << n-1; //시프트연산자로 n-1만큼 왼쪽으로 이동. 즉, 2의제곱승
            gray = grayCode(n-1); //
            for(int i = gray.size()-1; i >=0; i--){
                gray.add(firstGrayCode+gray.get(i)); //firstGrayCode값 뒤로 이전의 grayList에있는값들을 더해서 넣어준다.
            }
            return gray;
        }
    }
}
