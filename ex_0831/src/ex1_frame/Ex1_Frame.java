package ex1_frame;

import java.awt.*;

public class Ex1_Frame {
    public static void main(String[] args) {

        Frame frame = new Frame();
        frame.setSize(400, 300);
        frame.setLocation( 500, 100 ); 
        frame.setBackground( Color.YELLOW );
        
        frame.setVisible(true); //꼭 true로 만들어야 눈에 보임
        //의도적으로 사라지게 할 때는 false로 할 수도 있다
    }//main
}