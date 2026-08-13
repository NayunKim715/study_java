package ex_work;

import java.util.Scanner;

public class Ex3_work {
    public static void main(String[] args) {
        //키보드에서 입력받은 값보다 큰 첫번째 요소를 찾아 출력
        //------------------
        //입력 : 8 
        //결과 : 10
        int[][] arr = { { 1, 3, 4, 7 },
                        { 10, 2, 9, 3, 8 },
                        { 7, 4, 1 } };

        Scanner sc = new Scanner(System.in);                
        System.out.print("입력 : ");
        int num = sc.nextInt();

        out : for( int i = 0; i < arr.length; i++ ){
            for( int j = 0; j < arr[i].length; j++ ){

               if( arr[i][j] > num ){ 
                 System.out.printf("결과 : " + arr[i][j]);//이렇게만 쓰면 모든 걸 다 출력
                //if문을 통해 조건을 만족할 때만 출력하게 해야 함 
                 break out;//멀리 있는 바깥의 반복문까지 한 번에 나가게 한다. 이거 없으면 안쪽 for문만 나감.
               }
            }//inner

        }//outer
        
    }//main
}
