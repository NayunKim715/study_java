package ex_work;

import java.util.Scanner;

public class Ex1_work {
    public static void main(String[] args) {
        //키보드에서 입력받은 값이 회문인지 판단
        //----------------
        //입력 : abcba
        //abcba은(는) 회문입니다

        //입력 : abcb
        //abcb은(는) 회문이 아닙니다

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        
        //원본
        String str = sc.next();

        /* 두번째 방법 */
        StringBuffer sb = new StringBuffer( str );

        //원본을 뒤집에서 저장할 객체
        //String rev = ""; //첫번째 방법
        String rev = sb.reverse().toString();//두번째 방법

        /* 첫번째 방법
        for( int i = str.length()-1; i >= 0; i--){ //이게 핵심
           rev += str.charAt(i);
        }//for
        */

        if( str.equals( rev )){ //원본과 뒤집은게 값이 같은지를 본다
        //둘다 String 변수니까 str == rev 로 비교하는 경우 없다.
            System.out.println(str + "은 회문");
        }else{
            System.out.println(str + "은 회문 아님");
        }

    }//main

}

/* 8월 19일 14교시 
str = "abc"
rev = "" -> "c" -> "cba"
i = 2 -> 1 -> 0
*/