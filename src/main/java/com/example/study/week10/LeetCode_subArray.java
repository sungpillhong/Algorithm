package com.example.study.week10;

public class LeetCode_subArray {
//https://leetcode.com/problems/maximum-subarray/
    public int maxSubArray(int[] nums) {

        int length = nums.length;
        int maxvalue = nums[0]; //처음값 기준 초기화

        for (int i = 0; i < length; i++) {
            int startvalue = 0;
            //순차적으로 더하면서 최대값 저장
            for (int j = i; j < length; j++) {
                startvalue += nums[j];
                maxvalue = (maxvalue >= startvalue) ? maxvalue : startvalue; //maxvalue 갱신
            }
        }
        return maxvalue;
    }

}
