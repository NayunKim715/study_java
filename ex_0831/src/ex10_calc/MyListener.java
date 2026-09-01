package ex10_calc;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener{

    private String num1 = "";
    private String num2 = "";
    private String op = ""; //연산자
    private int res1 = 0;//결과1
    private float res2 = 0;//결과2(나누기 전용)
    private int phase = 0;//단계를 구별

    private Label lb;
    public void setLb(Label lb){
        this.lb = lb;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //16개 버튼마다 다른 동작 할 수 있도록 구분
        switch( e.getActionCommand() ){
            case "+": case "-": case "*": case "/":
                phase = 1;
                op = e.getActionCommand();
                lb.setText(num1 + " " + op + " " + num2);
                break;
            
            case "=":
                phase = 0;
                switch( op ){
                    case "+":
                        res1 = Integer.parseInt(num1) + Integer.parseInt(num2);
                        //레이블 문자열을 실제 정수값으로 바꿈
                        break;
                    case "-":
                        res1 = Integer.parseInt(num1) - Integer.parseInt(num2);
                        break;
                    case "*":
                        res1 = Integer.parseInt(num1) * Integer.parseInt(num2);
                        break;
                    case "/":
                        res2 = Float.parseFloat(num1) / Float.parseFloat(num2);
                        //parseFloast은 실수 type으로 바꿈
                        //나누기 연산만 유일하게 res2에 결과가 들어감
                        break;
                }//switch

                //결과출력
                if( op.equals("/") ){
                    lb.setText( "" + res2 );
                }else{
                    lb.setText( "" + res1 );
                }
                break;
                
            case "C":
                num1 = "";
                num2 = "";
                op = "";
                res1 = 0;
                res2 = 0;
                phase = 0;
                lb.setText("0");
                break;

            default: //숫자버튼 클릭을 감지
                if( phase == 0 ){ //앞의수 먼저 입력받겠다
                    num1 += e.getActionCommand();
                    lb.setText(num1); //실시간으로 레이블에게 갱신

                }else{ //뒤의 수
                    num2 += e.getActionCommand();
                    lb.setText(num1 + " " + op + " " + num2);

                }
                break;    

        }//switch     
        
    }
}
//모양 잡는데만으로도 코드가 길어져서 감지자는 따로 클래스 만든다