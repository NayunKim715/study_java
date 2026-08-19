package ex_work;

import java.util.Random;
import java.util.Scanner;

public class Ex1_baseball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] com = new int[3]; //1~9까지 중복없는 세 자리 정수를 랜덤으로 뽑아 배열에 저장
        int[] user = new int[3];

        outer: for (int i = 0; i < com.length;) {// i 변수가 0->1->2 될 때 com[0], com[1], com[2]에 각각 들어감

            com[i] = new Random().nextInt(9) + 1;
            // 중복값 비교
            for (int j = 0; j < i; j++) {

                if (com[i] == com[j]) {
                    continue outer;
                }
            } // inner
            i++;

        } // outer
        System.out.println("정답 : " + com[0] + com[1] + com[2]);

        while (true) {
            System.out.print("입력(예:123 : ");

            int number = sc.nextInt(); // 사용자가 입력한 정수를 number라는 변수에 저장
            user[0] = number / 100;//입력값의 백의 자리를 user[0]에 저장
            user[1] = number / 10 % 10;//입력값의 십의 자리를 user[1]에 저장
            user[2] = number % 10;//입력값의 1의 자리를 user[2]에 저장

            //strike와 ball을 횟수를 카운트하는 변수들
            int strike = 0; //strike 를 0으로 초기화
            int ball = 0; //ball을 0으로 초기화

            //이중 for문으로 com과 user 배열의 각 자리 숫자를 서로 비교 
            for (int i = 0; i < user.length; i++) {
                for (int j = 0; j < user.length; j++) {
                    if (i == j) {
                        if (com[i] == user[j])
                            strike++;
                    // com[i]와 user[j]가 같은 자리일 때, 둘의 값이 같으면 strike 증가.
                    } else {
                        if (com[i] == user[j])
                            ball++;
                    //com[i]와 user[j]가 다른 자리일 때, 숫자만 같으면 ball 증가.    
                    }
                } // inner
            } // for

            // 정답처리
            if (strike == 3) {
                System.out.println("정답!! - " + com[0] + com[1] + com[2]);
                break;
            //strike 3 일 때,"정답!!" 메시지를 출력하고 break로 while문을 나간다. 
            }else{
                if (strike > 0 || ball > 0) {
                //3 strike는 아니지만, strike나 ball이 1개 이상이면 맞춘 숫자가 존재. 이때는 별도의 메시지 출력하지 않음.
                }else{
                    System.out.println("OUT");
                // strike와 ball모두 0이면 일치하는 숫자가 아예 존재하지 않음. 이때는 OUT 메시지 출력
                }
            }
            System.out.println("---------------"); //구분선 출력
            //그러나 아직 while문 안에 있으므로 다음 입력 기다림. 정답 맞출 때까지 진행.

        }//while

    }//main
}//class

