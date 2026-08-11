package src4.ex1_multi_for;

public class Ex10_multiFor {
    public static void main(String[] args) {

        /*
         1 3 5 7 9
         3 5 7 9 1
         5 7 9 1 3
         7 9 1 3 5
         9 1 3 5 7
         */

        for (int i = 1; i <= 10; i += 2) { //10바퀴 돌아도 결과적으로는 홀수만 5개
            for (int j = 0; j <= 9; j += 2) { //j<10;
                int num1 = i + j;
                //System.out.print(num + " "); //여기서 출력하면 10을 넘어가는 값들 나옴. 11, 13, 15 ...사다리꼴
                if (num1 > 10) 
                    num1 -= 10;
                System.out.print(num1 + " "); 
            }//inner
            System.out.println();
        }//outer
        System.out.println("-------------------");

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) { 
                int num2 = 1 + ( i * 2 ) + ( j * 2);

                if (num2 > 10) 
                    num2 -= 10;

                System.out.print(num2 + " "); 
            }//inner
            System.out.println();
        }//outer
    }// main
}
//실무에서는 첫번째 더 추천