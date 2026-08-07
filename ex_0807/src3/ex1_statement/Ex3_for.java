package src3.ex1_statement;

import java.util.Scanner;

public class Ex3_for {
    public static void main(String[] args) {
        //은행 이자가 하루에 1원씩 추가된다.
        //원금과 예치일수를 키보드에서 입력받고
        //예치기한이 끝났을 때 나의 원금이 얼마가 되어있는지 출력
        //---------------------------
        //원금 : 1000
        //예치일 : 5
        //5일 후의 잔액의 1005원 입니다
        Scanner sc = new Scanner(System.in); 
        System.out.print("원금 : ");
        int money = sc.nextInt(); //정수값 받음

        System.out.print("예치일 : ");
        int days = sc.nextInt();

        /* 1. for문을 쓰지 않음 - 실무
        int totalBalance = money + days;
        
        System.out.println(days + "일 후의 잔액의 " + totalBalance + "원 입니다");*/

        /* 2. for문 사용 - 연습 */
        // i <= days 때문에 시킨 것. 아까처럼 무조건 10바퀴, 20바퀴가 아님. 5일만 예금한다면 5바퀴만. 어떨 땐 20바퀴.
        for (int i = 0; i < days; i++) {
            money++; //한바퀴 돌때마다 증가 1씩 증가시킬 땐 +=1;보다 ++;
            //totalBalance += 1; // 이렇게만 쓰면 앞의 totalBalance=1004가 대입되어 1008이 된다.
        }//for
        
        System.out.println(days + "일 후의 잔액의 " + money + "원 입니다");

    }//main
}









        
      