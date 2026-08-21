package ex04_work;

import java.util.Scanner;

public class Vmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("금액 : ");
        int money = sc.nextInt();
        
        Vending ven = new Vending();
        //ven.init(); //8월 21일 이제 init 호출 못하지만 음료수 5개 세팅 완료

        ven.showDrink(money);

        String name = sc.next();
        ven.dispense(name);


    }//main
}
//8월 20일 오후 2시. 
//음료수 = 설계도가 있어야 만들 수 있는 객체.