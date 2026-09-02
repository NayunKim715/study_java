package ex3_socket;

import java.util.List;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer extends Thread{

    Serversocekt ss;
    List<CopyClient> list;

    public ChatServer(){

        try {
            //한줄 놓침
            ss = new ServerSocket(3500);
            System.out.println("서버시작");
            
        } catch (Exception e) {
            
        }

    }//생성자

    @Override
    public void run() {
        while(true){

            try {
                //접속자를 기다린다
                Socket s = ss.accept();
                String ip = s.getInetAddress().getHostAddress();
                System.out.println(ip + "님 접속");

            } catch (Exception e) {
                // TODO: handle exception
            }
        }//while

    }
    
}

//방금 접속한 클라이언트의 복사본을 만들어서
//리스트에 탑재
CopyClient cc = new CopyClient(s, this);
list.add(cc);
cc.start();

//접속한 모든 사용자가 메시지를 받을 수 있또록 하자
public void sendMessage(){

}//sendMessage()

//다른 사용자들에게 종료를 알리고 list에서 클라이언트를 제거
public void removeClient( CopyClient cc ){

    list.remove(cc);
    sendMessage(cc.ip + "님이 퇴장하셨습니다");

}

}