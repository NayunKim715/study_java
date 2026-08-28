package ex2_fileinput;

import java.util.Scanner;

public class Ex3_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.close();//System.in을 닫는 게 아니라
        //정확한 타이밍에 딱 한번만 닫음 

        byte[] console = new byte[100];

        /*
        System.out.close();
        System.out.println("aaa");
        */

        try{
            System.out.print("입력 : ");
            System.in.read( console ); //스캐너로 받는 것과 동일하게 나오는 입력 스트림

            String res = new String( console );
            System.out.println( res.trim() );

        } catch (Exception e) {

        }

    }//main
}
//일시정지. 이지랄.
//catch 아래로 놓친 것 같음
