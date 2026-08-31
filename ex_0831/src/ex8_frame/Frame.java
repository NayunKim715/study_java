package ex8_frame;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;

public class Frame {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setLayout(null);
        Font font = new Font("궁서체", Font.BOLD, 30);

        //질문1
        Label q1 = new Label("종료할까요?");



        CheckboxGroup group = new CheckboxGroup();
        Checkbox yes = new Checkbox("y", group, true);
        Checkbox no = new Checkbox("n", group, false);
        yes.setBounds(50, 135, 100, 30);
        no.setBounds(160, 135, 100, 30);
        
        addWindowListener( new WindowAdapter() { 
              public void windowClosing(java.awt.event.WindowEvent e) {
              dispose();
            };
           } );

       setResizable(false);

       setVisible(true);

    }//main
    
}

//선생님 그림판 설명
//프로젝트는 프레임을 써서 결과 만들게 된다