package src4.ex4_continue;

public class Ex2_continue {
    public static void main(String[] args) {
        for( int i = 1; i <= 5; i++ ){
          switch( i ){
            case 1:
                System.out.println("case 1");
                break;

            case 2:
                System.out.println("case 1");
                continue; //break 대신 continue 씀.   


          }//switch

        }//for

    }//main
}
