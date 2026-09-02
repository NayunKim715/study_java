package ex1_socket;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer extends Thread{

    ServerSocket ss;
    
    public MyServer(){

        try {
            //서버소켓을 생성할 때 서비스를 위한 포트번호를 지정
            ss = new ServerSocket( 3000 ); 
            //보통 2000번 이후의 변호를 씀. 
            //PC OS에서 USB연결, 이더넷 연결에서도 사용됨.
            //클라이언트가 3001번으로 접근하면 안 됨?
            //3000번 포트를 누군가 쓰고 있으면 catch로 들어옴
            System.out.println("서버 준비 완료");

        } catch (Exception e) {
           
        }

    }//생성자

    @Override
    public void run() {
        while(true){//무한반복

            Scanner sc = new Scanner(System.in);
            PrintWriter pw = null;
            Socket s = null;

            try {
                //접속한 사용자의 정보를 받아둔다
                Socket s = ss.accept();

                //접속한 클라이언트의 ip정보 가져오기
                String ip = s.getInetAddress().getHostAddress();
                System.out.println(ip + "님 다녀감");
                
            } catch (Exception e) {
                
            }
            
        }//while
        
    }
}
