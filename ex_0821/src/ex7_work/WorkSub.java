package ex7_work;

public class WorkSub {
    public int getBigger( int[] arr ){
        int max = 0;

        for( int i = 0; i < arr.length; i++ ){
            if( arr[i] > max ){
                max = arr[i];
            }
        }//for
        return max; //for문 빠져나오면 max값이 가장 큰 값이니 그것을 반환
    }
}