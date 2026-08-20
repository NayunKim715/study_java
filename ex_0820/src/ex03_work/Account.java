package ex03_work;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) { //main은 void. 반환형이 없는 경우에도 return을 넣을 수 있따.
        /*
        1.입    금
        2.출    금
        3.잔액확인
        etc.종 료
        >> 1
        ---입  금---
        입금액 : 1000
        입금성공
        ------------
        1.입    금
        2.출    금
        3.잔액확인
        etc.종 료
        >> 3
        ---잔액확인---
        1000원
        -------------
        1.입    금
        2.출    금
        3.잔액확인
        etc.종 료
        >> 4
        atm 사용을 종료합니다
        */
        Scanner sc = new Scanner(System.in);
        Atm atm = new Atm();//while문 바깥에 Atm기 세워야 일일이 부르지 않음

        //잔액이 계속 유지되어야 함
        
        //1,2,3번 이외의 값을 누를 때까지 무한 반복 while문
        while( true ) {
        //outer : while( true ) {
            //일단 메뉴 보여줌
            System.out.println("1.입   금");
            System.out.println("2.출   금");
            System.out.println("3.잔액확인");
            System.out.println("etc.종 료");
            System.out.print(">> ");

            int select = sc.nextInt();
            int money = 0; //입금하거나 출금하고 싶을 때 atm에게 알려줘야 하는 내 수중의 금액
            
            //뭘 선택했는지를 switch문으로 가려냄. select를 비교값으로 넣음.
            switch( select ){
               case 1:
                  System.out.println("---입  금---");
                  System.out.print("입금 : ");
                  money = sc.nextInt();
                  atm.deposit(money);
                  break;

               case 2:
                  System.out.println("---출  금---");
                  System.out.print("출금액 : ");
                  money = sc.nextInt();
                  //출금하고 싶은 금액을 키보드에서 받고 Atm기에게도 알려줌
                  atm.withdraw(money);
                   break;
                
               case 3:
                   System.out.println("---잔액확인---");
                   atm.balance();
                   break;

               default:
                    System.out.println("atm 사용을 종료합니다");
                    //break outer;
                    return;
            }//switch
            System.out.println("---------------------");

        }//while    

    }//main
}
//선생님은 서사가 있는 문제를 좋아함
// 사용자의 입장