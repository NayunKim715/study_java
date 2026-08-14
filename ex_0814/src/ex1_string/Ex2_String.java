package ex1_string;

public class Ex2_String {
    public static void main(String[] args) {
        
        String str = "Hong Gil Dong";//암시적 객체 생성. 이름
        int index = str.length();
        System.out.println("str의 길이 : " + index);

        index = str.indexOf('G'); //위에 만들어준 정수 변수로 재활용해서 받는다
        System.out.println("맨 처음 문자 G의 위치 : " + index);
        
        index = str.indexOf("Gil");
        System.out.println("문자열 G의 위치 : " + index);

        index = str.lastIndexOf('o');
        System.out.println("마지막 문자 o의 위치 : " + index);

        /*주민번호
        String jumin = "801122-3344556"
        String jumin = "801122-334455-6"
        jumin.indexOf('-'); --> 6
        jumin.lastIndexOf('-'); --> 13 : 주민번호 잘못되었구나!
        */
        char res = str.charAt(6); //int 반드시 정수값
        //charAt으로 6번째 위치에 있는 문자를 가져옴.
        //IndexOf와 반대. 문자를 받아서 정수로 돌려줌 vs 정수를 받아서 문자로 돌려줌
        System.out.println("6번째 문자 : " + res);

        String ss = str.substring(1, 6); //정수값 2개 받음
        System.out.println( "잘라낸 문장 : " + ss );

        String apple = "apple"; // = "Apple"이라 쓰면 값이 아예 안 나온다
        //equals는 대소문자까지 동일해야만 같은값으로 인정
        if( apple.equals("apple") ){ //apple == "apple" 해도 똑같이 나오긴 한데, 임시로 만든 상수. 무조건 Stack에 잡힌다.
        //값이 아닌 주소 비교. String끼리는 == 로 절대 비교 안 함. 
           System.out.println( "사과");
        }

        if( apple.equalsIgnoreCase("apple")){
            System.out.println( "대소문자 상관없이 사과");
        //equalsIgnoreCase는 대소문자 구별 안함    
        }
        /* 기본적으로 영어를 위한 method 
        대소문자 없는 한국어에는 통용되지 않음.
        일본어 가타가나, 히라가나도 불가 */

        /* id : [  ]
           pw : [  ] 
        가입할 때 띄어쓰기 실수로 넣으면 짜증 */
        String password = "   1234   ";
        //System.out.println( password.length()); //안전장치. 공백도 count되었다고 경고.
        //trim()을 통해 문자열 앞 뒤의 의미없는 공백을 제거. 
        //그러나 중간 공백은 제거 못함
        String pwd2 = password.trim();
        System.out.println(pwd2 + "의 길이 : " + pwd2.length());
 
        //문자열로 작성된 숫자형태의 데이터를 실제 숫자로 바꿔주는 메서드
        String number = "100";//문자열이 정수처럼 생겼다.
        int num = Integer.parseInt( number );
        //문자열 100이 진짜 정수 100으로 바뀌어 들어간다.
        //삽화 설명 - Integer가 int를 포장. 기본자료형을 사용할 수 있게 해주는 부모 개념의 객체를 wrapper class라고 합니다. 
        System.out.println( num + 1 );

        //기본자료형의 Wrapper클래스. 클래스니까 전부 대문자로 시작
        //boolean -> Boolean
        //char -> Character
        //byte -> Byte
        //short -> Short
        //int -> Integer
        //long -> Long
        //float -> Float
        //double -> Double

    }//main
}
//너무 어려움. java.api 구글검색
//length, equals, equalsIgnoreCase, trim, Integer은 나중에도 많이 쓰인다.