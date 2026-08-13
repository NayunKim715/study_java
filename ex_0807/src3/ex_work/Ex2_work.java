package src3.ex_work;

import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {

        //키보드에서 입력받은 2 ~ 9사이의 값에 해당하는
        //구구단을 출력
        //------------------
        //단 : 10
        //2 ~ 9 사이의 값을 입력하세요.

        //단 : 5
        //5 * 1 = 5
        //5 * 2 = 10
        // ....
        //5 * 9 = 45

        Scanner sc = new Scanner(System.in);
        System.out.print("단 : ");
        int dan = sc.nextInt();
        if (dan < 2 || dan > 9) {
            System.out.println("2 ~ 9 사이의 값을 입력하세요.");
        } else {
            for (int i = 1; i <= 9; i++) {
                //System.out.println(dan + " * " + i + " = " + (dan * i));
               
                //결과를 println이 아닌 printf로 출력
                //System.out.printf("%d * %d = %d\n", dan, i, (dan*i));

                //2단은 2*5이후로 두 자리, 그 앞은 한자리
                System.out.printf("%d * %d = %02d\n", dan, i, (dan*i));
            }
        }

    //세트로 만드려면 for문을 2개 만들어야 한다.

    }//main
}