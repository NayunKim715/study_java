package src4.ex5_label;

public class Ex1_label {
    public static void main(String[] args) {
        
       //특정 반복문에 label을 붙여
       //한 번에 두 개 이상의 반복문을 제어할 수 있다.
       out : for( int i = 1; i <= 3; i++ ){

          for( int j = 1; j <= 10; j++ ){

            if( j % 2 == 0 ) //j=1일때 조건문 실행 못해 1찍음. -> j=2 조건 참, if문 참. 
                //break;//1만 세 번 찍힘
                //out이라는 label을 가진
                //바깥쪽 for문을 빠져난다
                break out;//

            System.out.print(j + " "); //1만 세 번 찍힘

          }//inner
          System.out.println(); 
        
       }//outer

    }//main
}
