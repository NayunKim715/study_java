package ex6_work;

public class GradeSub {
    public int myPoint( String grade, int price ){ 
        //파라미터 잘 받고 정수값으로 return하는 게 중요

        if( grade.equalsIgnoreCase("vip")){ //대소문자 상관없이
           return price * 10 / 100; //10% 돌려줌
        }else if( grade.equalsIgnoreCase("gold")){
           return price * 5 / 100;
        }else if( grade.equalsIgnoreCase("silver")){
           return price * 3 / 100;
        }else{
            System.out.println("회원등급이 올바르지 않습니다");
            return 0;
        }    
    }//myPoint()
}
