package ex1_method;

public class MethodTest {
    public void test1() {
        System.out.println("test1 메서드 호출");
    }

    /*
     * public void test2( int n ){
     * n++;
     * System.out.println("결과 : " + n); //n=101
     * }
     */
    // public String test2( int n ){
    public int test2(int n) {
        n += 100;
        System.out.println("결과 : " + n);

        // 나를 호출한 곳으로 return값을 딱 한개만 가지고 돌아간다.

        // return "메롱"; //void가 아니면 반드시 return이라는 키워드가 필요
        return n;
        // return n, 300, 400;
        // System.out.println("asaaa");
        }//return 바로 아래 괄호 닫혀야

    // public int test2( int n ){ - 오류나는 이유 놓침. 인강.
    // return 10;
}
