package src3.ex_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {
        
       //1부터 키보드에서 받은 값(n)까지의 합을 출력
       //--------------
       //입력 : 5
       //결과 : 15
       Scanner sc = new Scanner(System.in);
       System.out.print("입력 : ");
       int n = sc.nextInt();
       //jvm은 우리처럼 암산을 못한다
       int result = 0; //다 더해진 최종값을 이 변수가 저장할 것.
    
       for( int i = 1; i <= n; i++ ){ //1부터 몇까지 더할지는 키보드에서 값을 받고나야 안다
       //돌아가는 횟수를 제어한다.
       //키보드에서 받을 것 만큼 반복하는 게 이 변수의 핵심. n=5면 i가 5번 돈다
         
          result += i;
       }//for

       System.err.println("결과 : " + result );

    }//main
}


/*
3을 입력했을 때
i=2. result = 1
// r = r+1 = 2+1 = 3이 된다
// i=3, result=3 -> 참이니까. 이걸 수행하면 6
// i=4되면 거짓. for문 나온다.
*/