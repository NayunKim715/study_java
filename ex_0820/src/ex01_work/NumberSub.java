package ex01_work;

public class NumberSub {

    public boolean isNumber( String str ){

        for( int i = 0; i < str.length(); i++ ){
           char ch = str.charAt(i); //입력한 문자열의 i번째 문자 추출

            if( ch < '0' || ch > '9'){ //내가 추출한 문자가 아스키코드 0에 해당하는 값보다 작거나 9에 해당하는 값보다 크면
               //0 - 48번, 1 - 49번, 9 - 57번
            //알파벳, 특수문자같은 불순물 있으면 반드시 걸러지게 되어 있다. 반드시 fasle를 return하게 됨
            //str = "A12". A는 65로 숫자범위 안에 있는 게 아님. 그대로 false를 반환.
                return false;
            }
        }//for
        return true;
    }

}