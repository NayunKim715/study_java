import java.util.Scanner;

public class Ex06_work {
    public static void main(String[] args) {
        
    // 정수 : 7
    // 7은(는) 소수입니다

    // 정수 : 10
    // 10은(는) 소수가 아닙니다
    Scanner sc = new Scanner(System.in);
    System.out.print("정수 : ");
    int n = sc.nextInt();

    int i = 2; //for문 안에서 지정 X. 2부터 시작하는 게 낫겠다.
    for ( ; i < n; i++){
        if (n % i == 0) {
            break;
        }
    }//for    
    /* 1) n=5, i=2 참 -> if문 못하고 i만 증가 -> i =3
    이것도 거짓. i=4도 거짓
    n=5 i=5 참. -> if문에 걸려서 증감식 안하고 for문 빠져나옴
    */
    
    if( i == n ){
        System.out.println(n + "은 소수");
    } else {
        System.out.println(n + "은 소수가 아님");
    }

   }//main
}

//그동안 수업자료에 없던 문제
//나눌 수 있는 애가 1과 자신 뿐. 1은 소수 아님.

//영상 재시청