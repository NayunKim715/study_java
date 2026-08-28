package ex3_runnable;

public class ThreadSub implements Runnable{ //러너블이라는 인터페이스
    //인터페이스는 상수 아니면 추상 메서드

    @Override
    public void run(){
        for( int i = 0; i < 10; i++ ){
            try{
                Thread.sleep(1000); //1초 대기시간
                System.out.println(i);

            }catch (Exception e) {

            }

        }//for
    }
    
}
