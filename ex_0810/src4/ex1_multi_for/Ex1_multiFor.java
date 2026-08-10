package src4.ex1_multi_for;

public class Ex1_multiFor {
    public static void main(String[] args) {
       
       //1 2 3
       //1 2 3
       /*
       for( int i = 1; i <= 2; i++ ){ //y 세로 
        //이 지역변수 i는 inner for문에서 전역변수처럼 작용. 그래서 i 중복 사용 불가 

          for( int j = 1; j <=3; j++){ //x 가로

            System.out.printf("%d ", j);

          }//inner

          System.out.println(); //내용출력 없이 엔터만 한 줄 치는 코드
            
        }//outer
        */
       
        //1 2 3 4 5
        //1 2 3 4 5
        //1 2 3 4 5
        //세로로 3바퀴, 가로로 5바퀴 돌게 만든다.
        for( int i = 1; i <= 2; i++ ){
            
            for( int j = 1; j <= 5; j++){
            
                System.out.printf("%d ", j);

            }//inner
  
            System.out.println(); //내용출력 없이 엔터만 한 줄 치는 코드
              
          }//outer  

    System.out.println("-------------------");
 
       //5 4 3 2 1
       //5 4 3 2 1
       //5 4 3 2 1
       for( int i = 1; i <= 3; i++ ){
            
        for( int j = 5; j >= 1; j-- ){ //첫값을 5로 찍어야 하니 j 5부터 시작

            System.out.print( j + " ");
        }//inner

        System.out.println(); //줄바꿈 코드는 바깥쪽에서 

    }//outer
    //i=1, j=5 안쪽 참 -> 5 출력
    //j가 4로 감소. 참. 내려와서 -> 4 출력. 엔터를 친 적이 없기 때문에 옆에 찍힘 
    //j=3 참 3 출력 -> j=2 참 2 출력 -> j=1  참 1 출력
    //j=0되면 안쪽 끝, 빠져나옴. 줄바꿈 코드가 기다리고 있음.
    //i 증가시키려 바깥쪽 for문 올라감.
    //안쪽으로 들어오면 0까지 줄어들었던 j가 다시 5로 초기화. 아까의 반복



    }//main
}

/* i=1, j=3 -> 바깥쪽 for문 먼저 -> i가 1로 초기화 -> 조건식 참 
->안쪽 for문으로 들어옴. 이 시점에서 바깥쪽 for문의 존재는 잠시 잊는다.
->j를 1로 초기화 -> 조건식 참
-> 안으로 들어옴. print => 1 ->안쪽 for문의 증감식으로 감 j=2, 출력 -> 안쪽 for문의 조건식으로.
-> j=3, 출력
-> j=4. 조건 거짓이라 안쪽 for문 빠져나옴.
-> 엔터치고 나서 바깥쪽 for문의 증감식으로 감. 바깥쪽 for문은 2회전을 준비.
-> i가 증가되어 2로 바뀜. 조건식 참 -> 안쪽으로 들어와 for문 다시 만남.
j초기화 되어 i=2, j=1 -> 1 찍힘
i=2, j =2 -> 2 찍힘
i=2, j=3 -> 3찍힘
j=4 거짓 -> 안쪽 for문 빠져나와 엔터 한번. 바깥쪽 for문은 아직 거짓 나온 적 없어 안 끝남.
-> i=3으로 증가. 이 시점에서 바깥쪽 for문이 거짓이 되어 나온다.
바깥쪽 for문은 2바퀴, 안쪽 for문은 총 6바퀴를 돈 것. 

*/