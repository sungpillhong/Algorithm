package com.example.study;

import com.example.study.week4.LeetCode_maximumcoin;
import com.example.study.week4.LeetCode_removeoutermost;
import com.example.study.week5.Programmers_42747;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class SolutionApplication {

    public static void main(String[] args) {

        int[] citations = {11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11};
        int answer = 0;
        Programmers_42747 programmers_42747 = new Programmers_42747();
        System.out.println(programmers_42747.solution(citations));
    }

}
