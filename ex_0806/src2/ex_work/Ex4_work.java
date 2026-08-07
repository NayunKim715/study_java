package ex_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {
        
     //계산기 만들기 : 숫자 두 개와 어떤 연산을 하고 싶은지
     //#연산자는 스캐너의 .next()를 사용하자
     //수1 : 10
     //수2 : 20
     //연산자 : +
     //10 + 20 = 30
     Scanner sc = new Scanner(System.in);

     System.out.print("수1 : ");
     int num1 = sc.nextInt();//첫번째 숫자를 저장할 변수 필요.
     
     System.out.print("수2 : ");
     int num2 = sc.nextInt();

     System.out.print("연산자 : ");
     String op = sc.next(); //nextInt, next는 있어도 nextchr는 없다. 문장인 op가 String 자료형이어야 한다.

     switch (op) {//비교값
        case "+"://조건값
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            break;
            
        case "-":
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            break;
            
        case "*":
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            break;
            
        case "/":
            System.out.println(num1 + " / " + num2 + " = " + ((float)num1 / num2));
            break;    
        //소숫점 표기. double, float없이 나누면 1/3 = 0으로 몫만 뜬다.
        //둘 중의 한 개는 실수타입이어야 함. 과수원 때 해봄.
        default:
                System.out.println("연산자 오류"); //"올바른 연산자가 아닙니다. (+, -, *, / 중 입력)"도 좋다.
                break;

     }//switch


    }//main
}