package com.example.study.week4;

public class LeetCode_removeoutermost {

    public String removeOuterParentheses(String S) {
//        int count = 0; //카운트 초기화
//        StringBuilder sb = new StringBuilder(); //문자열 붙이기용
//        String[] stringArray;
//        stringArray = S.split(""); //배열로 일단 다자름
//
//        for(String i : stringArray){ //하나씩꺼냄
//
//            if(i.equals("(")){// ( 나오면 닫을준비해야되기 때문에 두번째 ( 나오면 세번째 ) 나오면
//                count++; // 카운트 1증가 카운트 2
//                if(count != 1){ // 시작하자마자 ( 나오면 그건 원시 ( 이기때문에 넘어감 두번쨰 ( 나오면 ( 하나붙임
//                    sb.append(i);
//                }
//            }
//            else{ // ) 나왔을때
//                count--;  // 카운트 1빼기
//                if(count != 0){ //그럼 count는 1이기때문에
//                    sb.append(i); // ) 하나 붙임 ()
//                }
//            }
//        }
//        return sb.toString();


        int count = 0;
        StringBuilder sb = new StringBuilder();
        String[] stringArray;
        stringArray = S.split(""); //배열로 일단 다자름

        for(String s : stringArray){

            if(s.equals("(") && count == 0){ //첫번째 괄호는 append 안하고 카운트만 더해줌
                count++;
            }
            else if(s.equals("(") && count >= 1){ //내부괄호는 append
                sb.append(s);
                count++;
            }
            else if(s.equals(")") && count > 1){ //내부괄호는 append
                sb.append(s);
                count--;
            }
            else if(s.equals(")") && count == 1){ //마지막 괄호는 append안하고 카운트만빼줌
                count--;
            }
        }
        return sb.toString();
    }
}
