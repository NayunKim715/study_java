package ex6_work;

import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {
        
        //정수 : 9
        //9은(는) 소수가 아닙니다

        //정수 : 7
        //1은(는) 소수가 아닙니다
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int n = sc.nextInt();

        WorkSub ws = new WorkSub();
        boolean res = ws.isPrime(n); //파라미터로 넘어간 n값이 소수인지 판단

        if( res ) //res == true
            System.out.println(n + "은 소수");
        else
            System.out.println(n + "은 소수 아님");

    }//main
}
