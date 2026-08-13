package ex_work;

import java.util.Random;

public class Ex08_work {
    public static void main(String[] args) {
        //변수 money에 10 ~ 5000 사이의 난수를 발생시킨다
        //단, 발생한 난수 money는 1의 자리가 반드시 0이 되도록 한다
        //money를 최소한의 동전으로 몇 개씩 거슬러지는지 출력
        //------------------------------
        //금액 : 2590(1의 자리는 반드시 0)
        //500원 : 5
        //50원 : 1
        //10원 : 4 
        int[] coin = { 500, 100, 50 ,10 };
        
        int money = new Random().nextInt(4991) + 10;//5000 - 10 + 1
        // bound: 5000 -> 결과는 차이 없어도 회사에서 환율조작?
        money *= 10; //1의 자리를 0으로 만드는 게 목적 

        System.out.println("금액 : " + money);

        for( int i = 0; i < coin.length; i++ ) { //coin,length=4. index는 3번까지 있지만 방은 4개
           int res = money / coin[i];//지역변수 만듦

           if( res > 0 ){
            System.out.printf(
                "%d원 : %d개\n", coin[i], res);
            money %= coin[i];
            }

        }//for

    }//main
}
