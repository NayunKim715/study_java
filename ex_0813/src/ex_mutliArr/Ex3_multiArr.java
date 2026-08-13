package ex_mutliArr;

public class Ex3_multiArr {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2 },
                        { 3, 4, 5 }, 
                        { 6, 7, 8, 9 } };

        for( int i = 0; i < arr.length; i++ ){ //i<3도 가능
            for( int j = 0; j < arr[i].length; j++ ){ //j<4는 100%오류. 없는 방으로 접근하게 됨.
                //돌아가는 횟수를 맞춰야. i=0일 때 j=0,1 / i=1일 때 j=0,1,2
            System.out.print( arr[i][j] + " " );
            }//inner
            System.out.println();
        }//outer
    }//main
}

/* arr.length = 3
arr[0]lenght = 2
arr[1]lenght = 3
arr[2]lenght = 4
*/