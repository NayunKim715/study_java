package ex2_statement;

public class Ex1_switch {
    public static void main(String[] args) {
        // swith-case문
        // 비교값과 조건값을 통해서 원하는 결과를 얻어내기 위한 제움ㄴ
        // 특정 값을 바로 찾아서 실행하기 떄문에 else-if에 비해 속도가 빠르다
        //스위치 문의 비교값으로는
        //1. 정수( byte, short, int) - long은 사용불가. 소수점 붙어있는 실수는 못 씀.
          //float n = 4F; 안됨.
        //2. 문자열(String)
        //3. 문자(char)

        // switch( 비교값 ){
        // case 조건값;
        // 비교값과 조건값이 일치할 때
        // break;
        // }

        // int n = 2;
        int n = 3;
        // int n = 4;

        switch (n) {// 비교값
        //조건식은 결과가 참 아니면 거짓이라서, boolean인데 스위치문에서 사용 불가
        // switch ( n >= 90 ) 안됨.
            case 1:// 조건값
                System.out.println("게임시작");
                break;

            case 2:
                System.out.println("설정");
                break;

            case 3:
                System.out.println("종료");
                break;

            default:
                // 비교값과 일치하는 조건값이 하나도 없을 때
                // 반드시 호출되는 영역
                System.out.println("올바른 값을 입력하세요");
                break;

        }// switch

    }// main
}
