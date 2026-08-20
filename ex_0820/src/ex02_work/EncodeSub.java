package ex02_work;

public class EncodeSub {
    
    /* 남궁성 아저씨 암호표 */
    char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^',
                '&', '*', '(', ')', '-', '_', '+', '=', '|',
                '[', ']', '{', '}', ';', ':', ',', '.', '/' };

    char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y',
                'u', 'i', 'o', 'p' };

   //String result = "";
    StringBuffer result = new StringBuffer();

    public String encoding( String str ){
        for( int i = 0; i < str.length(); i++ ){
            char ch = str.charAt(i);
            
            if( ch >= 'a' && ch <= 'z' ){
            //result += abcCode[ ch - 'a' ]; //이 코드의 핵심!!!
            result.append( abcCode[ ch - 'a' ] );
                //                 99 - 97
                //                'c' - 'a'
            }else if( ch >= '0' && ch <= '9' ){
                //                 51 - 48
                //                '3' - '0'
               //result += numCode[ ch - '0' ];
               result.append( numCode[ ch - '0' ] );
            }

        }//for
        //return result;
        return result.toString(); //문자열구조로 반환
    }//encoding()

}
//어렵다