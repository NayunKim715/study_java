package ex_work;

import java.util.Scanner;

public class Ex6_work {
    public static void main(String[] args) {
        //문장 : abcab
        //결과 : abc - 중복된 것 걸러서 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 : ");

        String in = sc.next();
        String res = "";

        for( int i = 0; i < in.length(); i++ ){
            char curr = in.charAt(i); //current

            if( res.indexOf( curr ) == -1 ){ //이 부분이 핵심
                res += curr;
            }

        }//for
        System.out.println("결과 : " + res);

    }//main
}
