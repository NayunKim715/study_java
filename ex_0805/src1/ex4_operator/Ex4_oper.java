package ex4_operator;

public class Ex4_oper {
    public static void main(String[] args) {
    
    //증감연산자
    //1씩 증가시키거나 1씩 감소시키는 연산자
    //선행증감과 후행증감의 차이를 알고있어야 한다
    int a = 10;
    System.out.println("a : " + ++a); //선행은 빠름. 즉석에서 11로 만들고 출력

    int b = 10;
    System.out.println("b : " + b++); //후행은 늦다. 10을 찍고 나서 증가. 지금은 적용을 안 하고 다음 term부터 쓸게.
    System.out.println(b); // 이걸 안쓰면 10으로 나온다.
    
    b++; //11. 다음부터 12
    ++b; //13
    --b; //12
    b--; //12. 다음부터 11
    --b; //10
    b++; //10. 다음부터 11
    --b; //10
    b++; //10. 다음부터 11
    System.out.println(++b); //11인데 ++ 만나면서 12가 됨

    }//main
}