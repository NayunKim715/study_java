package ex6_button;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class FrameMain {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setLayout(null);//자동배치를 끈다
        //2) 프레임 안에 있는 버튼이 위치와 크기값 적용받을 수 있게 됨
        f.setBounds(500, 200, 400, 400);

        Button btn1 = new Button("확인");
        btn1.setBounds(50, 100, 100, 150); // -> 1) 변화X

        Button btn2 = new Button("취소");
        btn2.setBounds(200, 100, 100, 100);
        //이제 노가다로 두 버튼 안 겹치게 조정

        //프레임에 버튼 추가
        f.add(btn1);
        f.add(btn2);

        //확인 버튼에 이벤트 감지자 추가
        //KeyListener ? 
        ActionListener act = new ActionListener() {
            //ActionListener가 가진 추상 메서드는 1개밖에 없다
           @Override
           public void actionPerformed(java.awt.event.ActionEvent e) {
           System.out.println("확인버튼 클릭함");
           }
   
        };

        btn1.addActionListener( act );

        //취소버튼에 감지자 추가
        btn2.addActionListener( new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
               System.out.println("취소버튼 클릭함"); 
            };
        } ); //동일한 act 넣으면?

        f.addWindowListener( new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
              System.exit(0);
            };
          } );

        f.setVisible(true);  
    }//main
}
