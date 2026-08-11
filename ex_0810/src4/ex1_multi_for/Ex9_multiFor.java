package src4.ex1_multi_for;

public class Ex9_multiFor {
  public static void main(String[] args) {

    /*
              * 
            * * *
          * * * * *
        * * * * * * *
     * * * * * * * * *
          (피라미드)
     */

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5 + i; j++) {

        //System.out.print("* "); // 여기까지만 하면 앞쪽 삼각형 불필요
        // (00)(01)(02)(03)
        // (10)(11)(12)
        // 안찍어도 되는 i와 j의 합은 3을 넘어가지 않는다. -> 이것을 코드로 적용
        // 별을 안 찍는 대신 자리는 마련을 해야 하므로
        // 3을 넘어가는 시점에서는 별을 출력
        // 3을 안 넘어가는 경우는 공백을 2개 출력. 원래의 별 자리 + 공백

        if (i + j > 3)
          System.out.print("* ");
        else
          System.out.print("  ");

      } // inner

      System.out.println();// 줄바꿈

    } // outer
  }// main
}// class

// 필요없는 것을 배제하는 규칙
