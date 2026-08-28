package ex2_thread;

public class ThreadMain {
    public static void main(String[] args) {
        
        ThreadSub1 ts1 = new ThreadSub1();
        ThreadSub2 ts2 = new ThreadSub2();
        
        //메인과 별도로 동작하는 스레드가 2개 이상 - 멀티스레드
        ts1.start();//run()으로 호출하면 안 된다.
        ts2.start();
        
    }//main
}
