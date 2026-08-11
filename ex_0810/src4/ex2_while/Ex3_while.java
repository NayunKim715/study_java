package src4.ex2_while;

import java.util.Scanner;
import java.util.Random;

public class Ex3_while {
    public static void main(String[] args) {
        
     //1 ~ 100사이의 난수를 만들고
     //키보드에서 입력받은 값이 정답일 때 게임을 종료
     //-----------------------
     //숫자 : 25
     //UP
     //숫자 : 70
     //DOWN
     //숫자 : 50
     //정답입니다
    Scanner sc = new Scanner(System.in);
        
    int answer = new Random().nextInt(100) + 1;
    System.out.println(answer);//치트키. 디버깅. 나중에 서비스할 때 지우면 됨.
    int num = 0;//사용자가 입력할 값    

    while ( num != answer ) {
       System.out.print("숫자 : ");
       num = sc.nextInt(); //while문 안에 있어야 지속적으로 입력받을 수 있다. while문 안에 있지 않으면 딱 한번만 실행. 
    
       if ( num < answer ) {
           System.out.println("UP");
        }else if ( num > answer ) {
           System.out.println("DOWN");
        }else{
           System.out.println("정답입니다"); //while문 나가서 한 줄 작성해도 된다. 거짓이면 while문 나가니까.
        //이미 if문 있으니 세 가지 상황 묶어서 관리하려고.
        }
    }//while    
  }//main
} 