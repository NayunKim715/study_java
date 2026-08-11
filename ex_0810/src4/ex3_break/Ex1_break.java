package src4.ex3_break;

public class Ex1_break {
    public static void main(String[] args) {
       
        //break문 : 반복문 내에서 강제적으로
        //가장 가까운 반복문을 빠져나갈 때 사용 
        for( int i = 1; i <= 3; i++ ){
         
            for( int j = 1; j <= 10; j++ ){

                if( j % 2 == 0 ){
                   break; //2. 이거 치니 1만 세 줄 나옴
                   //System.out.println(12);
                   //break 바로 밑에는 어떤 코드도 들어오면 안 된다.
                }

                System.out.println(j + " "); //1. 이것만 치면 1~10까지를 세번 출력
                //if문 참 -> 이 코드는 break 밑이라 실행 안 됨.

            }//inner

            System.out.println();

        }//outer

    }//main
}
