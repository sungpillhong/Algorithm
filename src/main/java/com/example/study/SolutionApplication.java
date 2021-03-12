package com.example.study;

import com.example.study.week4.LeetCode_maximumcoin;
import com.example.study.week4.LeetCode_removeoutermost;
import com.example.study.week5.Programmers_42747;
import com.example.study.week5.Programmers_42891;
import com.example.study.week6.Programmers_43164;
import com.example.study.week7.LeetCode_binarysearch;
import com.example.study.week7.LeetCode_subsequence;
import com.example.study.week8.Programmers_42628;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SpringBootApplication
public class SolutionApplication {

    public static void main(String[] args) {
        String[] operations = {"I 4", "I 3", "I 2", "I 1", "D 1", "D 1", "D -1", "D -1","D -1","I 5", "I 6"};
        int[] answer= {};
        Programmers_42628 programmers_42628 = new Programmers_42628();
        answer = programmers_42628.solution(operations);

        for(int i = 0; i < answer.length; i++){
            System.out.println(answer[i]);
        }
    }
}
