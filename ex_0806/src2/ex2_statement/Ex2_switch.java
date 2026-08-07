package ex2_statement;

public class Ex2_switch {
    public static void main(String[] args) {
        
        String str = "C"; //A,B,C,D,F모두 가능. S는 조건값에 상정 안 되어 있음. 이 때를 대비해 default를 쓰는 편.
        String res = "";

        switch( str ){//비교값
        
           case "A"://조건값
               res = "90 ~ 100";
               break; // break;를 지우고 str = "A". break를 만날 때까지 무조건 내려감. 그래야 switch 나감
               //따라서 A를 입력해도 B에 해당하는 성적이 출력된다. 

           case "B":
               res = "80 ~ 89";
               break;
               
           case "C":
               res = "70 ~ 79";
               break;
            
           case "D":
                res = "60 ~ 69";
                break;
           
           case "F":
               res = "59점 이하";
               break;
            
           default:
              res = "올바른 성적을 입력"; //내가 준비하지 않은 데이터 입력에 대해서도 처리할 방법
              break;

        }//switch

        System.out.println(res);

    }//main
}
