package ex_work;

import java.util.Scanner;

public class Ex7_work {
    public static void main(String[] args) {
        
        //키보드에서 아무값이나 입력받고
        //숫자인지 아닌지를 판단하기
        //-----------------------
        //값 : 123
        //123은(는) 숫자입니까? true

        //값 : a12
        //a12은(는) 숫자입니까? false
        Scanner sc = new Scanner(System.in);
        System.out.print("값 : ");
        String str = sc.next();

        int i = 0;//전역 변수로 써먹고 싶어 for문 바깥에 만들었다. 그래서 for문 초기식 없다. - 핵심
        for( ; i < str.length(); i++ ){
            char ch = str.charAt(i);
            
            if( ch < '0' || ch > '9' ){ //숫자 0~9에 해당하는 아스키 값보다 작거나, 그것을 넘어가거나
              break;
            }
        }//for

        if( i == str.length() ){
            System.out.println(str + "은(는) 숫자임");
        }else{
            System.out.println(str + "은(는) 숫자가 아님");
        }

    }//main
}
