package ex7_filereader;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class Ex3_bufReader {
    public static void main(String[] args) {
        String path = "C:/myFile/work3.txt";
        File f = new File(path);

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            String msg;

            //BufferedReader가 줄 단ㅌ위로 내용을 읽어온다
            while( (msg = br.readLine()) != null ){
                //.read는 한 글자, .readLine은 한 줄 가져옴
                
                System.out.println(msg);
            }//while

        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            try {
                if( br != null ){
                    br.close();
                }

                if( fr != null ){
                    fr.close();
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

    }//main
}
