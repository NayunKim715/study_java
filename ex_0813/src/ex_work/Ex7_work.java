package ex_work;

import java.util.Scanner;

public class Ex7_work {
    public static void main(String[] args) {
        //홀수 : 3 
        //(3행 3열 마방진이 보여짐)
        //08 01 06
        //03 05 07
        //04 09 02
        //참고: 홀수 마방진 (3x3, 5x5 등)

        Scanner sc = new Scanner(System.in);
        System.out.print("홀수 : ");
        int n = sc.nextInt(); 
        
        /*int[][] arr = new int[n][n]; 

       
            System.out.println();
    


            while( num <= size * size ){

              square[y][x] = num;
        
              if( num % size == 0 ){
                 y++;
              }else{
                 y--;
                 x++;
              }

              if( y < 0 )
                y = size - 1;

              if( x >= size)
                x = 0;


            }

    }//main
}
    */
        // 마방진 작성 로직 - missing code 완성
        // 가장 대표적인 홀수 마방진(3x3, 5x5...) 만들기 방식
        int[][] square = new int[n][n];
        int num = 1;
        int size = n;
        int x = size / 2; // 중앙열
        int y = 0;        // 첫행
        
        while (num <= size * size) {
            square[y][x] = num;

            if (num % size == 0) {
                y++;
            } else {
                y--;
                x++;
            }

            if (y < 0)
                y = size - 1;

            if (x >= size)
                x = 0;

            num++;
        }

        // 마방진 출력
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%02d ", square[i][j]);
            }
            System.out.println();
        }
    }
}