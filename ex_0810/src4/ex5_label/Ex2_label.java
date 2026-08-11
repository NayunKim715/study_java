package src4.ex5_label;

public class Ex2_label {
    public static void main(String[] args) {
        my : for( int i = 1; i <= 5; i++ ){
          switch( i ){
            case 1:
                System.out.println("case 1");
                break;               
          }//switch
          System.out.println("안녕"); //label 없으면 안녕 다섯번 출력

        }//for

    }//main
}
//switch에는 label 못줌
//label 붙이면 switch문도 원하는 곳에서 break문을 제어 가능하다
//안녕이 하나도 안 출력