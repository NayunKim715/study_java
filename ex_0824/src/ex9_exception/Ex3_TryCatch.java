package ex9_exception;

public class Ex3_TryCatch {
    public static void main(String[] args) {
        
    //try{
        int[] arr = {10, 20, 30};
    
        for( int i = 0; i <= arr.length; i++ ){
            System.out.println( arr[i] );
        }//for
    //} catch (Exception e) {
    //}
        System.out.println("프로그램 정상종료");
    }//main
}

//try-catch는 반드시 써야하는 경우가 정해져 있다.