package ex3_socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class CopyClient extends Thread{

    Socket s;
    BufferedReader in;
    PrintWriter out;
    ChatServer server;
    String ip;

    public CopyClient( Socket s, ChatServer cs ){
        this.s = s;
        this.server = cs;

        try {
            out = new PrintWriter( s.getOutputStream(), true ); //autoFlush: true
            in = new BufferedReader( 
                new InputStreamReader( s.getInputStream() ) );

            ip =  //한줄 놓침    
        } catch (Exception e) {
            // TODO: handle exception
        }

    }//생성자

    @Override
    public void run() {
        while( true ) {
            try {
                String msg = in.readLine();
                if( msg.equals( Util.ENDTOKEN ) ){
                    out.println( Util.ENDTOKEN );
                    break;
                }

                server.sendMessage();
                
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        
    }
    
}
