package ex2_socket;

import java.io.PrintWriter;
import java.net.Socket;

public class ClientMain {
    public static void main(String[] args) {



        try {
            Socket s = new Socket("192.168.0.46", 3000);
            //2교시. 여러분 IP 담으세요?    

            while(true){

                System.out.print("입력 : ");
                //공백을 포함해 여러 줄 받을 수 있는 메서드
                String msg = sc.nextLine();
                
                //키보드에서 받은 문자열을 서버로 보낸다
                pw = new PrintWriter( s.getOutputStream() );
                //pw.write(msg); 
                pw.println(msg); //write대신 println으로

                pw.flush();

            }//while

        } catch (Exception e) {
            
        } finally {
            try {
                if( pw != null ) pw.close();
                if( s != null ) s.close();

            } catch (Exception e) {
                
            }
        }
        
        
    }//main
}
