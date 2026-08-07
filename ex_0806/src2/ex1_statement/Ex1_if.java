package ex1_statement;

public class Ex1_if {
    public static void main(String[] args) {

        //제어문 - 프로그램의 흐름을 제어하는 문장
        //분기문과 반복문으로 나뉜다
        //분기문 : if, switch
        //반복문 : for, while, do-while

        //if문
        //if( 조건식 ){
        //   조건식이 참일 때 실행되는 영역
        //}

        //int n = 50;
        
        //String은 쌍따옴표 안에 여러글자(문자열)를
        //저장하기 위한 자료형
       
        //String str = "안녕하세요";
        //String str = null; 식당 자체 철거
        String str = ""; //null보다 빈 값으로 초기화 하는 것을 선호

        //조건식 : 결과가 참이나 거짓으로만 나오는 질문
        /*if( n == 50 ){
         str = "n은 50입니다"; //참이면 if문 괄호 안으로 들어와서 코드 실행하고 나간다. 
            // str 값이 바뀜. 안녕하세요가 아닌 n은 50입니다.
       }*/
        
                /*if( n != 50 ){
           str = "n은 50입니다"; //조건식이 거짓이면 안으로 들어오지 못하고 ban
           //if문을 무시하고 그대로 내려와 str이 바뀔 기회가 없다.
        }*/   
         
        int n = 49;   
        if( n == 50 ){
            str = "n은 50입니다"; // n=50이면 참이니 str값이 바뀜.
        }
        
        if( n != 50 ){
            str = "n은 50이 아닙니다";//거짓이니 얘는 못 만남. n=49이면 참.
        }
        // 위의 if문 둘 중 하나를 만나도, "안녕하세요"는 절대 나오지 않는다

        System.out.println(str);

    }
}
// Crtl K. 아래 코드에 대해 주석 달아줘.