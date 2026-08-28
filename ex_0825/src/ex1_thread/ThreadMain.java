package ex1_thread;

public class ThreadMain {
    public static void main(String[] args) {
        
        ThreadSub ts = new ThreadSub();
        //ts.run(); //->스레드 실행중 열 번 나온 다음 main 스레드 종료
        //ts.abc();
        ts.start();//스레드 동작 -> main스레드 종료가 먼저 나오고 스레드 실행중 열 번

        try{
        Thread.sleep(1500); 
        }catch(Exception e){

        }
        System.out.println("main스레드 종료");
        // -> 스레드 실행 중 몇 개 -> main 스레드 종료 -> 다시 스레드 실행 중 몇 개

    }//main
}
