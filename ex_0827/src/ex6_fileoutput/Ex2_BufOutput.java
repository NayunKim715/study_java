package ex6_fileoutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream; 

public class Ex2_BufOutput {
    public static void main(String[] args) {
        String path = "C:/myFile/butOutput.txt";
        File f = new File(path);

        FileOutputStream fos = null;
        BufferedOutputStream bos = null;

        try {
            fos = new FileOutputStream(f);
            bos = new BufferedOutputStream(fos);

            String msg = "안녕하세요 반가워요 abcd";

            bos.write(msg.getBytes());
            // 기록하고자 하는 값을 물리적으로 저장하는 메서드
            bos.flush();
        } catch (Exception e) {

        } finally {
            try {
                // 역순으로 닫는 게 좋다
                if (fos != null) {
                    fos.close();
                }
                if (bos != null) {
                    bos.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }// main
}
// 놓침