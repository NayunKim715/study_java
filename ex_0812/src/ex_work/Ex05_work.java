package ex_work;

import java.util.Scanner;

public class Ex05_work {
    public static void main(String[] args) {
        /*
        학생 수를 입력하세요: 3
        학생 1의 성적: 90
        학생 2의 성적: 73
        학생 3의 성적: 84
        ----------------------
        평균 성적: 82.333336
        ----평균 이상인 학생들---
        => 학생1: 90
        => 학생3: 84
        평균 이상인 학생 수: 2
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수 : ");
        int stuCnt = sc.nextInt(); //몇 명의 학생 정보를 등록할건지를 받는다. sudentcount
        
        //성적을 입력받아 저장하기 위한 배열
        int[] grade = new int[stuCnt];
        
        //총점을 저장할 변수
        int sum = 0;

        for (int i = 0; i < stuCnt; i++){ //stuCnt 대신 grade.length해도 된다.
            System.out.printf("학생%d의 성적: ", i + 1);
            grade[i] = sc.nextInt();
            sum += grade[i]; //for문을 돌면서 sum한테 누적 
        }//for

        System.out.println("----------------------");

        float avg = (float)sum / stuCnt; //과수원
        System.out.printf("평균성적 : %.2f\n", avg);

        System.out.println("--- 평균 이상인 학생들 ---");

        int avgCnt = 0; //평균 이상인 학생수를 담을 변수

        for (int i = 0; i < stuCnt; i++){
            if ( grade[i] >= avg){ 
                avgCnt++;
                System.out.printf(
                    "=> 학생%d: %d\n", i+1, grade[i]); //학생번호, 해당학생의 점수
            }
        
        }//for
        System.out.println("평균 이상인 학생 수: " + avgCnt);

    }//main
}

//역대급 긴 코드
//C언어는 class를 나누지 못하기 때문에, C언어로 개발하는 친구는 자판기 코드 짜는데 만 줄 썼대요.