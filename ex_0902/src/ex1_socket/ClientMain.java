package ex1_socket;

import java.net.Socket;

public class ClientMain {
   public static void main(String[] args) {
    
     try {
        Socket s = new Socket("192.168.0.46", 3000); //선생님 아이피
        /* Window R
        ipconfig -> 내 PC IPv4 주소 : 192.168.0.13 */
     } catch (Exception e) {
        
     }
     
   }//main
}
