package ex_work;

import java.util.Scanner;

public class Ex6_work {
    public static void main(String[] args) {
        //등록할 인원수 : 2
        //이름 : 홍길동
        //수학 : 99
        //영어 : 100
        //국어 : 75
        //--------------
        //이름 : 김길순
        //수학 : 70
        //영어 : 89
        //국어 : 99
        //---------------
        //총 2명의 학생 정보가 등록됨
        //[ 학생 등록정보 ]
        //홍길동 99    100    75 (Tab키로 간격 벌림)
        //김길순 70    89     99
                
        Scanner sc = new Scanner(System.in);
        System.out.print("등록할 인원수 : ");
        int n = sc.nextInt(); //열의 갯수는 4개로 정해져 있고, 인원수에 따라 행만 늘어남
        
       /*
        String[][] str = new String[n][4]; // 4개: 이름,수학,영어,국어. 사람수에 따라 큰방의 갯수 달라짐

        //single for문으로
        for( int i = 0; i < str.length; i++ ){ //str.length대신 n 넣어도 됨. 큰 방 갯수
            System.out.print("이름 : ");
            str[i][0] = sc.next(); //이름은 누구든간에 0번째 열. 담습니다.

            System.out.print("수학 : "); //수학은 1번째 열
            str[i][1] = sc.next();

            System.out.print("영어 : ");
            str[i][2] = sc.next();

            System.out.print("국어 : ");
            str[i][3] = sc.next();

            System.out.println("--------------");
        }//for

        */

        //2번째 방법 - 유지,보수 고려
        String[] info = {"이름 : ", "수학 : ", "영어 : ", "국어 : "}; //여기다 마음껏 과목 추가하면 배열 더 만들어짐
        String[][] str = new String[n][info.length];

        //학생정보 등록
        for( int i = 0; i < str.length; i++ ){
           for( int j = 0; j < str[i].length; j++ ){

            System.out.print(info[j]); //j=0 이름 : , j=1 수학 :
            str[i][j] = sc.next();

           }//inner

           System.out.println("--------------");

        }//outer

        System.out.printf("총 %d명의 학생 정보가 등록됨\n", n);//n대신 str.length로 해도 됨
        System.out.println("[ 학생 등록정보 ]");
        //나머지는 이중for문 돌리면서 내가 담아둔 정보들 배열로 싹 다 보여주기만 하면 됨
        for( int i = 0; i < str.length; i++ ) {
            //System.out.print(str[i][0] + " "); 실수. 이름이 두 번씩 찍힘
            for( int j = 0; j < str[i].length; j++ ){
                System.out.printf("%s\t", str[i][j] ); //str에 담긴 내용들을 출력
            }//inner
            System.out.println();
        }//outer

    }//main
}

//연습용으로 괜찮은 코드