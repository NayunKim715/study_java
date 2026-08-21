package ex9_work;

import java.util.Random;

public class WorkSub {

    Random rnd = new Random();

    public void myLotto( int[] lotto ){
       outer : for( int i = 0; i < lotto.length; ){
        //lotto[i] = new Random().nextInt(6) + 1;
        lotto[i] = rnd.nextInt(6) + 1;
        for( int j = 0; j < i; j++ ){
            if( lotto[i] == lotto[j] ){
                continue outer;
            }
        }//inner
        //System.out.print( lotto[i] + " " );//이거 때문에 두번 출력 5 3 2 6 1 4 5 3 2 6 1 4 
        i++;

       }//outer

    }//myLotto 
}
