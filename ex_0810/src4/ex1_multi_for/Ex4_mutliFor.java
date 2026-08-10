package src4.ex1_multi_for;

public class Ex4_mutliFor {
    public static void main(String[] args) {
        
        //* * * * *
        //1 2 3 4 5
        //* * * * *
        //1 2 3 4 5
        //* * * * * 
        // i값이 홀수 일 때는 별 표시, 나머지 상황에서는 숫자 찍는다
        for ( int i = 1; i <= 5; i++ ) {
           for ( int j = 1; j <= 5; j++ ) {

             if ( i % 2 == 1 ) {
                System.out.printf("* ");
                //System.out.printf(" * "); -> 줄 엇갈림
             }else{
                System.out.printf(j + " ");
             }

           }//inner
            System.out.println();
        }//outer

    }//main
}








  
       
        