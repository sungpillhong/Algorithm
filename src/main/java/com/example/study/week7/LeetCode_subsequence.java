package com.example.study.week7;


//https://leetcode.com/problems/is-subsequence/
public class LeetCode_subsequence {

    public boolean isSubsequence(String s, String t) {
        int sindex=0;
        int tindex=0;

        if(s.length() == 0){ //s가 ""이면 무조건 true
            return true;
        }

        while (sindex < s.length() && tindex < t.length()){

            if(s.charAt(sindex) != t.charAt(tindex)){ //같지않으면 t의 인덱스만++해서 다시비교
                tindex++;
                continue;
            } //같으면 s인덱스와 t인덱스 1씩증가시켜서 비교
            sindex++;
            tindex++;
            if(sindex == s.length()){ //s인덱스 == s길이 이면 다포함이므로 true
                return true;
            }
        }
        return false;
    }
}
