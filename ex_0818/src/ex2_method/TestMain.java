package ex2_method;

public class TestMain {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.average(100, 80, 70); // void로 되어있으면 res = 으로 받으려는 것 불가!
    }
}

/*
"void로 되어있으면 res = 으로 받으려는 것 불가!"라는 말씀은 
메서드가 void 반환형이면 값을 반환하지 않기 때문에
아래처럼 값을 변수에 받을 수 없다는 뜻입니다.

예시:

// void 반환형 메서드
void average(int a, int b, int c) {
    // ...
}

int res = t1.average(100, 80, 70); // 오류! 값을 반환하지 않으므로 받을 수 없음

// 올바른 방법(값을 받고 싶다면 메서드 반환형을 int 등으로 바꿔야 함)
int average(int a, int b, int c) {
    // ...
    return (a + b + c) / 3;
}

int res = t1.average(100, 80, 70); // 가능! 반환값을 res에 저장

즉, void는 반환값이 없기 때문에 'res = '처럼 값을 저장하려고 하면 컴파일 에러가 발생합니다.
*/