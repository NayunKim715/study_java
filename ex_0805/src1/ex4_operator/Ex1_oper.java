package ex4_operator;

public class Ex1_oper {
    public static void main(String[] args) {
        
        //연산자(operator)
        //1.최고연산자 : . , ()
        //2.증감연산자 : ++, --
        //3.산술연산자 : + , - , * , / , %
        //4.시프트연산자 : >> , << , >>>
        //5.비교연산자 : >, < , >= , <= , == , !=
        //6.비트연산자 : & , | , ^ , ~
        //7.논리연산자 : && , || , !
        //8.삼향(조건)연산자 : ? , :
        //9.대입연산자 : = , *= , /= , %= , += , -=

        //1.산술연산자
        int n1 = 20;
        int n2 = 7;
        int n3 = n1 + n2;
        System.out.println("+연산 : " + n3);

        //나누기 연산자 : 몫
        n3 = n1 / n2; //앞에 자료형이 없으니 재활용. 27 버림
        System.out.println("/연산 : " + n3);

        n3 = n1 % n2; //나머지를 구하는
        System.out.println("%연산 : " + n3);

    }
}
