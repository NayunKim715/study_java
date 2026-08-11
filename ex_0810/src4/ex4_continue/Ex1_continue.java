package src4.ex4_continue;

public class Ex1_continue {
    public static void main(String[] args) {
        
        //continue문 :
        //반복문 내에서 특정 코드를 건너뛰고자 할 때
        for( int i = 1; i <= 2; i++ ){

           for( int j = 1; j <= 5; j++ ){

               //j++; // for안에서 j++를 빼서 쓰면, 결과 3 5 두줄

              //if( j % 3 == 0 ){
                 //continue;
                 //continue도 break처럼 그 밑에 어떤 코드도 넣으면 안 됨.
              //}//여기까지 하면 1 2 4 5 두 줄 

              if( j % 2 == 0 ){ //2의 배수 안 찍으려고 만든 코드
                 //for문안에서 continue를 만나면
                 //가까운 for문의 증감식으로 넘억나다
                 //for문에 증감식이 없다면 조건식으로 간다
                continue;
              }
             System.out.print(j + " ");//이것만 치면1~5까지가 두 줄 나옴
           
           }//inner
           System.out.println();
       }//outer
   }//main
}

//i=1 j =1 -> 1
//2의 배수 건너뛰고 j=3출력
//4 건너뜀 
//j=5출력