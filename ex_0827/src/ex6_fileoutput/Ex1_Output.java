package ex6_fileoutput;

import java.io.File;
import java.io.FileOutputStream;

public class Ex1_Output {
    public static void main(String[] args) {
        File f = new File("C:/myFile/fileOutput.txt");
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream( f );
            String msg = "file output stream의 예제입니다";
            //문자열을 바이트로 쪼개놓는다
            fos.write( msg.getBytes() );
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            try {
                if( fos != null ){
                    fos.close();
                }
            } catch (Exception e) {
                // TODO: handle exception
            }

        }
    }//main
    
}

//fos 다음에 코드 놓침
//8월 28일 2교시. 1교시 결석
//미국은 단 한번도 가보지 않아서
//휴대용 게임기 집에 70개