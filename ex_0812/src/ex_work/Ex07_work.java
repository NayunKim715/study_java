package ex_work;

public class Ex07_work {
    public static void main(String[] args) {
        
        //배열 arr을 오름차순으로 출력
        //-----------------
        //11 7 9 20 15 3
        //3 7 9 11 15 20
        int[] arr = {11, 7, 9, 20, 15, 3};

        System.out.print("원본배열 : ");
        for( int i = 0; i < arr.length; i++ ){
            System.out.print( arr[i] + " " );
        }//for

        System.out.print( "\n오름차순 : ");

        //배열 arr을 오름차순으로 정렬
        for( int i = 0; i < arr.length; i++) {

            for( int j = i; j < arr.length; j++ ){
               if( arr[j] < arr[i] ){
                //변수끼리 값 교환
                 int tmp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = tmp;
               }

            }//inner
                
        }//outer    

        for( int i = 0; i < arr.length; i++ ){
            System.out.print( arr[i] + " " );
        }//for
        
        System.out.println();

    }//main
}

/*arr={11, 7, 9, 20}
i=0,j=0 지금은 arr.length=방 갯수=4
i=0,j=1
i=0,j=2  j=3 j=4 -> 거짓
tmp = 11

i=1, j=1로 출발 j=2


*/
