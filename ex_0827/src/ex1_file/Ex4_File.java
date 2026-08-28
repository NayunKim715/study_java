package ex1_file;

import java.io.File;

public class Ex4_File {
    public static void main(String[] args) {
        //String path = "c:/myfile/abc";
        //String path = "c:/java/myfile";
        //String path = "c:/myfile"
        String path = "c:/myfile/abc";
        File f = new File(path);

        //f가 참조하고 있는 경로가 물리적으로 존재하지 않을 때
        if( !f.exists() ){
           System.out.println("폴더를 생성합니다");
           f.mkdir(); //존재하지 않는 폴더를 만들어내는 기능,
        }

    }//main
}

//다시보기. 오후 12시