package ex2_listener;

import java.awt.*;
import java.awt.event.WindowListener;

public class FrameMain {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setLocation(600, 200);
        f.setSize(300, 200);

        //생성된 프레임의 우상단 메뉴에 대한 클릭을 감지
        //괄호 안에 넣을 lister라는 감지자를 만든다
        WindowListener listen = new WindowListener() {
            //Ctrl K 추상메서드 오버라이드 해줘. 
            @Override
            public void windowOpened(java.awt.event.WindowEvent e) {}

            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.out.println("종료를 시도함");
                System.exit(0);
            }

            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {}

            @Override
            public void windowIconified(java.awt.event.WindowEvent e) {}

            @Override
            public void windowDeiconified(java.awt.event.WindowEvent e) {}

            @Override
            public void windowActivated(java.awt.event.WindowEvent e) {}

            @Override
            public void windowDeactivated(java.awt.event.WindowEvent e) {}
   
        };
        f.addWindowListener( listen ); //listen을 담아야 정상적으로 메모리 할당

        f.setVisible(true);
    }//main
}
//X표시 눌러도 프레임 종료 안 되는 이유. X버튼 눌렀을 땐 다른 걸 하고 싶은 경우