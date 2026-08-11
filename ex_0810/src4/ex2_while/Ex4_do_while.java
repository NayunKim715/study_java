package src4.ex2_while;

public class Ex4_do_while {
    public static void main(String[] args) {
        
        //do-while문 : //제어문 중 유일하게 세미콜론으로 종결
        //선 처리 후 비교 - 1회전은 묻지 않고 실행. 2회전부터는 while문과 동일.

        //int i = 11;
        int i = 9;

        do{

          System.out.println(i); //do를 만나면 무지성으로 들어와서 11 출력. 
          i++;
            
        }while( i <= 10 ); 
        //11이면 거짓이니까 while문 나옴.
        //9->참이니까 출력 -> while문 조건. 10 참 출력 -> 11 거짓

    }//main
}

