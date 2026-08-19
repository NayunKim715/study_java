package ex4_palindrome;

public class CheckWord {
    
    public String check( String str ){ //check메서드 쓰려면 메모리할당이 되어 있어야?
        String rev = ""; 
        for( int i = str.length()-1; i >= 0; i--){ 
           rev += str.charAt(i); 
        }//for

        return rev; //String type으로 반환하려면 void여선 안 된다.
    }


}
//어려움