package ex_work;

import java.util.Random;

public class Ex09_work {
    public static void main(String[] args) {
        //1 ~ 45 사이의 중복되지 않는 난수 6개를 출력하는
        //로또번호 생성기 만들기
        //------------------
        //17 2 45 27 9 11
        int[] lotto = new int[6];
        
        outer : for( int i = 0; i < lotto.length; ){ //바깥쪽 for문에 outer라는 label
          lotto[i] = new Random().nextInt(45) + 1; //처음엔 bound:6으로 테스트  
       
          //중복값 비교
          for( int j = 0; j < i; j++ ){

             if( lotto[i] == lotto[j] ){
                continue outer;
             }

          }//inner
          System.out.print( lotto[i] + " "); //println하면 하나하나 세로로 출력
          i++;

        }//outer
        




    }//main
}

//우연이 아니라 아예 안 겹친다는 것을 확인하려면 개발할 때는 1 ~ 6사이의 난수 출력
//안 겹치면 1 ~ 45로

