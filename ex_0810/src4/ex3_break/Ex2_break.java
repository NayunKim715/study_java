package src4.ex3_break;

public class Ex2_break {
    public static void main(String[] args) {
        for( int i = 1; i <= 3; i++ ){

           switch( i ){
              case 1:
                System.out.println("case 1");
                //switch문의 break는
                //반복문이 아닌 현재 switch문을 빠져나가는
                //용도로 사용된다.
                break;
       
              case 2:
                System.out.println("case 2");
                break;
                // case 1 i의 값 : 1, case 2 i의 값 : 2 i의 값 : 3

           }//switch
           System.out.println("i의 값 : " + i);// for문 아래 이것만 있으면 1,2,3 차례로



        }//outer
    }//main
}
