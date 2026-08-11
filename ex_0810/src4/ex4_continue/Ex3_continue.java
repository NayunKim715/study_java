package src4.ex4_continue;

public class Ex3_continue {
    public static void main(String[] args) {
        int n = 0;

        while( n < 10 ){
          n++;

          if( n % 2 ==0 ){ //2의 배수를 출력 안 하고 싶어서 만든 코드
              continue; // 1 3 5 7 9
              //for문에서의 continue는 증감식으로 갔고
              //while문에서의 continue는 조건식으로 바로 간다.

          }
          System.out.println(n);

        }



    }//main
}
