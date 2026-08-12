package ex1_array;

public class Ex1_array {
    public static void main(String[] args) {
        //배열은 '같은 자료형끼리 모아둔 하나의 묶음'
        //효율적인 자료관리를 위해 반드시 필요하다
        
        int su1 = 100;
        int su2 = 200;
        int su3 = 300;
        int su4 = 400;

        /*
        System.out.println(su1);
        System.out.println(su2);
        System.out.println(su3);
        System.out.println(su4);
        //for문을 네 번 돌려도 출력할 때마다 이름을 바꿀 수는 없다 
        */

        //1)) 배열 선언
        int[] arr; //대괄호는 차원. []2개 2차원배열, 3개 3차원배열

        //2) 배열 생성
        arr = new int[4];
        //stack / heap 도표 2교시

        //3) 배열 초기화
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        //존재하지 않는 index에 접근할 수 없다.
        //arr[4] = 500;

        //배열의 모든 내용을 출력
        //1차원 배열 - 싱글 for문, 2차원 배열 - 이중 for문, 3차원 배열 - 삼중 for문
        //for( int i = 0; i < 4; i++ ){
        //for( int i = 0; i < 5; i++ ){ //존재하지 않는 방(4번 방)으로 접근하려는 자체가 문제
            //오류 이름 ArrayIndexOutOfBoundsException
        //index 수 변경하면 i < 숫자도 잊지 말고 바꿔야
        //개발자들은 유지보수 편하기 원함
        for( int i = 0; i < arr.length; i++ ){ //배열이름.length가 방의 갯수

            System.out.println( arr[i] ); 
            //index만 바꿔가며 출력하면 되니까 system out 여러번 쓸 필요 없다.

        }//for


        



    }//main
}
