package ex1_choice;

import java.awt.*;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;

public class ChoiceMain {
    public static void main(String[] args) {

        Frame f = new Frame();
        f.setBounds(500, 100, 400, 300);
        f.setLayout(null);//자동배치 끄기

        Choice day = new Choice();
        day.add( "일요일" );
        day.add( "월요일" );
        day.add( "화요일" );
        day.add( "수요일" );
        day.setBounds(50, 50, 120, 0);

        //Choice객체에 감지자 등록
        day.addItemListener( new ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent e){
                System.out.println( day.getSelectedItem() );
            }
        } );

        //프레임에 Choice객체 추가
        f.add(day);

        f.setVisible(true);
        f.addWindowListener( new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e){
                System.exit(0);
            }
        });
        
    }//main
}
/*
분석:
1. day.addItemListener에서 익명 ItemListener 구현체의 메서드명이 itemsStateChanged인데,
   올바른 이름은 itemStateChanged입니다. (오타)
   - public void itemStateChanged(java.awt.event.ItemEvent e){ ... }

2. 익명 ItemListener 내부에서 day.getSelectedItem()을 사용했는데,
   day가 로컬 변수라서 익명내부클래스에서 명확히 final 또는 실질적 final로만 접근 가능하다.
   하지만 현재의 자바에서는 이 부분은 괜찮고, 큰 문제는 첫 번째 오타임.
*/

