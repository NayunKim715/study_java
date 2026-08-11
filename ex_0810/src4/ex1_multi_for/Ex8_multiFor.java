package src4.ex1_multi_for;

public class Ex8_multiFor {
    public static void main(String[] args) {
        /*
         * 1 2 3 4 5 6 7 8 9 10
         * 2 3 4 5 6 7 8 9 10 1
         * 3 4 5 6 7 8 9 10 1 2
         * ......
         * 10 1 2 3 4 5 6 7 8 9
         * (총 100개의 숫자 찍힘)
         */

        for (int i = 1; i <= 10; i++) {

            for (int j = 0; j < 10; j++) { // 코드 한 줄이라도 덜 쓰려고 j를 0으로 초기화
                // j를 2부터 시작하지 않기 위해 0으로 초기화 // j <= 9 도 됨.
                int num = i + j; // 지역변수를 만들어 i와 j를 더한다
                //System.out.print(num + " "); // 사다리꼴 모양으로 출력됨. 11,12,..가 나오기 때문
                // if문 없으니 num이 10이 넘어가는 상황 생김. if문으로 제어 필요.
                if (num > 10) {
                    num -= 10; // 10 넘어가면 10을 뺀다.
                } // if, for, while 문에서 실행코드가 딱 한 줄일 경우에는 중괄호 생략.
                  // 실행해야 할 영역이 두 줄 이상이면 무조건 중괄호.

                System.out.print(num + " "); 

            }
            System.out.println();
        }

    }//main
}
