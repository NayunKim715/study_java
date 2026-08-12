package src4.ex6_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {
        //키보드에서 입력받은 두 개의 수의 최대공약수 출력
        //------------------
        //수1 : 18
        //수2 : 12
        //최대공약수 : 6

    Scanner sc = new Scanner(System.in); 
    System.out.print("수1 : ");
    int su1 = sc.nextInt();

    System.out.print("수2 : ");
    int su2 = sc.nextInt();

    int su3 = su1 < su2 ? su1 : su2; // su1과 su2 중 작은 값을 su3에 저장 
    // 지각. 영상 다시 보기. 이건 인공지능이 채운 것
    
   

    int i = su1;
    for( ; i >= 1; i-- ){ // int i = 0;로 for문 안에 만들었다면 지역변수라서 for문 밖에서 쓸 수 없다
      if( su1 % 1 == 0 && su2 % 1 == 0 ){
        break;
      }
    }//for
       
    System.out.println("최대공약수 : " + i);

    System.out.println("------------------------");   

    /*
    //유클리드 호제법으로 최대공약수 구하기 - 똑같은 결과가 나오는지
    while( su2 != 0){

        int tmp = su1 % su2 //임시 변수 하나 만들어, su1을 su2로 나눈 나머지값
        su1 = su2;
        su2 = tmp;

    }//while
    System.out.println("최대공약수 : " + su1); */

    }//main
}//class



