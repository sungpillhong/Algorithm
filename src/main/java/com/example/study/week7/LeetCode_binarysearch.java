package com.example.study.week7;

import java.util.Arrays;

//https://leetcode.com/problems/binary-search/

public class LeetCode_binarysearch {


//    public int search(int[] nums, int target) {
//        int index = -1;
//
//        for(int i = 0; i < nums.length; i++){
//            if(nums[i] == target){
//                index = i;
//            }
//        }
//
//        return index;
//    }

    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return mid;
            } if(nums[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
