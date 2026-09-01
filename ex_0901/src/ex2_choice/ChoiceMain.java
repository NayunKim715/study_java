package ex2_choice;

import java.awt.*;
import java.awt.event.WindowAdapter;

public class ChoiceMain {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setBounds(500, 100, 500, 300);
        f.setLayout(null);//자동배치 끄기

        Choice region = new Choice();
        region.add( "지역선택" );
        region.add( "서울" );
        region.add( "경기" );//선생님
        region.add( "인천" );
        region.add( "광주" );
        region.add( "대구" );
        region.add( "대전" );
        region.add( "부산" );
        region.add( "제주" );
        region.setBounds(50, 50, 120, 0);

        //결과 보여줄 레이블 넣기
        Label resLabel = new Label("ㅁㅁㅁㅁㅁ");
        resLabel.setBounds(170, 200, 100, 30);

        //Choice객체의 변경을 감지하는 감지자 추가
        region.addItemListener( new ChoiceListener( resLabel ) );
        /*
        region.addItemListener( new ItemListener() {
            //인터페이스가 가지고 있는 오버라이딩 메서드가 필요
            public void itemStateChanged(java.awt.event.ItemEvent e) {
               String str = region.getSelectedItem();
               if( !str.equals("지역선택") ){
                   resLabel.setText(str + "을(를) 선택");
               }else{
                   resLabel.setText("");
               }
            };
        }); */

        f.add(resLabel);
        f.add(region);
        
        f.setVisible(true);
        f.addWindowListener( new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e){
                System.exit(0);
            }
        });
    }//main
}
