package src3.ex_work;

import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {
        //정수n1, n2를 입력받고
        //n1 ~ n2사이의 합을 출력
        //---------------------
        //수1 : 2
        //수2 : 5
        //결과 : 14

        //수1 : 5
        //수2 : 2
        //결과 : 14

        Scanner sc = new Scanner(System.in);

        System.out.print("수1 : ");
        int n1 = sc.nextInt(); //2
        
        System.out.print("수2 : ");
        int n2 = sc.nextInt(); //5

        int res = 0;//결과출력용 변수
        
        //n1과 n2의 값을 교환 //그래야 for문을 하나 더 만들 필요가 없다. 
        if( n1 > n2 ){
            int n3 = n1;
            n1 = n2;
            n2 = n3;
        } //파이썬 이후의 언어는 변수 두 개 바꾸기 훨씬 쉽지만 java는 무조건 이렇게.
          
        // n1=5, n2 =3
        //지역변수 n3는 n1값을 받아 n3 = 5로 출발. -> n3값을 n2에게 주세요. n2=5가 됨.
        //n3는 한번만 쓰기 때문에 전역변수로 만들 필요 X. 
        
        for (int i = n1; i <= n2; i++) { //i를 1이 아닌 n1으로 초기화
            //입력받은 것 중에서 작은 수부터 시작해야므로 1로 초기화는 적절하지 않다.
            res += i; //2,5 -> 2<5 -> 3 -> ...
            //무조건 n1이 작은 상태로 돌아가는 for문
            //n1 = 5, n2 =2 -> 처음 조건식에서 바로 거짓이므로 for문 아예 X

        }//for
        
        System.out.println("결과 : " + res);
        
             
        }//main
}//class
    
//어려워요.