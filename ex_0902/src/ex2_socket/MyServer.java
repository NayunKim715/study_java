package ex2_socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread{

    ServerSocket ss;

    public MyServer(){
        try {
            ss = new ServerSocket(3000);
            System.out.println("서버시작");

        } catch (Exception e) {
            
        }

    }//생성자

    @Override
    public void run() {

        InputStreamReader isr = null; //문자열 받을거라서
        BufferedReader br = null; //조금 더 빨리 읽고 싶어서


        //run 메서드 안에서 클라이언트들 기다리는 코드 작성
        while( true ){
            try {
                /*
                Scanner sc = new Scanner()....
                sc.next();
                while문 안에 있더라도 엔터 치고 값을 받아야
                */
                Socket s = ss.accept();
                //무한반복이라고 계속 도는 게 아니라 클라이언트들이 접속했을 때 아래로 내려간다?
                String ip = s.getInetAddress().getHostAddress();

                //클라이언트가 보낸 문자열을 읽어온다
                isr = new InputStreamReader( s.getInputStream() );
                br = new BufferedReader( isr );

                String msg = br.readLine(); //줄단위로
                System.out.println(ip + " : " + msg);

            } catch (Exception e) {
                
            } finally {
              try {
                  if( br != null ) br.close();
                  if( isr != null ) isr.close();
                
              } catch (Exception e) {
                
              }
            }

        }//while
        
    }
    
}
