package ex5_work;

public class CalSub {

    //public void getResult(int su1, int su2, String op) {
    public int getResult(int su1, int su2, String op) {
        switch (op) {
            case "+":
                //System.out.println(su1 + su2);
                //break;
                return su1 + su2;
            case "-":
                //System.out.println(su1 - su2);
                //break;
                return su1 - su2;
            case "*":
                //System.out.println(su1 * su2);
                //break;
                return su1 * su2;
            case "/":
                //System.out.println(su1 / su2); // (float)su1 / su2 도 가능
                //break;
                return su1 / su2; //소숫점까지 같이 반환하려면 나누기용 메서드 따로 만들어야
            //결과를 메인으로 다시 돌려주는 형태
            
            default:
                System.out.println("연산기호가 올바르지 않습니다");
                return -1; //어쨌든 아무것도 안 보낼 수는 없다. -1돌려보내고 메시지 띄워주기로 합의
        }// getResult()
    }
}