package ex6_daemon;

public class SaveCls {
    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(3000);//3초 간격
                System.out.println("상태를 저장합니다");
            } catch (Exception e){

            }
        }//while
    }
}
