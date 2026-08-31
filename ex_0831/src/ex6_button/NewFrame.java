package ex6_button;
import java.awt.Frame;
import java.awt.Color;

import java.awt.event.WindowAdapter;

public class NewFrame extends Frame{
    public NewFrame( Frame f ){
       // setBounds(100, 100, 200, 100);
       setBounds( f.getX() + 100, f.getY() + 100, 200, 100);
       //프레임의 위치가 바뀌어서 아주 동떨어진 곳에서 튀어나오지 않는다.

       setBackground(Color.YELLOW);

       addWindowListener( new WindowAdapter() { 
            //나에게 없으니 부모 것을 가져다 쓴다. this.addWindowListener 혹은 super.addWindowListener
           public void windowClosing(java.awt.event.WindowEvent e) {
              //열려있는 모든 프레임을 종료
              //System.exit(0);

              //현재 프레임만 단독으로 종료
              dispose();

            };
           } );

       //새로 생성되는 현재 프레임의 크기를 고정
       setResizable(false);

       setVisible(true);

       }//생성자    
}
