import java.util.Scanner;

public class Ex05_work {
    public static void main(String[] args) {
        //정수n1, n2를 입력받고
        //n1 ~ n2사이의 합을 출력
        //----------------
        //수1 : 2
        //수2 : 5
        //결과 : 14

        //수1 : 5
        //수2 : 2
        //결과 : 14

        Scanner sc = new Scanner(System.in);
        System.out.print("수1 : ");
        int n1 = sc.nextInt(); 
        
        System.out.print("수2 : ");
        int n2 = sc.nextInt(); 

        int res = 0;//결과 출력용 변수
        
        //2) n1과 n2값을 교환
        if( n1 > n2 ){
            int tmp = n1;//임시로 변수 만들어 n1값을 줌
            n1 = n2;
            n2 = tmp;
        } 
        //n1: 2, n2 : 5면 if문 실행 안 됨.
        //n2 : 5, n1 : 2면 if문이 참으로 되어 안으로 들어옴.
        //java보다 늦게 나온 파이썬같은 언어는 n1, n2 == n2, n1 가능


        //1) 작은 수를 먼저 받아야 실행 가능. 5,2 받으면 아무것도 안 나옴.
        for (int i = n1; i <= n2; i++) { 
            res += i;
        }//for
        
        System.out.println("결과 : " + res);
 
    }//main
}
