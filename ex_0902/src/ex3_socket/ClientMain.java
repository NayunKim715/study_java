package ex3_socket;

public class ClientMain {
    public static void main(String[] args) {

        new ChatClient();


        //서버접속 메서드 호출
        connected();

        //전달될 메시지를 감지하기 위한 스레드를 실행
        t = new Thread( this );
        t.start();



        //전달받은 메시지를 기다렸다가 화면에 출력
        while( true ){

        }//while

        //열려있는 스트림들 닫기
        try {
            if(out != null).out.close();
            if(in != null)in.close();
            if(s != null )s.close();
            
        } catch (Exception e) {
            // TODO: handle exception
        }

        
    }//main
}
