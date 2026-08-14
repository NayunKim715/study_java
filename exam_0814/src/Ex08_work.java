import java.util.Random;

public class Ex08_work {
    public static void main(String[] args) {
        //1 ~ 45 사이의 중복되지 않는 난수 6개를 출력하는
        //로또번호 생성기 만들기
        //------------------
        //17 2 45 27 9 11
        
        //1)
        int[] lotto = new int[6];
        //2)
        outer : for( int i = 0; i < lotto.length; ){ 
            //4)
          lotto[i] = new Random().nextInt(45) + 1; //처음에는 bound : 6으로
       
          //중복값 비교
          for( int j = 0; j < i; j++ ){
             if( lotto[i] == lotto[j] ){
                continue outer;
              }
          }//inner
          System.out.print( lotto[i] + " "); 
          //3)
          i++;
        }//outer
    }//main
}
