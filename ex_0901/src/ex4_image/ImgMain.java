package ex4_image;

import java.awt.*;
import java.awt.event.WindowAdapter;
import javax.swing.*;

public class ImgMain {
    public static void main(String[] args) {

        Frame f = new Frame();
        f.setLayout(null);//자동배치 끄기

        //f.setBounds(500, 100, 500, 500);
        f.setBounds(500, 100, 700, 1300);

        //이미지 참조(배경용)
        ImageIcon img = new ImageIcon( "src/images/배경화면.jpg" );
        //확장자까지 가져와야. png는 투명한 것까지 같이 가져온다?
        
        JLabel jl = new JLabel( img );
        jl.setBounds( 10, 10, 500, 500 );
        //놓쳤나?

        //이미지(버튼)
        ImageIcon img2 
         = new ImageIcon("src/images/cp.png");
        JButton imgBtn = new JButton( img2);
        imgBtn.setBounds( 50, 50, 175, 157);

        //버튼 배경 없애기
        imgBtn.setContentAreaFilled(false);

        f.repaint();//이미지 갱신

        f.add(imgBtn);
        f.add(jl);
        //배경에 이미지 들어오지만, 프레임 넓히면 짤림. 
        //속성-자세히. 736*1300 -> 통째로 다 넣고 싶으면 원본 이미지에 맞춰 프레임 제작
        f.add(jl);

        f.setVisible(true);
        f.addWindowListener( new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e){
                System.exit(0);
            }
        });
        
    }//main
}

//9/1 오후 3 