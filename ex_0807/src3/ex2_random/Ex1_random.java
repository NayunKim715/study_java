package src3.ex2_random;

import java.util.Random;

public class Ex1_random {
    public static void main(String[] args) {
        
    // 2~9 사이의 난수에 해당하는 구구단
    int dan = new Random().nextInt( 8 ) + 2;

    for( int i = 1; i <= 9; i++ ){
       System.out.println(
        dan + "*" + i + "=" + (dan*i));
    }//for

}//main
}
