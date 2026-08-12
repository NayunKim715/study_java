package ex1_array;

public class Ex2_array {
    public static void main(String[] args) {
        //배열 선언 + 생성 + 초기화
        int[] ar = {1, 2, 3, 4, 5}; //배열은 중괄호로 값을 넣을 수 있다

        //1 2 3 4 5
        for(int i = 0; i < ar.length; i++) {

        //100 200 300 400 500    
            ar[i] = (i + 1) * 100;//for문에서 값을 바꿈    
            System.out.print(ar[i] + " "); //print( ar )라고 찍는 경우는 없다.
        }//for

        System.out.println(); 
        System.out.println("----------------");

        //개선된 루프
        //세로로 100 ~ 500. 앞의 for문에서 값이 바뀐 상태로 개선된 루프를 만남
        for( int n : ar ){
            System.out.println( n ); 

        }//for

    }//main
}
