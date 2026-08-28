package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex1_FileInput {
    public static void main(String[] args) {
        String path = "C:/myFile/test.txt";
        File f = new File(path);

        if( f.exists() ){

            try{
            //파일과 연결된 입력스트림
            FileInputStream fis = new FileInputStream(f);

            int code = 0;

            //스트림은 더 이상 읽을 것이 없다면 파일의 끝(EOF)인
            //-1을 반환하게 되어있다.
            //한글은 2byte문자이기 때문에 한글을 읽는데 문제가 발생
            while( ( code = fis.read() ) != -1 ){
                System.out.print( (char)code );

            }//while

            //사용을 마친 스트림은 반드시 닫아줘야 한다
            fis.close();

        //}catch (FileNotFoundException e) {
         }catch (Exception e) {
           

        }finally{



            
        }
        }


    }//main
}

//7세기 룬 문자로 바꾼 것

//이 코드는 사실 잘못 되었어요