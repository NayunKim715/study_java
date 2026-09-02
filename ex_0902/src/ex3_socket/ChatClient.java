package ex3_socket;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.io.BufferedReader;
import java.io.PrintWriter;

import javax.swing.Action;

//public class ChatClient extends Frame, Thread{ //자바는 단일?
public class ChatClient extends Frame implements Runnable{    
    //Frame을 이미 상속받고 있는 상태라도, Runnable로 추가로 인터페이스를 구현하는 건 문제 없다
    
    TextArea area;
    TextField input;
    Button send_bt;

    //서버접속 및 데이터 전달용 객체
    Socket s;
    BufferedReader in;
    PrintWriter out;
    Thread t;

    public ChatClient(){
        setBounds(500, 200, 400, 500);
        setLayout(null);//자동배치 끄기
        
        area = new TextArea();
        area.setBounds( 10, 30, 380, 400 );

        input = new TextField();
        input.setBounds( 10, 450, 300, 20 );

        send_bt = new Button("전송");
        //한줄 놓침

        add(area);
        add(input);
        add(send_bt);

        //전송버튼 클릭감지
        send_bt.addActionListener( new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                sendData();//서버로 메시지 전달
            }
        });

        setVisible(true);
        addWindowListener( new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e ){
                System.exit(0);
            }
        });

    }//생성자

    //서버접속
    private void connected(){

    }


    @Override
    public void run() {

        while (condition) {
            try {
                String msg = in.readLine();

                if (condition) {
                    
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

        
    }

    
}
