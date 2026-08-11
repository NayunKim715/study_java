package src4.ex2_while;

import java.util.Random;

public class Ex5_do_while {
    public static void main(String[] args) {
        
        //자바, jsp, 안드로이드의 시험을 봤다.
        //각 과목별 점수는 랜덤하게 0 ~ 130점이 대입
        //최종 결과를 화면에 출력
        //-------------------------
        //자바 : 37
        //jsp : 100
        //안드 : 13
        //100점 넘는 점수는 출력 안 됨?
        //셋 중 하나라도 100점을 넘어가면 세 개 다 100점을 안 넘을 때까지 난수를 다시 만든다.

         int java = 0;
         int jsp = 0;
         int android = 0;

         do{
            java = new Random().nextInt(130 - 0 + 1) + 0; //0부터 시작이면 +0안 써도 됨
            //while문 거짓이면 java부터 셋다 싹 다시 만든다.
            jsp = new Random().nextInt(131);
            android = new Random().nextInt(131);

            //if문 불필요
         }while( java > 100 || jsp > 100 || android > 100 );
          //&&부적절. 세 개가 다 100점을 넘어야 다시 돌리니까 

        System.out.print("자바 : " + java);
        System.out.print("jsp : " + jsp);
        System.out.print("안드 : " + android);

    }//main
}
//이 코드는 while문 보다 do-while이 더 낫다.