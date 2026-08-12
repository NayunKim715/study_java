package ex_work;

public class Ex02_work {
    public static void main(String[] args) {
        
       //배열 arr에 담긴 모든 값의 합을 출력
       //---------------
       //결과 : 121

       int[] arr = { 10, 11, 37, 61, 2 };
       int res = 0;

       for(int i = 0; i < arr.length; i++) {
           res += arr[i];
       }//for
       
       System.out.println("결과 : " + res);
    }//main
}




//4년차 개발자가 안드로이드 앱을 만들면서 "형, 난 아직도 2차원 배열이 헷갈려."