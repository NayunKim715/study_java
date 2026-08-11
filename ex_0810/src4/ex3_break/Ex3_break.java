package src4.ex3_break;

public class Ex3_break {
    public static void main(String[] args) {
        int n = 1;

        while(true){

            System.out.println(n);
            n++;//이거 실행시키면 여원히 안 멈춤.

            if( n > 5 )
                break; //1~5까지 출력


        }//while

    }//main
}
