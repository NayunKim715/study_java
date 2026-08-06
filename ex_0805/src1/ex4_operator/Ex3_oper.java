package ex4_operator;

public class Ex3_oper {
    public static void main(String[] args) {
        //논리연산자
        //비교연산자를 통한 연산이 2개 이상일때 연결해주는 연산자
        int age = 30;
        int limit = 35;
        //&&(and)연산자
        //앞쪽 연산이 거짓이면 뒤쪽 연산을 수행하지 않는다
        //true && true = true
        //true && false = false
        //false && true = false
        //false && false = false
        boolean res1 = (limit - age) >= 5 && age > 30; //res라는 변수에 담는다. 참 거짓 담을 수 있는 자료형 boolean
        System.out.println("&&연산 : " + res1);

        boolean res2 = (limit - age) >= 5 && (age += 2) > 30;
        System.out.println("&&연산 : " + res2);
        System.out.println("age : " + age);

        boolean res3 = (limit - age) > 5 && (age += 2) > 30; //앞이 거짓이면 코드를 실행 못함. 그래서 34살이 아닌 32살로 뜬다.
        System.out.println("&&연산 : " + res3);
        System.out.println("age : " + age); 

        //||(or) 연산자
        int i1 = 10;
        int i2 = 20;
        //or연산은 앞쪽 연산이 참이면 뒤쪽 연산을 수행하지 않는다
        //false || false = false
        //false || true= true
        //true || false = true
        //true || true = true이
        boolean res = (i1 += 10) > 20 || i2 - 10 == 11; // 10+10=20 > 20 false 이므로 뒤에 코드 실행 안함.
        System.out.println("||연산 : " + res);

        // !(not)연산자
        //참을 거짓으로, 거짓을 참으로 변경하는 연산자
        System.out.println("!연산 : " + !res);
        //System.out.println(res); //not연산자는 !이 붙어있을 때만 바뀐다.

        res = !res;
        System.out.println(res); //이제부터는 ! 안 붙어있어도 영구적으로 값이 바뀜.

            }
}
