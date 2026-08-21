package ex10_work;

import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {
        // 키보드에서 받은 홀수값에 대응하는 마방진 만들기
        // ------------------
        // 홀수 : 3
        // 08 01 06
        // 03 05 07
        // 04 09 02
        Scanner sc = new Scanner(System.in);
        System.out.print("홀수 : ");
        int n = sc.nextInt();

        WorkSub ws = new WorkSub();
        int[][] res = ws.square(size); //그냥 int가 아니라!

        for( int i = 0; i < size; i++ ){
            for( int j = 0; j < size; j++ ){
                System.out.printf("%02d ", res[i][j]);
            }//inner
            System.out.println();
        }//for
    }// main
}
// ex_0813
//사실 마방진을 이렇게 복잡하게 짤 이유 없다.
//나눠서 만드는 방법 연습