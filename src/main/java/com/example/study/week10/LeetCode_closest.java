package com.example.study.week10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetCode_closest {
//https://leetcode.com/problems/3sum-closest/
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int length = nums.length;
        int threeSumVal = nums[0]+nums[1]+nums[length-1];

        for(int i = 0; i < length; i++){
            int start = i + 1;
            int end = length - 1;

            while(start < end){
                int sum = nums[i]+ nums[start]+ nums[end];
                if(sum == target){
                    return target;
                }else if(sum > target){
                    end--;
                }else{
                    start++;
                }
                if(Math.abs(target - sum) < Math.abs(target - threeSumVal)){
                    threeSumVal = sum;
                }
            }
        }

        return threeSumVal;
    }
}
