package ex_work;

import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {
        //찾을 값 : 10
        //10보다 큰 첫번째 요소 : 11
        //해당 행의 모든 요소
        //9 10 11 12

        //찾을 값 : 6
        //6보다 큰 첫번째 요소 : 7
        //해당 행의 모든 요소
        //5 6 7 8

        int[][] array = { { 1, 2, 3, 4 },
                          { 5, 6, 7, 8 },
                          { 9, 10, 11, 12 },
                          { 13, 14, 15, 16 } }; //엔터가 필수는 아니다

        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 값 : ");
        int num = sc.nextInt(); //num이라는 변수에 값을 받아 넣는다


        out : for( int i = 0; i < array.length; i++ ){
            for( int j = 0; j < array[i].length; j++ ){

                if( array[i][j] > num ){
                   System.out.printf(
                      "%d보다 큰 첫번째 요소 : %d\n", num, array[i][j]);

                   System.out.println("해당 행의 모든 요소");

                   for( int k = 0; k < array[i].length; k++ ){ //i랑 j는 못 씀. 삼중for문
                       System.out.print( array[i][k] + " " );
                   }

                   break out;
                }//inner
            }//outer

        }//for

    }//main
}
