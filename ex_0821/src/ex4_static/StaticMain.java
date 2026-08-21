package ex4_static;

public class StaticMain {
 
    int n;
    static String str;

    public void test1(){
        n = 10;
        str = "안녕";
    }

    public void test2(){
        //static메서드에서는
        //일반 변수의 참조가 불가능하다
        //n = 10;
        str = "안녕";

        int num = 100;
        //static메서드 안에서는
        //static변수를 정의할 수 없다. - 지역변수이던, 전역변수이던
        //static int num2 = 200;
       
        
    }
}
// num이 사용되지 않아 경고가 나는 것은, 지역변수이기 때문입니다.
// 반면 n(인스턴스 변수), str(클래스 변수)은 필드이므로 단순 대입만 해도 문제가 없습니다.
//
// 즉, 이런 식으로 test2 안에서
// int num = 100;                 // 지역변수, 쓰지 않으면 경고
// n = 10; str = "안녕";           // 필드, 안 써도 경고 안남
//
// 지역변수는 선언 후 반드시 '사용'되어야 하고,
// 필드는 쓰지 않아도 경고나 오류가 나오지 않습니다.