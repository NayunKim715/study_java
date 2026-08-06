package ex3_casting;

public class Ex1_casting {
    public static void main(String[] args) {
        //casting(형변환)
        //1. 프로모션
        // - 큰 자료형에 작은 자료형을 대입하는 것(자동)
        double d1 = 100.5; //8byte
        int n1 = 200; //4byte
        d1 = n1; // 뒤의 것이 앞으로 간다. d1에 100.5 사라지고 200이 들어감
        System.out.println("d1 : " + d1); //타입이 실수타입, 정수타입으로 다른데 오류 안 나는 이유는 소숫점 붙여버렸기 때문

        int n2 = 100; //4byte
        char ch = 'A'; //2byte
        n2= ch; // int 타입에 문자를 넣는 게 오류 안나는 이유는, 아시키코드를 근거로 정수로 바꿔 저장.
        System.out.println("n2 : " + n2);
    }
}    

