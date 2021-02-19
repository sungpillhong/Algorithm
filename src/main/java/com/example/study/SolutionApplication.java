package com.example.study;

import com.example.study.week4.LeetCode_maximumcoin;
import com.example.study.week4.LeetCode_removeoutermost;
import com.example.study.week5.Programmers_42747;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.sql.SQLOutput;

@SpringBootApplication
public class SolutionApplication {

//    public static void main(String[] args) {
//
//        int[] citations = {11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11};
//        int answer = 0;
//        Programmers_42747 programmers_42747 = new Programmers_42747();
//        System.out.println(programmers_42747.solution(citations));
//    }

    public static void main(String[] args) {
        try(
                FileWriter fw = new FileWriter( "soccer.txt" ,true);
                BufferedWriter bw = new BufferedWriter( fw );
            )
        {
            bw.write("손흥민"); //버퍼에 데이터 입력
            bw.newLine(); //버퍼에 개행 삽입
            bw.write("이강인");
            bw.newLine();
            bw.flush(); //버퍼의 내용을 파일에 쓰기
        }catch (IOException e ) {
            System.out.println(e);
        }

        File f = new File("soccer.txt");
        // 파일 존재 여부 판단
        if (f.isFile()) {
            System.out.println("soccer.txt 파일이 있습니다.");
        }

        try(
                FileReader rw = new FileReader("soccer.txt");
                BufferedReader br = new BufferedReader( rw );
        ){

            //읽을 라인이 없을 경우 br은 null을 리턴한다.
            String readLine = null ;
            while( ( readLine =  br.readLine()) != null ){
                System.out.println(readLine);
            }
        }catch ( IOException e ) {
            System.out.println(e);
        }

    }

}
