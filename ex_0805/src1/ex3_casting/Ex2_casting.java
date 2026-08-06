package ex3_casting;

public class Ex2_casting {
    public static void main(String[] args) {
        
        //2. 디모션
        // - 작은 자료형에 큰 자료형이 대입되는 것(자동 X)
        char c1 = 'D'; //2byte
        int n1 = c1 + 1; //4byte. D+1=69 promotion casting은 문제 없다

        //c1 = n1; 필연적으로 2byte 손실되므로 오류
        c1 = (char)n1; // 손실을 감수하겠다고 개발자가 작성해야
        System.out.println("c1 : " + c1);

        float f1 = 5.5F; //4.x
        int n2 = 0; //4byte
        // n2 = f1; 오류
        n2 = (int)f1; //소숫점 뒷자리 버리기 감수하겠다
        System.out.println("n2 : " + n2);
    }
}
