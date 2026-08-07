package ex1_statement;

public class Ex2_if_else {
    public static void main(String[] args) {
        //if-else문 : 하나의 조건식에 대해서
        //참일때와 거짓일 때를 모두 판단할 수 있는 제어문
        //int n = 49;
        int n = 40;
        String str = ""; //기본자료형이 아니라서 String 첫글자 대문자

        if( ++n >= 50 ){
           //조건식이 참일 때 실행되는 영역
            str = "n은 50 이상의 수";
        //++n=50이니 참. str 바뀜. if문 빠져나와 출력
        //n=40이면 거짓이어서 if문 실행 못함. 
        //그러나 조건이 거짓이라고 해서 조건문 안의 증감문이 무효화되지 않는다. n은 41이 됨.
        
        /*
        if( n < 50 ){//여기도 ++n으로 하면 n이 또 증가 
            str = "n은 50미만의 수";
        } */

        }else{
            //조건식이 거짓일 때 실행되는 영역
            str = "n은 50 미만의 수";
        }
        //if문 2개 만드는 것보다는 if-else문이 효율적. 조건을 하나만 주고 참이나 거짓이냐 모두 커버 가능.
        //굳이 생각 한번 더 해서 새 조건문을 만들 필요 없다.

        System.out.println(str);
       
        /*
        변수 age에 나이를 대입하고 30이상이면
        드실만큼 드셨군요를, 그렇지 않으면 조금더 드셔도 돼요를
        출력하는 if문을 구현
        */

        int age = 32; 
        String str1 = "";
        //str = ""; 로 재활용해도 됨.  
        
        if (age >= 30){
            str1 = "드실만큼 드셨군요";
        } else {
            str1 = "조금더 드셔도 돼요";
        }
            System.out.println(str1);

        //위의 30어쩌고 코드를
        //삼항연산자로 구현    
        
            age = 32; //재활용. int age = 32;로 자료형까지 반복하면 오류.
            //str = ""; 로 재활용해도 됨. 
            String str2 = (age >= 30) ? "드실만큼 드셨군요" : "조금더 드셔도 돼요";
            System.out.println(str2);
        //모든 삼항연산자는 if-else문으로 대체 가능하다.    

    }//main
}
