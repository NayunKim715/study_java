package ex3_socket;

public interface Util {

    //String SS = UUID.randomUUID().toString();
    //서른 몇짜리의 문자열 난수를 만들어주는 메서드

    //String endToken = "!@#$%^&*"; //상수라서 무조건 대문자로
    String ENDTOKEN = "!@#$%^&*";

    //메시지 전송메서드
    private void sendData(){
        //String msg = input.getText().toString();
        String msg = input.getText().trim();
        if( msg.length() > 0 ){
            out.println(msg);
        }
        input.setText(""); //t : ""
    }    
}

//공유폴더 제공 이후로 타이핑
//종료하기전 서버에 접속해제요청
out.println( Util.ENDTOKEN);
