package ex9_frame;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;

public class NewFrame extends Frame{
    public NewFrame( Frame f ){

        setBounds( f.getX() + 100, f.getY() + 100, 300, 200 );
        setLayout(null);//자동배치 끄기
        setVisible(true);

        Font font = new Font("", Font.BOLD, 30);
        Label label = new Label("종료할까요?");
        label.setFont(font);
        label.setBounds(50, 50, 200, 30);

        //예, 아니오 버튼 추가
        Button yesBtn = new Button("예");
        Button noBtn = new Button("아니오");
        yesBtn.setBounds( 30, 100, 105, 40 );
        noBtn.setBounds( 165, 100, 105, 40 );

        //현재 프레임에 컴포넌트들 추가
        add(label);
        add(yesBtn);
        add(noBtn);

        addWindowListener( new WindowAdapter() { 
            public void windowClosing(java.awt.event.WindowEvent e) {
               dispose();
            }
        } );
   

    }//생성자
    
}
//시청중 0901