package ex05_overload;

public class OverSub {

    //오버로딩은 메서드의 '중복정의'라고 한다
    //하나의 클래스 내에서 같은 이름을 가진 메서드가 여러개 정의될 수 있도록 하는 것
    //---오버로딩으로 인정되는 경우---
    //1) 파라미터의 갯수가 다른 경우
    //2) 파라미터의 타입이 다른 경우
    //3) 갯수와 타입이 같아도 순서가 다른 경우
  
    public void result(){
        System.out.println("인자가 없는 메서드");
    }

    public void result( int n ){ 
        //위의 메서드와 동일 이름이면 오류. 어느 것을 가져다 써야 할지 모르니까
        //publlic void resulT는 가능 대소문자까지 똑같이 중복되어야 문제
        //메서드 이름은 똑같아도 메서드의 파라미터 갯수 다르면 오버로드도 인정.
        //int 반환형은? 

        System.out.println("정수를 인자로 받는 메서드");
    }

    public void result( char c ){
        System.out.println("문자를 인자로 받는 메서드");
    }
    
    public void result( String s ){
        System.out.println("문자열을 인자로 받는 메서드");
    }

    public void result( int n, String s ){ // int aa 는 하등 쓸모없음. 타입만 보니까 중복
        System.out.println("정수, 문자열을 인자로 받는 메서드");
    }

    public void result( String s, int n ){
        System.out.println("문자열, 정수를 인자로 받는 메서드");

    }
}

//오후 3시