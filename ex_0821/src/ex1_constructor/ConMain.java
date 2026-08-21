package ex1_constructor;

public class ConMain {
    public static void main(String[] args) {
        //생성자 : 
        //객체가 생성될 때 메모리 할당을 위해 딱 한번 반드시 호출되는 것
        
        //ConSub cs = new Consub();
        //cs.Consub(); //일반메서드처럼 필요할 때마다 다시 불러다 쓰는 것 절대 불가

        ConSub[] cs = new ConSub[2];

        cs[0] = new ConSub();
        cs[1] = new ConSub();
    
        
    }//main
}
