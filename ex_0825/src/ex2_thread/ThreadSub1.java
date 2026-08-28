package ex2_thread;

public class ThreadSub1 extends Thread { //Thread,Frame 동시 상속 못 받음
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            System.out.print("1");
        }//for
}
}