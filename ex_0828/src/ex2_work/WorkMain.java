package ex2_work;

import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {
        //정수 : 7
        //7은(는) 소수입니다

        //정수 : 9
        //9은(는) 소수가 아닙니다
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int n = sc.nextInt();

        WorkSub ws = new WorkSub();

        if( ws.isPrime(n) ){
            System.out.println( n + "은 소수입니다" );
        }else{
            System.out.println( n + "은 소수가 아닙니다");
        }

    }//main
}
//이전과 같은 과제. class 나누기 다름.