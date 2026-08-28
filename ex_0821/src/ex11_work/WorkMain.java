package ex11_work;

import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {
        //문제 : PEALP
        //>> ealpp
        //ealpp오답
        //>>apple
        //apple정답!!
        WorkSub ws = new WorkSub();
        
        //정답단어
        String answer = ws.getAnswer();

        //정답을 섞어서 문제로 만들기
        String question = ws.scrambleWord( answer );

        Scanner sc = new Scanner(System.in);
        System.out.println( "문제 : " + question );

        while(true){
            System.out.print( ">> ");
            String str = sc.next();

            if( str.equalsIgnoreCase( answer ) ){
                System.out.println(str + "은 정답입니다");
                break;
            }else{
                System.out.println(str + "은 오답입니다");
            }

        }//while

    }//main
}
