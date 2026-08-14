import java.util.Scanner;

public class Ex03_work {
    public static void main(String[] args) {
       //계산기 만들기
       // 수1 : 10
       // 수2 : 20
       // 연산자 : +
       // 10 + 20 = 30
        Scanner sc = new Scanner(System.in);
        System.out.print("수1 : ");
        int su1 = sc.nextInt();
        
        System.out.print("수2 : ");
        int su2 = sc.nextInt();
   
        System.out.print("연산자 : ");
        String op = sc.next();
   
        switch (op) {
           case "+":         
           System.out.printf( "%d + %d = %d\n", su1, su2, su1 + su2);
               break;
               
           case "-":
            System.out.printf( "%d - %d = %d\n", su1, su2, su1 - su2);
               break;
               
           case "*":
            System.out.printf( "%d X %d = %d\n", su1, su2, su1 * su2); //출력용이니 X
               break;
               
           case "/":
            System.out.printf( 
                "%d / %d = %.2f\n", su1, su2, (float)su1 / su2); //float이므로 %d\n이 아니라 %f\n. 소숫점 둘째자리
               break;    
           
           default:
               System.out.println("연산자 오류");
               break;
        }//switch
    }//main
}
//String을 배워야 if문으로 작성 가능.