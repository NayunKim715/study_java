package ex1_thread;

public class ThreadSub extends Thread{

    @Override
    public void run() {
    //public void abc()    
        //프로세스의 독립적인 수행을 위한 영역
        for( int i = 0; i < 10; i++ ){

            //0.5초간 휴식
           try{
           Thread.sleep(500);
           }catch(Exception e){
            
           }

           System.out.println("스레드 실행중");
        }//for

    }
    
}

//8월 25일 1교시 지각. 0824에 새로 추가할 것 있음.
//다음주 수요일에 마무리