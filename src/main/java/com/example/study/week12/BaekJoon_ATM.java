package com.example.study.week12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://www.acmicpc.net/problem/11399
public class BaekJoon_ATM {
    public int atm(int[] waitPerson) {
        int beforeSum = 0;
        int totalSum = 0;

        Arrays.sort(waitPerson);

        for(int i = 0; i < waitPerson.length; i++){
            totalSum += beforeSum + waitPerson[i];
            beforeSum += waitPerson[i];
        }
        return totalSum;
    }
}
