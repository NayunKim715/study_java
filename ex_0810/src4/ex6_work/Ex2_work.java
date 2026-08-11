package src4.ex6_work;

import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {
        //1부터 사용자가 입력한 숫자까지
        //3의 배수의 갯수, 5의 배수의 갯수를 출력
        //----------------
        //정수 : 70
        //3의 배수 : 23
        //5의 배수 : 14
        //break나 continue 없이 for문 예제

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 : ");
        int su = sc.nextInt();

        //3의 배수와 5의 배수의 갯수를 기억할 변수들 준비
        int cnt3 = 0;
        int cnt5 = 0;

        for( int i = 1; i <= su; i++ ){

            if( i % 3 == 0 )
                cnt3++;

            if( i % 5 == 0) 
                // else if로 하면 3의 배수 찾으면 5의 배수를 아예 못 찾는다. if 2개여야 함
                cnt5++;

        }//for

        System.out.println("3의 배수 : " + cnt3);
        System.out.println("5의 배수 : " + cnt5);



    }//main
}
