package ex9_frame;

import java.awt.*;
import java.awt.event.WindowAdapter;

public class FrameMain {
    public static void main(String[] args) {
        
    Frame f = new Frame();
    f.setBounds(500, 200, 500, 400);
    f.setVisible(true);

    f.addWindowListener( new WindowAdapter() { 
        public void windowClosing(java.awt.event.WindowEvent e) {
           //System.exit(0);

           //종료를 위한 프레임 띄우기
           new NewFrame(f);
        }
     } );

    


    }//main
}
