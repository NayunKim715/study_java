package ex1_statement;

public class Ex3_else_if {
    public static void main(String[] args) {
        
        //다중 if문( else if )
        //여러개의 조건 비교가 필요한 경우 사용하는 if문

        //if( 조건식1 ){
        //  조건식1이 참일 때 실행되는 영역 
       //}else if( 조건식2 ){
       //   조건식2가 참일 때 실행되는 영역
              
       //int num = 75;
       int num = 99;
       String str = "";

       if( num >= 90 ){ 
           str = "A"; //거짓이라 실행 못함

       }else if( num >= 80 ){
        str = "B"; //거짓이라 실행 못함

       }else if( num >= 70 ){
        str = "C"; //참이라 실행. 비어있던 str에 C가 들어감
        //중간에 참을 만나면 그대로 if문을 완전히 나가므로, 아래쪽으로 내려갈 일 없다. 참인 조건이 있어도 볼 일 없음.
        //if문이면 참이어도 다음 if문으로 들어감.

       }else if( num >= 60 ){
        str = "D"; 

       //}else if( num <= 59 ){
       }else{
          //위의 조건식들이 모두 거짓일 때 반드시 호출되는 조건
         str = "F";
       }
        
    System.out.println(str);

    //나이가 20이상 -> 성인요금
    //14이상 20미만 -> 청소년 요금
    //8이상 14미만 -> 어린이 요금
    //8미만 -> 유아요금

    int age = 15; 
        String str2 = ""; 
        
        if (age >= 20) {
            str2 = "성인요금";
        } else if (age >= 14){ 
            str2 = "청소년 요금"; //참을 만났으니까 끝.
        } else if (age >= 8) {  
            str2 = "어린이 요금";
        } else {                
            str2 = "유아요금"; //음수가 들어가도 유아.
        }
        
           System.out.println(str2);


    }//main
}//class
