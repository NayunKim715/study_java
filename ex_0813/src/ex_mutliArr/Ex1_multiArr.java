package ex_mutliArr;

public class Ex1_multiArr {
    public static void main(String[] args) {
        int[][] test = new int[2][3]; //stack heap
        test[0][0] = 100;
        test[0][1] = 200;
        test[0][2] = 300;

        test[1][0] = 400;
        test[1][1] = 500;
        test[1][2] = 600;
        
        //test[2][0] = 700; //없는 방에 접근 오류. 배열 다루면서 가장 흔한 오류
        //큰 방 index 2개니까 0과 1만 가능

        for( int i = 0; i < test.length; i++ ){ //큰방의 갯수. i<2도 OK
           for( int j = 0; j < test[i].length; j++ ){ //작은 방의 갯수 = 각 1차원 배열의 index수. j<3도 OK
            System.out.print( test[i][j] + " " );
           }//inner

           System.out.println();
        }//outer

    }//main
}
/*
i=0, j=0 1 2 -> 100 200 300
j=3 거짓
i=1 j=0 1 2 -> 400 500 600
*/