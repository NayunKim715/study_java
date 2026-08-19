package ex4_work;

import java.util.Scanner;

public class GuguMain {
    public static void main(String[] args) {
        //단 : 5
        //5단
        //5 x 1 = 5
        //....
        //5 x 9 = 45
        //값을 받는 건 메인, 출력은 서브에서?

        Scanner sc = new Scanner(System.in);
        System.out.print("단 : ");
        int dan = sc.nextInt();//입력받는게 여기까지. 다음 부분부터 출력

        Gugudan ggd = new Gugudan();
        ggd.printGugu(dan);

        /*
        System.out.print(dan + "단");

        for( int i = 1; i <= 9; i++ ){
            System.out.printf("%d x %d = %d\n", dan, i, dan*i );
         }//for
        */
    }//main
}
