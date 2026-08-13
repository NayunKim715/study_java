package ex_work;

public class Ex2_work {
    public static void main(String[] args) {
        //배열 arr에서 3의 배수를 제외하고 출력
        //-------------------
        //05 11
        //20 22
        //07 08
        int[][] arr = { { 9, 5, 11, },
                        { 12, 20, 21, 22 },
                        { 7, 8, 9 } };       
        
        for( int i = 0; i < arr.length; i++ ){
            for( int j = 0; j < arr[i].length; j++ ){
                if( arr[i][j] % 3 != 0 ) //i행 j열의 값은 계속 바뀜. 3의 배수가 아닐 때만 if문으로 들어올 수 있다.                   
                /*if( arr[i][j] % 3 == 0 ) 
                    continue;
                도 가능. 3의 배수이면 위로 보내버림. */
                System.out.printf("%02d ", arr[i][j]); //두 자리 맞춰 출력
            }//inner
            System.out.println();
        }//outer

        //3의 배수만 따로 출력하고 싶으면 이중for문을 추가로 짜야 함.
        System.out.println("-------------");

        for( int i = 0; i < arr.length; i++ ){
            for( int j = 0; j < arr[i].length; j++ ){
                if( arr[i][j] % 3 == 0 ) 
                System.out.printf("%02d ", arr[i][j]); 
            }//inner
            System.out.println();
        }//outer
    }//main
}