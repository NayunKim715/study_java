package ex8 interface;

import java.awt.event

public class MyEvent {
    public static void main(String[] args) {

        Frame f = new Frame();
        Button btn = new Button("버튼"); //label:

        f.setSize(300, 300); //wiedth height
        f.add(btn);
        f.setVisible(true); //b:

        //버튼클릭을 감지하는 익명 내부클래스인
        //ActionListener()라는 이름의 interface
        btn.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                //System.out.println("안녕하세요");
                System.exit(0);

            };

        } );


        
    }//main
}
