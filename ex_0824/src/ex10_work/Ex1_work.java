package ex10_work;

import java.util.Scanner;

public class Ex1_work {
    public static void main(String[] args) {
        //정수 : 123
        //입력받은 수 : 123

        //정수 : abc
        //정수만 입력할 수 있습니다.
        //try-catch로 감지
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");

        try {
            int n = sc.nextInt();
            System.out.println("입력받은 수 : " + n);
        } catch (Exception e) {
            System.out.println("정수만 입력가능");
        }

    }//main
}

    // Exception e는 예외가 발생했을 때 생성되는 예외 객체를 의미합니다.
    // Exception은 모든 예외의 최상위 클래스이고,
    // e는 해당 예외 객체의 참조 변수입니다.
    // catch (Exception e)는 "어떠한 예외가 발생하든 모두 잡겠다"는 뜻이며,
    // e를 통해 예외에 대한 정보(에러 메시지 등)를 가져올 수 있습니다.

    // try-catch가 코드를 가장 간소화할 수 있는 경우는
    // "외부에서 들어오는 입력(사용자 입력, 파일, 네트워크 등)이 예측할 수 없는 오류를 유발할 수 있거나,
    //  해당 오류에 대해 세분화된 복구가 필요하지 않고, 오류 발생 시 일괄적으로 처리해도 무방할 때"입니다.
    // 예를 들어, 숫자만 입력받는 상황에서 잘못된 입력이 들어올 수 있고,
    // 입력 오류에 대해서만 간단하게 메시지를 출력하고 프로그램을 종료하면 되는 경우처럼
    // try-catch 범위를 좁게 잡고 내부 코드를 최소화해 처리하는 것이 코드를 간소화할 수 있습니다.
    // 즉, 다양한 예외를 별도로 처리할 필요 없이 전체 예외(Exception)로 한 번에 잡는 경우에 효과적입니다.