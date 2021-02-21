package com.example.study.week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/42891
public class Programmers_42891 {

    public static class Food {//음식 번호 , 먹는데 걸리는 시간
        int foodindex;
        int howlongtime;

        public Food(int foodindex, int howlongtime){
            this.foodindex= foodindex;
            this.howlongtime = howlongtime;
        }
    }
    //예를들어 {3,1,2} k=5
    public int solution(int[] food_times, long k) {
        int length = food_times.length;
        ArrayList<Food> foodList = new ArrayList<>();
        //음식의 번호, 먹는데걸리는시간 다 넣어주기
        for(int i = 0; i < length; i++){
            foodList.add(new Food(i+1,food_times[i]));
        }

        //먹는데 걸리는시간을 기준으로 오름차순
        //먹는데 걸리는 시간은 1,2,3이기 때문에 음식의번호는 2,3,1
        Collections.sort(foodList, Comparator.comparingInt(o -> o.howlongtime));

        int beforefoodtime = 0; //이전에 먹은 음식의 시간초기화
        int foodindex= 0 ; //음식번호

        //음식을 하나씩꺼냄
        for(Food food : foodList){
            //이전 음식과 차이계산식이 있는이유는 한싸이클을 돌았다면 그만큼 모든 인덱스의 값(먹는데걸리는시간을빼줘야함)
            long diff = food.howlongtime - beforefoodtime;
            long cycletime = diff * length; //제일작은수*길이 = 한 싸이클 다돌수있는지 없는지 확인하기위해
            
            if(k >= cycletime){  //k가 한싸이클보다 작을경우 list의 한싸이클을 돌 수 있음.
                k = k - cycletime; 
                beforefoodtime = food.howlongtime; //이전에 먹은 음식의 먹는시간 값 대입
            }else{ //한싸이클을 돌 수 없으면
                k = k % length; //나머지값을 이용하여 인덱스를 구해야함
                List<Food> sub = foodList.subList(foodindex, foodList.size()); //앞에서 다 끝난 인덱스빼고 리스트새로 생성
                Collections.sort(sub, Comparator.comparingInt(o -> o.foodindex)); // 인덱스기준으로 오름차순
                return sub.get((int)k).foodindex;
            }
            foodindex++;
            length--;
        }
        return -1;
    }
}
