package ex5_static;

public class BankMain {
    public static void main(String[] args) {
        
        Bank b1 = new Bank( "신촌", "82-111-1111" );//무조건 파라미터 2개 받아야
        Bank b2 = new Bank("강남", "02-222-2222");
        Bank b3 = new Bank("역삼", "02-333-3333");

        //b1.interest = 0.1f; //신촌지점에서 이자율 0.1%로 바꿈

        //static은 클래스명. 형식으로 접근 가능
        //그래서 static변수는 private으로 잘 만들지 않음
        Bank.interest = 0.1f;

        b1.info();
        b2.info();
        b3.info();
        
    }//main
}
