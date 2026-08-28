package ex6_work;

import java.util.Scanner;

public class Ex3_work {
    public static void main(String[] args) {
        //정수입력( 입력종료 : 0 )
        //>> 45
        //>> 17
        //>> 20
        //>> 21
        //>> 0
        //--------------
        //숫자 점위를 입력하세요
        //시작수 : 15
        //끝 수 : 20
        //17
        //20
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();

        System.out.println("정수입력(종료 : 0)");

        //반복문 돌리면서 값을 계속 받는다
        while( true ){
            System.out.println(">> ");
            int num = sc.nextInt();

            if() // 놓침. 영상 재시청

            list.add(num);

        }//while

        System.out.println("-----------------");

        System.out.print("시작수 : ");
        int start = sc.nextInt();

        System.out.print("끝 수 : ");
        int end = sc.nextInt();

        for( int i = 0; i < list.size(); i++ ){
            if( list.get(i) >= start && list.get(i) <= end ){
                System.out.print( list.get(i) + " ");

            }
        }//for

    }//main
}

//놓침