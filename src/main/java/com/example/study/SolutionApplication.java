package com.example.study;

import com.example.study.week4.LeetCode_maximumcoin;
import com.example.study.week4.LeetCode_removeoutermost;
import com.example.study.week5.Programmers_42747;
import com.example.study.week5.Programmers_42891;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.sql.SQLOutput;

@SpringBootApplication
public class SolutionApplication {

    public static void main(String[] args) {

        int[] food_times = {6,5,4,3,1};
        long k = 10;
        Programmers_42891 programmers_42891 = new Programmers_42891();
        System.out.println(programmers_42891.solution(food_times, k));

    }
}
