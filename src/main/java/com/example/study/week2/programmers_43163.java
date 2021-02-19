package com.example.study.week2;

import java.util.LinkedList;
import java.util.Queue;

class Programmers_43163 {

    //단어 변환
    //https://programmers.co.kr/learn/courses/30/lessons/43163

    class Node{ //노드 생성 (현재단어, 읽은 수)
        String word;
        int count;

        Node(String word, int count){
            this.word = word;
            this.count = count;
        }
    }

    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        int len = words.length;

        Queue<Node> queue = new LinkedList<>();
        boolean[] visit = new boolean[len];
        queue.add(new Node(begin,0));

        while (!queue.isEmpty()){
            Node node = queue.poll();

            if(node.word.equals(target)){
                answer = node.count;
                break;
            }

            for(int i=0; i < len; i++){
                //한번 방문한 단어는 안되고 문자두개에서 1개의 글자만 다를경우 queue에 add
                if(!visit[i] && isCompare(node.word, words[i])){
                    visit[i] = true;
                    queue.offer(new Node(words[i],node.count+1));
                }
            }
        }
        return answer;
    }
    //비교 두문자를 비교하여 1개가 다를경우 true
    public boolean isCompare(String word,String words){
        int count =0;
        for(int i=0; i < words.length(); i++){
            if(word.charAt(i) != words.charAt(i)){
                count++;
            }
        }
        return count == 1;
    }
}
