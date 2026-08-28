package ex4_work;

import java.io.FileInputStream;
import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {
        //C:/myFile/work3.txt에서 
        //사용자가 입력받은 값의 출현 빈도를 출력
        //------------------
        //입력 : 홍
        //홍의 출현 횟수 : 4
        Scanner sc = new Scanner(System.in);
        String path = "C:/myFile/work3.txt";
        File f = new File(path);
        byte[] read = new byte[ (int)f.length() ];
        FileInputStream fis = null;

        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }


    }//main
}
//8월 28일 1교시
