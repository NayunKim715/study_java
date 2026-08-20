package ex01_work;

import java.util.Scanner;

public class NumberMain {
    public static void main(String[] args) {
        //값 : 100
        //100은(는) 숫자입니까? true

        //값 : abc123
        //abc123은(는) 숫자입니까? false

        Scanner sc = new Scanner(System.in);
        System.out.print("값 : ");
        String str = sc.next(); //내가 받은 문자열을 Subclass로 보내서 거기서 판단

        NumberSub ns = new NumberSub();
        boolean res = ns.isNumber(str);
        System.out.println(str + "은 숫자입니까? : " + res);

        //코드 절약 // System.out.println(str + "은 숫자입니까? : " ns.isNumber(str));

    }//main
}

// 오류: NumSub cannot be resolved to a type
// NumberSub 클래스를 NumberSub로 수정해야 함
// 아래 코드를 참고하세요.

// 잘못된 부분: 
// NumSub ns = new NumSub();
// 올바른 부분: 
// NumberSub ns = new NumberSub();

// 따라서, 위의 main 메서드에서
// NumSub ns = new NumSub(); 
// 를
// NumberSub ns = new NumberSub();
// 로 바꾸어야 합니다.

// 만약 이미 위에서 수정했다면 아래 삽입코드는 필요 없습니다.
// 하지만 추가 설명을 위해 코멘트로 남깁니다.


  /*
        선생님이 클래스를 두 개로 나누어서 하라고 하는 이유는 객체지향적 설계와 재사용성 때문입니다.
        1) 유지보수 및 확장성: NumberSub 클래스를 독립적으로 분리하면, 숫자인지 판별하는 기능을 다른 곳에서도 재사용할 수 있습니다. 
        2) 역할 분리: NumberMain은 프로그램의 실행과 입출력 담당, NumberSub는 특정 기능(예: 숫자 판별)만 담당하도록 역할을 명확히 할 수 있습니다.
        3) 코드의 가독성과 관리: 클래스 별로 역할이 명확하니 코드를 관리하고 이해하기 쉬워지고, 추후에 변경이 필요한 경우 해당 클래스만 수정하면 됩니다.
        즉, 실무적으로 클래스를 분리하는 것이 좋은 습관이며, 객체지향 프로그래밍의 기본적인 원칙(단일 책임 원칙 등)에 부합합니다.
        */