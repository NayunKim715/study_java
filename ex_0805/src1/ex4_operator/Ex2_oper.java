package ex4_operator;

public class Ex2_oper {
    public static void main(String[] args) {
        //대입연산자
        //특정 값을 변수에 전달하여 기억시킬 때 사용하는 연산자
        int n1 = 10;
        int n2 = 7;
        n2 += n1; //n2 = n2 + n1;
        System.out.println("n2 : " + n2);

        n2 -= 2; // n2 = n2 - 2; n2는 변수니까 7로 시작했어도 17로 바뀌었으니 이후로도 계속 17로 사용됨. 이제 17에서 15가 됨
        System.out.println("n2 : " + n2);

        n1 *= n1; //n1 = n1 * n1;
        System.out.println("n1 : " + n1);

        n1 /= 5; // n1 = n1 / 5;
        System.out.println("n1 : " + n1);
        
        n1 %= 3; //n1 = n1 % 3; 20 나누기 3 하면 몫은 6 나머지는 2
        System.out.println("n1 : " + n1);

        //비교 연산자
        //변수나 상수의 값을 비교하여 결과를 만드는 연산자
        int i1 = 10;
        int i2 = 20;
        boolean res = i1 < i2; //이 결과값을 변수에 담아줘야 오류가 안난다. 결과값 자료형은 boolean
        System.out.println("res : " + res); //i1이 i2보다 작습니까? 부등호가 바뀌면 값도 바뀐다. > 로 바꾸면 false 
        // 무조건 부등호가 먼저 들어가야 한다. 작거나 같습니다 <=
        // 코드 진행순서가 왼쪽에서 오른쪽이므로 <는 '작다'. less than(lt) >'크다' greater than(gt)

        res = i1 == i2; // 대입연산자가 이미 = 를 가져같기 때문. i1과 i2가 같습니까? =는 집어넣는다의 의미도 있고 같다는 의미도 있음.
        System.out.println("res : " + res);

        res = i1 != i2; //!는 not 니까 i= not equal. i1과 i2가 다른가요?
        System.out.println("res : " + res);
        }
}
