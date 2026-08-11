package src4.ex2_while;

import java.util.Scanner;

public class Ex1_while {
    public static void main(String[] args) {

        //while문 : 간단한 구성을 가진 반복문
        //선 비교 후 처리 - 조건식이 참인지를 먼저 확인. 거짓이면 1회전도 안할 수 있다. 참이면 비교-처리 반복
        
        /*무한반복 for문
        for(;;){
        } 
        이것보단 while(true)가 낫다*/ 

        int num = 1;

        while( num <= 4 ){ //소괄호 안에 조건식만 있으면 됨.
            System.out.println(num);
            num++;//여기까지 쓰면 1234가 세로로
            //이거 지우면 1을 무한으로 찍는다. 증가되는 코드가 안 들어있으면 영원히 참이기 때문.
            //멈추게 하려면 증감식 필요

        }//while

        System.out.println("---------------------------");

        Scanner sc = new Scanner(System.in);
        
        while( true ){ //의도적으로 무한반복. while문은 무한반복에 최적화된 문법.
            //어느 시점에 무한반복하는 게 좋은건지, 어느 시점에 조건식 넣는게 좋은지 고민
            System.out.print("홀수 : ");
            int num2 = sc.nextInt();
            System.out.println(num2); 

        }

    }//main
}

//2교시