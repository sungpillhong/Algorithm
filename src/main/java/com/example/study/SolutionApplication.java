package com.example.study;

import com.example.study.week4.LeetCode_maximumcoin;
import com.example.study.week4.LeetCode_removeoutermost;
import com.example.study.week5.Programmers_42747;
import com.example.study.week5.Programmers_42891;
import com.example.study.week6.Programmers_43164;
import com.example.study.week7.LeetCode_binarysearch;
import com.example.study.week7.LeetCode_subsequence;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SpringBootApplication
public class SolutionApplication {

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

        LeetCode_subsequence leetCode_subsequence = new LeetCode_subsequence();
        System.out.println(leetCode_subsequence.isSubsequence(s,t));
    }
}
