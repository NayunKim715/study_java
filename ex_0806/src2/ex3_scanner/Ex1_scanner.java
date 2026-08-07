package ex3_scanner;

import java.util.Scanner; //import = 패키지가 다르면 허락 구함.class 밖으로 빼야 함 - 아주 중요!

public class Ex1_scanner {
    public static void main(String[] args) {
        
        //키보드에서 값을 받기위한 Scanner객체
        Scanner sc = new Scanner( System.in );

      //sc는 a,b로 고쳐도 됨. 
      System.out.print("정수 : "); //ln=line.ln으로 엔터를 쳐줬기 때문에 아랫줄에 나옴.
      //println 말고 print라고 치면 강제로 엔터 치는 일이 없어짐. 바로 옆에다 받을 수 있디.1
      int n = sc.nextInt(); //엔터를 치는 순간 변수를 넣음.
      System.out.println("값 : " + n); 

      System.out.println("문자열 : ");
      String s = sc.next();
      System.out.println("값 : " + s);

      
    }//main
}
