package ex3_form;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class FormMain {
   public static void main(String[] args) {
      Frame f = new Frame();
      f.setBounds(500, 200, 400, 600);
      f.setBackground( Color.CYAN );
      f.setLayout(null);//자동배치 끄기

      Font font = new Font("", Font.PLAIN, 30);

      //최상단
      TextField tf = new TextField();
      tf.setFont(font);
      tf.setBounds( 10, 30, 280, 35 );

      //텍스트 필드 옆에 버튼 하나
      Button btn = new Button("입력");
      btn.setEnabled(false);//버튼 비활성화 - 나중에 true값 들어가기 전까지는 클릭 못함
      btn.setBounds(300, 30, 80, 35);

      //중앙단
      TextArea ta = new TextArea();
      //엔터를 치며 많은 데이터를 담을 수 있도록 만든 컴포넌트
      ta.setFont(font);
      ta.setBounds(10, 70, 380, 450);
      ta.setEditable(false);//ta에 직접 값을 입력할 수 없다

      //최하단
      Button btnSave = new Button("저장");
      Button btnClose = new Button("종료"); //x버튼 눌러도 되지만 종료버튼 따로
      btnSave.setBounds( 45, 530, 150, 50 );
      btnClose.setBounds( 205, 530, 150, 50 );

      //텍스트 필드에 내용 들어가 있으면 입력 버튼 활성화, 없으면 비활성화

      //tf에 값이 들어간 경우를 감지
      tf.addTextListener( new TextListener() {
        //인터페이스라서 추상메서드 하나 오버라이드
        public void textValueChanged(java.awt.event.TextEvent e) {
            //System.out.println("안녕");
            if( tf.getText().trim().equals("") ){
                //  aaa -> trim으로 앞뒤 공백 제거하고 aaa만 남음

                //버튼클릭 비활성화
                btn.setEnabled(false);
            }else{
                //버튼클릭 활성화
                btn.setEnabled(true);
            }
        };
      });

      //입력버튼에 클릭을 감지
      btn.addActionListener( new ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
            //ta.setText( tf.getText() ); //setText는 지금은 부적합
            ta.append( tf.getText() + "\n" );
            //엔터값을 포함한 필드에 담긴 내용을 area로 보낸다.
            
            //area로 옮겨간 필드 내용 비움
            tf.setText("");

            //다음 것 입력하기 편하게 커서가 tf로 옮겨짐
            tf.requestFocus();
        };
      } );

      //tf에서 키보드의 엔터값을 감지
      tf.addKeyListener( new java.awt.event.KeyAdapter() {
        //KeyAdapter도 메서드를 가지고 있다. 오버라이딩
        public void keyTyped(java.awt.event.KeyEvent e) {
            if( e.getKeyChar() == java.awt.event.KeyEvent.VK_ENTER ){
                ta.append( tf.getText() + "\n" );
                tf.setText("");
                tf.requestFocus();

            }
        }
      } );
      
      //종료버튼 클릭 감지
      btnClose.addActionListener( new ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
            System.exit(0);
        };
      } );

      //저장버튼 클릭 감지
      btnSave.addActionListener( new ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
            String msg = ta.getText();

            FileWriter fw = null;
            //빠르게 하고 싶어 버퍼링 원함
            BufferedWriter bw = null;

            try {
                FileDialog fd = new FileDialog(f, "저장", FileDialog.SAVE);
                //다이얼로그 : 팝업창처럼 화면에 올라오는 공간
                fd.setVisible(true);

                //저장하고 싶은 곳
                String path = fd.getDirectory() + fd.getFile();
                System.out.println( path );
                //저장할때 확장자 .txt 까지 

                //msg를 저장
                fw = new FileWriter(path);
                bw = new BufferedWriter(fw);
                //객체를 저장하는 게 아니라서 ObjectStream 불필요
                bw.write(msg);

                bw.flush();//안전빵

            } catch (Exception e2) { //감지자의 e와 catch 구문의 e가 겹쳤다
            } finally{
                //열려 있는 스트림 역순으로 닫는다
                try {
                    if(bw != null) bw.close();
                    if(fw != null) fw.close();

                } catch (Exception e2) {

                }
            }
        }
      });

      f.add(tf);
      f.add(btn);
      f.add(ta);
      f.add(btnSave);
      f.add(btnClose);

      //강제로 프레임 크기를 조정하지 못하도록 설정
      f.setResizable(false);

      f.setVisible(true);
        f.addWindowListener( new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e){
                System.exit(0);
            }
        });
    
   }//main 
}
//import java.awt.event.KeyEvent;라고 치면 The import java.awt.event.KeyEvent is never used
//KeyEvent라고만 치면 상단의 import가 문제되지 않는다.