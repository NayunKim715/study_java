package ex07_work;

public class PrintGraph {
    public void print( int[] arr){
       for( int i = 0; i< arr.length; i++ ){ //arr.length=10
           System.out.print( i + "의 갯수 : " );
           //그래프 그려야되서 for문 한 개 더
           for( int j = 0; j < arr[i]; j++ ){
            System.out.print("#");
           }//inner
           System.out.println(" " + arr[i]);

       }//outer
    }
}
