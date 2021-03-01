package com.example.study;

import com.example.study.week4.LeetCode_maximumcoin;
import com.example.study.week4.LeetCode_removeoutermost;
import com.example.study.week5.Programmers_42747;
import com.example.study.week5.Programmers_42891;
import com.example.study.week6.Programmers_43164;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.sql.SQLOutput;

@SpringBootApplication
public class SolutionApplication {

    public static void main(String[] args) {

        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}};
        Programmers_43164 programmers_43164 = new Programmers_43164();
        System.out.println(programmers_43164.solution(tickets));
        //ICN, JFK, HND, IAD

    }
}
