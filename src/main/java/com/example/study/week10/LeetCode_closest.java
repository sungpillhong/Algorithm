package com.example.study.week10;

public class LeetCode_closest {
//https://leetcode.com/problems/3sum-closest/
    public int threeSumClosest(int[] nums, int target) {

        if(target > nums.length-1){
            return 0;
        }
        int targetVal = nums[target];
        int threeSum = 0;

        if(nums.length < 3){
            return 0;
        }

        if(target == 0){
            for(int i = 0; i < 3; i++){
                threeSum += nums[i];
            }
        }else{
            threeSum = targetVal + nums[target-1]+nums[target+1];
        }
        return threeSum;
    }
}
