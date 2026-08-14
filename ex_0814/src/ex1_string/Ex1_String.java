package ex1_string;

import java.util.Scanner;

public class Ex1_String {
    public static void main(String[] args) {
        
        //String클래스의 두 가지 특징
        //1) 객체 생성방법이 2가지( 암시적, 명시적 )
        //2) 한 번 생성된 문자열의 내용은 변하지 않는다. imutable
        
        //s1 : String 변수 = 객체 
        String s1 = "abc"; //암시적 객체생성. 같은 주소 함께 쓰기
        String s2 = "abc"; //동일한 값 집어넣음
        String s3 = new String("abc");//new : 명시적 객체생성. 무조건 새로 생성
        String s4 = new String("abc");
        
        //==은 객체간 비교에서는 주소값 비교를 한다, - 용법이 바뀜
        if( s1 == s3 ){ //String끼리는 == 로 비교하는 경우 단 한번도 못 봄. equals로 함.
            System.out.println("주소가 같습니다");
        }else{
            System.out.println("주소가 다릅니다");
        }

        //String 클래스의 불변의 법칙
        String greet = "안녕";
        greet += "하세요";
        System.out.println( greet ); //안녕하세요

        Scanner sc = new Scanner(System.in);
        System.out.print("연산자 : ");
        String op = sc.next();
        
        //if( op == "+" ){
        if( op. equals( "+")){
            System.out.println("+연산 할게요");
        }

    }//main
}
