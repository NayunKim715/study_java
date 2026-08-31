package ex3_listener;

import java.awt.Frame;

public class FrameMain {
    public static void main(String[] args) {
        Frame f = new Frame();
        //f.setSize(300, 300);
        //f.setLocation(500, 200);
        f.setBounds(500, 200, 300, 300);
        //Size와 Location을 한 번에 넣을 수 있는 메서드

        //우상단 x버튼 클릭 감지
        f.addWindowListener( new MyEvent() );

        f.setVisible(true);
    }//main
}
