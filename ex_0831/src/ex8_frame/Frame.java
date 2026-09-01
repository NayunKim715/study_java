package ex8_frame;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;

public class Frame {
    public static void main(String[] args) {
        Button noBtn = new Button("아니오");
        yesBtn.setBounds(30, 100, 105, 40);
        noBtn.setBounds







         dispose();



        //생성자

        //예, 아니오 버튼이 참조할 감지자 생성
        ActionListener act = new ActionListener() {
            //인터페이스는 추상메서드 필요. 인터페이스는 직접적인 메모리 할당을 하지 않으므로
            public void actionPerformed(java.awt.event.ActionEvent e){
                switch ( e.getActionCommand() ) {
                    case "예":
                        System.exit(0);//전체프레임 종료
                        break;
                
                    case "아니오":
                        dispose();
                        break;
                }//switch
            }

            }
         };

    }//main
    
}

//선생님 그림판 설명
//프로젝트는 프레임을 써서 결과 만들게 된다

//9월 1일 1교시 지각