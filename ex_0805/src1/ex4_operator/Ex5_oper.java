package ex4_operator;

public class Ex5_oper {
    public static void main(String[] args) {
    
        //삼항(조건)연산자
        //하나의 조건식을 통해 발생하는 결과를 원하는 타입으로
        //반환할 수 있도록 하는 연산자
        int a = 10;
        int b = 15;
        int res = ++a >= b ? 100 : 200;//비교연산자를 통해 참 아니면 거짓의 결과를 얻는 조건식. 100은 조건식이 참일 때 가져가는 값, 200은 거짓일 때 가져가는 값
        // 참거짓 값을 바로 주는 게 아니니까, res가 정수를 담을 수 있는 타입
        // int res = ++a >= b ? true : 200는 불가.
        // 참일 때 결과값과 거짓일 때 결과값은 반드시 같은 형태여야 한다. 
        System.out.println("res : " + res);
 
        int n1 = 10;
        int n2 = 20;
        float res2= (n1 += n1) == n2 ? 3.14f : 5.19f; //실수타입인데 float에 담으면 오류남. 실수를 담는 기본 자료형이 double로 설정되어 있기 때문
        // n1 = n1 + n1 = 이제부터 20. 20 == 20 참.  
        System.out.println("res 2 : " + res2);
        // IF문으로 대체 가능하기 때문에 삼항연산자가 자주 쓰이진 않는다.

        a = 10;
        b = 12;
        char res3 = ++a >= b || (a - 8) + 7 <= b && 13 - b >= 0 && (a+=b) - (a%b) > 10 ? 'O' : 'X';
        // {11>12 false || 3+7<11 true && 1>0 true} true
                                             //true && a=a+b=23, a%b=23/12 나머지 11 => 둘다 참. O
        System.out.println("res 3 : " +res3);
        }//main
}//class end
