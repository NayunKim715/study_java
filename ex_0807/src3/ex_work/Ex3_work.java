package src3.ex_work;

import java.util.Random;

public class Ex3_work {
    public static void main(String[] args) {
        
       // A ~ Z사이의 값중 하나를 랜덤으로 출력
       // bound : 90-65+1 => 숫자로 90~65 사이의 난수
       
       /* 첫번째. 가장 간단한 방법
       int rand = new Random().nextInt( 90 - 65 + 1 ) + 65;
       System.out.println( (char)rnd );
       */

       //아스키코드 몰라도 되는 방법. 이게 더 가독성 높다. 알파벳 사이에 난수 만드려 했나보네. 
       int rnd = new Random().nextInt( 'Z' - 'A' + 1 ) + 'A'; 
       System.out.println( (char)rnd );

        
    }//main
}



