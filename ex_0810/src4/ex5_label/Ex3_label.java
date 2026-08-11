package src4.ex5_label;

public class Ex3_label {
    public static void main(String[] args) {
        
       outer : for( int i = 1; i <= 3; i++ ){

           for( int j = 1; j <= 5; j++ ){

              if( j % 2 == 0 ){
                  continue outer;
              }

              System.out.println( j + " ");

           }//inner

           System.out.println();
       }//outer


    }//main
}
//continue를 그냥 쓸 때, label 달 때 어떻게 달라지는가
//어떨 때 나가는 break가 필요한가, 건너뛰는 continue가 필요한가