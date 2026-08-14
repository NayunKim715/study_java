public class Ex04_work {
    public static void main(String[] args) {
        //1 ~ 100까지 반복하는 for문을 만들되
        //5의 배수만 출력
        for( int i = 1; i <= 100; i++ ){ //여기서 출력하면 1~100까지 다 나옴
           //조건이 맞을 때만 출력을 하도록 if문
            if( i % 5 == 0 ){ 
               System.out.println(i);
            }
        }//for
    }//main
}
