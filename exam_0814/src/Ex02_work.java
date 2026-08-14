import java.util.Scanner;

public class Ex02_work {
    public static void main(String[] args) {

        // 1 ~ 12월 사이의 값을 키보드에서 입력
        // 입력된 값에 해당하는 달이 몇일까지 있는지 출력
        // -------------------
        // 월 : 3
        // 3월은 31일까지 있습니다

        Scanner sc = new Scanner(System.in);

        System.out.print("월 : ");
        int month = sc.nextInt(); 

        switch (month) { //switch문은 완벽히 일치하는 조건값을 찾아들어가므로 일일이 case 작성
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println(month + "월은 31일 까지");
                break;
                //무조건 break가 매 case마다 있어야 하는 건 아님. break를 만날 때까지 내려감.

            case 4: case 6: case 9: case 11:
                System.out.println(month + "월은 30일 까지");
                break;

            case 2:
                System.out.println("2월은 28일 까지");
                break;

            default: //1~12사이의 값이 아니었을 때 반드시 들어오는 영역
                System.out.println(month + "월은 없음");
                break;

        }// switch

    }// main
}

// 당시에는 switch문. 이제는 if문으로도 만들 수 있다.
//2교시 첫문제