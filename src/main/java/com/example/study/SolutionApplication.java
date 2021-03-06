package com.example.study;

import com.example.study.week4.LeetCode_maximumcoin;
import com.example.study.week4.LeetCode_removeoutermost;
import com.example.study.week5.Programmers_42747;
import com.example.study.week5.Programmers_42891;
import com.example.study.week6.Programmers_43164;
import com.example.study.week7.LeetCode_binarysearch;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SpringBootApplication
public class SolutionApplication {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int target = 10;
        LeetCode_binarysearch leetCode_binarysearch = new LeetCode_binarysearch();
        System.out.println(leetCode_binarysearch.search(nums,target));
    }
}
