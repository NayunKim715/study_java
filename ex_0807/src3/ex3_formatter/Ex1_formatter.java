package src3.ex3_formatter;

public class Ex1_formatter {
    public static void main(String[] args) {
        //C언어의 문법을 java에서 차용

        //저의 나이는 20살 입니다
        int age = 20;
        //방법1 // System.out.println( "저의 나이는 " +age +"살 입니다" );
        System.out.printf("저의 나이는 %d살 입니다\n", age); //%d 정수가 들어갈 자리 만들다

        //저는 20살이고 3층에 살아요
        System.out.printf( "저는 %d살이고 %d층에 살아요\n", 20, 3); //엔터 안 쳐진 채 출력. 
        // println과 달리 printf는 강제로 엔터값 쳐놔야 한다. 

        //자릿수 맞추기. 한자리 숫자도 앞에 0을 붙여 두자리로. 애초에 두자리면 0을 안 붙이고 나옴. 03d, 04d도 가능  
        System.out.printf( "저는 %d살이고 %02d층에 살아요\n", 20, 3);

        //나는 박씨야 - 한글자를 바꾸고 싶어
        System.out.printf("나는 %c씨야\n", '박'); //이 문자를 채워줄 캐릭터값

        //나는 A형이야
        System.out.printf("나는 %c형이야\n", 'a');
        System.out.printf("나는 %C형이야\n", 'a'); //소문자를 대문자로 바꿔서 보여줌

        //원주율 : 3.141592
        System.out.printf("원주율 : %f\n", 3.141592);
        System.out.printf("원주율 : %2f\n", 3.141592); //소숫점 두자리까지만

        //저는 홍길동 입니다 - 문자열 출력
        System.out.printf(
            "저는 %s 입니다\n", "홍길동");
        // %s는 무슨 type이든 다 받을 수 있긴 하다. 1, a, 3.14. 왠만하면 구별해 집어넣는 습관 

        
        /*
        System.out.printf(
            "%s %d %d\n", "김윤", 100, 95);
        System.out.printf(
            "%s %d %d\n", "김길동", 100, 7); //라인 정렬이 아쉽다.
         */
        System.out.printf(
            "%s\t %d\t %d\n", "김윤", 100, 95);
        System.out.printf(
            "%s\t %d\t %d\n", "김길동", 100, 7); 
        //Tab키를 누른 만큼의 공간을 강제로 확보한다. Tab키보다 긴 것은 정렬 어긋날 수 있다.

        //오늘 강수량은 15%입니다
        //System.out.printf("오늘 강수량은 %d%입니다\n", 15);//오류난다
        //15라는 정수값이 %d까지 들어가는데는 문제없다. formatter는 %가 들어오면 직접 퍼센트라는 문자를 찍겠다는 것은 모름.
        //type을 담는 그릇이 아니라 %라는 문자를 찍고 싶으면 %를 2개 넣어야 한다.
       System.out.printf("오늘 강수량은 %d%%입니다\n", 15);


    }//main
    
    /*
    formatter의 문법
    \n : 강제개행
    %d : 정수
    %c : 문자
    %f : 실수(소숫점을 가지는)
    %s : 문자열
    %% : %특수문자
    */

}
