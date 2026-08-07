package ex_work;

import java.util.Scanner;

public class Ex3_work {
    public static void main(String[] args) {
        
      //키보드에서 나이와 키를 입력을 받는다
      //나이가 15세 이상이거나 키가 150cm이상이면 탑승가능
      //그렇지 않으면 탑승불가를 출력 
        
      //나이 : 14
      //키 : 140
      //탑승불가
    
        Scanner sc = new Scanner(System.in); //키보드에서 값 받으려고 준비. 스캐너객체 sc있어야 출력가능.
        System.out.print("나이를 입력하세요: "); //선생님은 "나이 : "
        int age = sc.nextInt(); //키보드에서 정수값을 받기 위한 기능. 엔터를 쳐야 age에 값 담김.
        
        System.out.print("키를 입력하세요: "); //"키 : "
        int height = sc.nextInt(); //키는 소숫점으로 받을 수도 있지만 nextFloat은 아직.
        //키까지 받아야 결과 나오니까 대기.

        if (age >= 15 || height >= 150) { //OR연산은 둘 중 하나만 참이어도 참. 15세 이상이면 if문으로 들어와 "탑승가능"만 찍고 종료됨.
           System.out.println("탑승가능");
        } else {
            System.out.println("탑승불가"); //12세 120cm이면 if문이 조건 불만족이라 실행 못하고 else 실행하고 빠져나옴.
        }
                

    }//main
}
